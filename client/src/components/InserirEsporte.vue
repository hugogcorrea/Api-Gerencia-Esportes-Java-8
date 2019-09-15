<template>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">Inserir um Esporte</div>

                    <div class="card-body">

                        <form @submit="formSubmit">
                            <table class="table table-sm">
                                <tr>
                                    <td>
                                        Titulo
                                    </td>
                                    <td>
                                        Descricao
                                    </td>
                                    <td>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <input type="text" class="form-control" v-model="titulo">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" v-model="descricao">
                                    </td>
                                    <td>
                                        <button class="btn btn-success" >+</button>
                                    </td>
                                </tr>
                            </table>
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
                output: ''
            };
        },
        methods: {
            formSubmit(e) {
                e.preventDefault();
                let currentObj = this;
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