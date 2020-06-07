Você pode usar um form com [enctype multipart/form-data][1]. Ele suporta arquivos grandes, o envio de arquivos é feito por partes só que é gerenciado pelo navegador.

Disponibilizei um projeto no [GitHub][2] com um projeto em Net Core e com a barra de progresso do envio do arquivo para o servidor.


Deixei a versão simplificada do código aqui.

No caso do Net Core você precisa informar qual o tamanho máximo que o seu servidor aceita.

Program.cs

    public class Program
        {
            public static IWebHostBuilder CreateWebHostBuilder(string[] args) =>
                WebHost.CreateDefaultBuilder(args)
                    .UseStartup<Startup>()
                    .UseKestrel(options =>
                    {
                        options.Limits.MaxRequestBodySize = 209715200;
                    });
        }


Startup.cs

        public void ConfigureServices(IServiceCollection services)
        {
            
             services.Configure<FormOptions>(x =>
            {
              x.MultipartBodyLengthLimit = 1209715200;
            });
        }



Front

        <form method="post" enctype="multipart/form-data" 
    action="file" onsubmit="AJAXSubmit(this);return false;" >
                <input type="file" name="file"/>
                <input type="submit" value="Upload" />            
        </form>


        async function AJAXSubmit (form) {

        var formData = new FormData($(form)[0]);

        $.ajax({
            url: "file",
            type: 'POST',
            data: formData,
            async: true,
            success: function (data) {
                alert('Sent');
            },
            cache: false,
            contentType: false,
            processData: false
        });
       }


Backend

    [HttpPost]
        [RequestFormLimits(MultipartBodyLengthLimit = 1209715200)]
        [RequestSizeLimit(1209715200)]
        public async Task<ActionResult> Post(IFormFile file)
        {
            FileStream filestream = new FileStream("/tmp/" + file.FileName, FileMode.Create, FileAccess.Write);

            using (var memoryStream = new MemoryStream())
            {
                await file.CopyToAsync(memoryStream);
             
                memoryStream.WriteTo(filestream);
            }

            return Ok(new { count = 1, file.FileName, file.Length});
        }

[![inserir a descrição da imagem aqui][3]][3]


  [1]: https://www.w3.org/TR/html401/interact/forms.html#h-17.13.4.2
  [2]: https://github.com/rafaelchagasb/upload-net-core2-with-progress-bar
  [3]: https://i.stack.imgur.com/TNi8a.gif
 
