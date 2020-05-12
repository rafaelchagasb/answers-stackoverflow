Não sei qual a sua real necessidade com o uso do iframe, só posso te antecipar que é bem chato trabalhar com eles.

Existem muitas restrições e problemas advindos do uso de iframe nas páginas.

A questão do tamanho é um problema bem comum, principalmente se a página do iframe trabalhar com renderização de elementos na tela via Javascript/Jquery. Todas as vezes que a página interna recebe uma atualização de tamanho a página externa que possui o iframe teria que fazer a atualização do tamanho do iframe.

Outro problema nos tamanhos é na tela que possui o iframe, se o usuário abrir a página no computador e alterar o tamanho da janela você terá que recalcular o tamanho do iframe.

Verifique se é possível fazer sua solução sem utilizar iframe.

Se mesmo assim deseja trabalhar com iframes, segue o exemplo baseado no seu código utilizando o iframe para ajustar ao tamanho da tela.

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <style>
            html, body {margin: 0; height: 100%; overflow: hidden}
        </style>
    </head>
    <body>
        <iframe id="content" src="https://www.restaurantlogin.com/ordering/restaurant/menu?company_uid=5ae31451-e048-4713-af53-3a1f9c5d738a">
            </iframe>
    </body>
    </html>

    <script>
        window.onload = (event) => {
            var widthPage = document.getElementsByTagName('body')[0].clientWidth;
            var heightPage = document.getElementsByTagName('body')[0].clientHeight;

            document.getElementById('content').style.height = heightPage + "px";
            document.getElementById('content').style.width = widthPage + "px";
        };

    </script>