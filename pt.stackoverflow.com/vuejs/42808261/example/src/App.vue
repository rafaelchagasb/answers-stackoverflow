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
