Você pode separar os componentes para que você possa trabalhar de uma maneira mais isolada com a lógica de cada um.

[![inserir a descrição da imagem aqui][1]][1]


  [1]: https://i.stack.imgur.com/zZNTi.png


Fiz um pequeno exemplo de como você poderia separar os seus components.

O exemplo funcionando está aqui https://codesandbox.io/s/httpsptstackoverflowcomquestions450846-dm6g1?file=/src/App.vue

    <!-- App.vue -->
    
    <template>
      <div id="app">
        <input-nome v-model="formValues.nome"/>
        <input-mae v-model="formValues.nomeMae"/>
        <input-telefone v-model="formValues.telefone"/>
        <select-cidade v-model="formValues.cidade"/>
      </div>
    </template>
    
    <script>
    import InputNome from "./components/custom/InputNome";
    import InputMae from "./components/custom/InputMae";
    import InputTelefone from "./components/custom/InputTelefone";
    import SelectCidade from "./components/custom/SelectCidade";
    
    export default {
      name: "App",
      components: {
        InputNome,
        InputMae,
        InputTelefone,
        SelectCidade
      },
    </script>
    
    <!-- InputMae.vue -->
    
    <template>
      <input v-model="data" placeholder="Nome da mãe">
    </template>
    
    <script>
    
    import BaseInputValue from "../generics/BaseInputValue.vue";
    
    export default {
      name: "InputMae",
       extends: BaseInputValue
    };
    </script>
    
    <!-- InputNome.vue -->
    
    <template>
      <input v-model="data" placeholder="Nome completo">
    </template>
    
    
    <script>
    import BaseInputValue from "../generics/BaseInputValue.vue";
    
    export default {
      name: "InputNome",
       extends: BaseInputValue
    };
    </script>
    
    <!-- BaseInputValue -->
    
    <script>
    export default {
      name: "BaseInputValue",
      props: ['value'],
      computed : {
        data: {
          get: function(){
            return this.value;
          },
          set: function(newValue){
            this.$emit('input', newValue)
          }
        }
      }
    };
    </script>