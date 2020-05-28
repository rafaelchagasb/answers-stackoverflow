import Vue from "vue";
import App from "./App.vue";

Vue.config.productionTip = false;

Vue.component('mail-list', {
  props: ['inboxmail'],
  methods: {
    selectmail: function(){
      this.$emit('selectmail', this.mail);
    }

  },
  template:
  `
  <div>
    <ul>
      <li v-for="i in inboxmail" @click="selectedmail">
      {{i.from}}:{{i.subject}}
      </li>
    </ul>
  </div>
  `
  });



new Vue({
  render: h => h(App)
}).$mount("#app");
