<template>
  <div id="app">
    <v-layout/>
  </div>
</template>

<script>

import VLayout from "./components/VLayout";

import { init as initApm } from '@elastic/apm-rum'

initApm({

  // Set required service name (allowed characters: a-z, A-Z, 0-9, -, _, and space)
  serviceName: 'TEste',

  // Set custom APM Server URL (default: http://localhost:8200)
  serverUrl: 'http://localhost:8200',
  active: true,
  environment: ``, // production, development, test, etc
  logLevel: `warn`, // Possible levels are: trace, debug, info, warn, error
  flushInterval: 500, // ms
  errorThrottleLimit: 20, // errors
  errorThrottleInterval: 30000, // ms
  transactionSampleRate: 1.0,
  distributedTracing: true,


  // Set service version (required for sourcemap feature)
  serviceVersion: '1.0'
});

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
