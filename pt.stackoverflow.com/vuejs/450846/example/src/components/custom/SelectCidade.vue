<template>
  <generic-select :values="cidades" v-model="data"/>
</template>

<script>
import GenericSelect from "../generics/GenericSelect";
import BaseInputValue from "../generics/BaseInputValue";

export default {
  name: "SelectCidade",
  extends: BaseInputValue,
  components: {
    GenericSelect
  },
  data: () => ({
    cidades: [
      {
        value: "1",
        text: "São Paulo"
      },
      {
        value: "2",
        text: "Rio de Janeiro"
      }
    ]
  })
};
</script>