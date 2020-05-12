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