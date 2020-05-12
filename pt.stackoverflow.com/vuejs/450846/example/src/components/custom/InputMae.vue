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