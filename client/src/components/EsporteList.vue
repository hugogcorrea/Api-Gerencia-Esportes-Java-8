<template>
  <div class="esporte-list">
    <h1>Esporte List</h1>
    <div v-for="(esporte,index) in esportes">
      {{index}}
      {{ esporte.id }}
      {{ esporte.titulo }}
      {{ esporte.descricao }}
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import axios from 'axios';

export interface Esporte {
  id: string;
  titulo: string;
  descricao: string;
}

@Component
export default class Home extends Vue {
  public esportes: Esporte[] = [];

  private async created() {
    const response = await axios.get('/listarTodos');
    this.esportes = await response.data;
  }
}


</script>