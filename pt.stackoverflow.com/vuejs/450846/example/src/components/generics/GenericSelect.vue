<template>
  <div>
    <select v-model="data">
      <option
        v-for="option in values"
        v-bind:value="option.value"
        v-bind:key="option.value"
      >{{ option.text }}</option>
    </select>
  </div>
</template>


<script>
import BaseInputValue from "./BaseInputValue";

export default {
  name: "GenericSelect",
  props: ["values"],
  extends: BaseInputValue
};
</script>