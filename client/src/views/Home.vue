
<template>
    <div class="home">
        <InserirEsporte />
        <EsporteList />

    </div>
</template>




<script lang="ts">
    import { Component, Vue } from 'vue-property-decorator';
    import EsporteList from '@/components/EsporteList.vue';
    import InserirEsporte from '@/components/InserirEsporte.vue';

    @Component({
        components: {
            EsporteList,
            InserirEsporte,
        },
    })
    export default class Home extends Vue  {  }
</script>