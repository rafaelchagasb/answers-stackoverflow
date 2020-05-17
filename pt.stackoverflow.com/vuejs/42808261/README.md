Porque você não tenta importar o seu componente desse jeito aqui. 

Dessa maneira você consegue usar o console para exibir o objeto do componente.

    <template>
      <div id="app">
        <v-layout/>
      </div>
    </template>
    
    <script>
    
    import VLayout from "./components/VLayout";
    
    console.log(VLayout);
    
    export default {
      name: "App",
      components: {
        VLayout
      }
    };
    </script>

Montei um exemplo no [codesandbox][1] e [versionei no Github][2] para uso futuro.

[![inserir a descrição da imagem aqui][3]][3]


  [1]: https://codesandbox.io/s/httpsptstackoverflowcomquestions241938c-5dgmi?file=/src/App.vue
  [2]: https://github.com/rafaelchagasb/answers-stackoverflow/tree/master/pt.stackoverflow.com/vuejs/42808261
  [3]: https://i.stack.imgur.com/K3Bia.png 
