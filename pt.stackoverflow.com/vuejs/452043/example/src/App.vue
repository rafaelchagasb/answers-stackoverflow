<template>
  <v-app>
    <v-data-table
      :headers="headers"
      :items="employees"
      :items-per-page="5"
      class="elevation-1"
  >
      <template v-slot:item.services="{ item }">
          <span v-for="serviceItem in item.services" :key="serviceItem.name">
            {{ serviceItem.name }}
          </span>
      </template>
  </v-data-table>
  </v-app>
</template>

<script>
import Playground from "./components/Playground";
import dados from "./data";

export default {
  name: "App",
  components: {
    Playground
  },
  data: () => ({
      dialog: false,
      pageTitle: 'Employees',
      headers: [
        {
          text: 'First Name',
          align: 'start',
          sortable: false,
          value: 'firstName',
        },
        { text: 'Last Name', value: 'lastName' },
        { text: 'Email', value: 'email' },
        { text: 'Phone', value: 'phone' },
        { text: 'Mobile Phone', value: 'mobilePhone' },
        { text: 'Gender', value: 'gender.name' },
        { text: 'Status', value: 'status.name' },
        { text: 'Services', value: 'services' },
        { text: 'Actions', value: 'action', sortable: false },
      ],
      search: '',
      employees: dados,
      genders: [],
      status: [],
      services:[],
      editedIndex: -1,
      editedItem: {},
      defaultItem: {},
    }),
};
</script>

