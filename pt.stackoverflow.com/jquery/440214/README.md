Uma abordagem mais elegante que você pode usar seria o data attributes.

https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_global_data

https://api.jquery.com/data/


Montei um exemplo com essa abordagem utilizando os dados da sua tabela.

https://jsfiddle.net/3gxdwy9c/1/




Codigo HTML

    <div id="container">
    
    
    </div>
    

Codigo JS/JQUERY

    var dados = [
    	{
      	id: 1,
      	nome:'Joao da Silva',
        cpf: '999.999.999-99',
        telefone: '11 3023-2323'
      },
      {
      	id: 2,
      	nome:'Maria Souza',
        cpf: '888.888.888-88',
        telefone: '11 3023-2323'
      }
    ]
    
    $(document).ready(function(){
    
      var $tabela = $('<table>');
    
      $tabela.append(montarThead());
      
      $tabela.append(montarConteudo());
    
      $('#container').html($tabela);
      
      $('body').on('click', '.btnExcluir', function(e){
      
      	var id = $(this).parent().data('id');
        
        alert(id);
      
      });
    
    })
    
    function montarThead(){
    
    	var $thead = $('<thead>');
      
      var $tr = $('<tr>').append($('<th>Nome</th>')).append($('<th>CPF</th>')).append($('<th>Telefone</th>'));
      
      $thead.html($tr);
      
      return $thead;
    }
    
    function montarConteudo(){
    
    	var $tbody = $('<tbody>');
    
    	for(var i = 0; i < dados.length; i++){
      
        var $linha = $('<tr>');
        
        $linha.data('id', dados[i].id);
        
        $linha.append($('<td>' + dados[i].nome + '</td>'));
        
        $linha.append($('<td>' + dados[i].cpf + '</td>'));
        
        $linha.append($('<td>' + dados[i].telefone + '</td>'));
        
        var $botaoExcluir = $('<input>').attr({ type: 'button', name:'btn1', value:'Excluir', class:'btnExcluir' });
        
        $linha.append($botaoExcluir);
        
        $tbody.append($linha);
      
      }
      
      return $tbody;
      
    }

