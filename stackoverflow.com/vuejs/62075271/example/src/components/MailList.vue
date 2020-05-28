<template>
  <div>
    <ul>
      <li v-for="i in inboxmail" @click="selectmail(i.from)" 
      v-bind:key="i.from">{{i.from}}:{{i.subject}}</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "MailList",
  props: ["inboxmail"],
  methods: {
    selectmail: function(value) {
      this.$emit("selectmail", value);
    }
  }
};
</script>