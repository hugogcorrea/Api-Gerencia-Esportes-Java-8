
<template>
    <div class="home">
        <ExercicioList />        
    </div>

    
</template>




<script lang="ts">
    import { Component, Vue } from 'vue-property-decorator';
    import ExercicioList from '@/components/ExercicioList.vue';

    @Component({
        components: {
            ExercicioList
        },
    })
    export default class Home extends Vue  {  }
</script>