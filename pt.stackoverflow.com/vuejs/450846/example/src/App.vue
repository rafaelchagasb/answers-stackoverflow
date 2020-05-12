<template>
  <div id="app">
    <div class="col-12">
      <input-nome v-model="formValues.nome"/>
    </div>

    <div class="col-12">
      <input-mae v-model="formValues.nomeMae"/>
    </div>

    <div class="col-12">
      <input-telefone v-model="formValues.telefone"/>
    </div>

    <div class="col-12">
      <select-cidade v-model="formValues.cidade"/>
    </div>
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
  data: () => ({
    formValues: {
      nome: "Joao",
      nomeMae: "",
      telefone: "",
      celular: null,
      cidade: 1,
      convenios: []
      // Mais propriedades...
    }
  })
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
