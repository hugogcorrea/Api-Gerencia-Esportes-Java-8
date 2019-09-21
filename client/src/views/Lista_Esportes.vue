
<template>
    <div class="home">
        <EsporteList />        
    </div>

    
</template>




<script lang="ts">
    import { Component, Vue } from 'vue-property-decorator';
    import EsporteList from '@/components/EsporteList.vue';

    @Component({
        components: {
            EsporteList
        },
    })
    export default class Home extends Vue  {  }
</script>