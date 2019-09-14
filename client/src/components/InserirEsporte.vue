<template>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">Inserir um Esporte</div>
    
                    <div class="card-body">
                        <form @submit="formSubmit">
                        <strong>Titulo:</strong>
                        <input type="text" class="form-control" v-model="titulo">
                        <strong>Descricao:</strong>
                        <textarea class="form-control" v-model="descricao"></textarea>
    
                        <button class="btn btn-success">Submit</button>
                        </form>
                        <strong>Resultado:</strong>
                        <pre>
                        {{output}}
                        </pre>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
   
<script>
    import axios from 'axios';
    export default {
       
        data() {
            return {
              titulo: '',
              descricao: '',
              resultado: '',
              output:''
            };
        },
        methods: {
            formSubmit(e) {
                e.preventDefault();
                console.log(this.titulo)
                let currentObj = this;
                console.log(this.titulo, this.descricao)
                const response = axios.post('/inserir', {
                    titulo: this.titulo,
                    descricao: this.descricao
                })
                .then(function (response) {
                    currentObj.output = response.data;
                })
                .catch(function (error) {
                    currentObj.output = error;
                });
            }
        }
    }
</script>