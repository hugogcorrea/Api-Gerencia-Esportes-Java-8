<template>
    <div class="container">

        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">Lista Dos Esportes </div>

                    <div class="card-body">
                        <table class="table table-striped table-hover table-sm">
                            <thead class="thead-dark">
                                <tr>
                                    <th>#</th>
                                    <th>Título</th>
                                    <th>Descrição</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr v-for="(esporte,index) in esportes">
                                    <td> {{index}} </td>
                                    <td> {{ esporte.titulo }}</td>
                                    <td> {{ esporte.descricao }}</td>
                                    <td><button type="button" class="btn btn-outline-danger btn-sm"
                                            @click="apagar(esporte._id)">x</button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script lang="ts">
    import { Component, Vue } from 'vue-property-decorator';
    import axios from 'axios';

    export default {
        data() {
            return {
                esportes: [],
                esporte: {
                    _id: '',
                }
            }
        },
        mounted() {
            this.listarTodos()
        },
        methods: {
            apagar: function (_id) {
                axios.delete('/deletar/' + _id);
                this.listarTodos()
            },
            listarTodos: function () { axios.get('/listarTodos').then(response => (this.esportes = response.data)) }
        }

    };

    // const created = async () => {
    // const createds = await createds()

    //   const response = await axios.get('/listarTodos');
    //           esportes = await response.data;
    // }

    // created();






</script>