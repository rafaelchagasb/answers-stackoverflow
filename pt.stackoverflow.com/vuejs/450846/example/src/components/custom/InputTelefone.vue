<template>
  <input v-model="data" placeholder="Telefone">
</template>

<script>

import BaseInputValue from "../generics/BaseInputValue.vue";

export default {
  name: "InputTelefone",
   extends: BaseInputValue
};
</script>