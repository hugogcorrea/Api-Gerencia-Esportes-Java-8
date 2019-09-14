<template>
  <div class="about">
    <h1>This is an about page</h1>
     <InserirEsporte/>
  </div>

   
</template>
<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import InserirEsporte from '@/components/InserirEsporte.vue';

@Component({
  components: {
    InserirEsporte,
  },
})
export default class Home extends Vue {}
</script>
