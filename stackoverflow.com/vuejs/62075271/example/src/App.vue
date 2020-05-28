<template>
  <div id="app">
    <mail-list v-bind:inboxmail="inbox" 
      @selectmail="setSelectedMail($event)">
    </mail-list>

    Selected: {{selectedMail}}
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld";
import MailList from "./components/MailList";

export default {
  name: "App",
  components: {
    HelloWorld, MailList
  },
  data: function(){
    return {
      inbox: [{
        from: 'test1@test.com',
        subject: 'Hi'
      },{
        from: 'test2@test.com',
        subject: 'How are you?'
      }],
      selectedMail: {}
    };
  },
  methods: {
    setSelectedMail: function(mail) {
      this.selectedMail = mail;
    }
  } //end methods
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
