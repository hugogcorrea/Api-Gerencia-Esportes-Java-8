<template>
    <div class="container">

        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">Lista Dos Esportes </div>

                    <div class="card-body">

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
                                    <button class="btn btn-success" @click="inserir">+</button>
                                </td>
                            </tr>
                        </table>

                        <strong>Resultado:</strong>
                        <pre>
                            {{output}}
                        </pre>
                        <table class="table table-striped table-hover table-sm">
                            <thead class="thead-dark">
                                <tr>
                                    <th>#</th>
                                    <th>Título</th>
                                    <th>Descrição</th>
                                    <th></th>
                                     <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr v-for="(esporte,index) in esportes">
                                    <td> {{index}} </td>
                                    <td> {{ esporte.titulo }}</td>
                                    <td> {{ esporte.descricao }}</td>
                                    <td>       
                                        <a href="#" @click="apagar(esporte._id)">
                                            <img src="../images/excluir.png" title="Excluir">  
                                        </a>                                   
                                    </td>
                                    <td>                                      
                                        <a href="#" v-b-modal.modal-1 @click="enviarDados(esporte._id, esporte.titulo, esporte.descricao)">
                                            <img src="../images/editar.png" title="Editar">  
                                        </a>
                                    </td>

                                </tr>
                            </tbody>
                        </table>
                        <b-modal id="modal-1" title="Editar" ok-only ok-variant="secondary" ok-title="Cancelar">
                            <table class="table">
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
                                        <input type="text" class="form-control" v-model="titulo_modal">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" v-model="descricao_modal">
                                    </td>
                                    <td>
                                        <button class="btn btn-success" @click="alterar">Salvar</button>
                                    </td>
                                </tr>
                            </table>

                        </b-modal>
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
                _id: '',
                titulo: '',
                descricao: '',
                output: '',
                id_modal: '',
                titulo_modal: '',
                descricao_modal: '',
            }
        },
        mounted() {
            this.listarTodos()
        },
        methods: {
            apagar: function (_id) {
                axios.delete('/deletar/' + _id).then(response =>{
                    alert(response.data);
                    this.listarTodos();
                } );           
                
            },
            listarTodos: function () {             
                axios.get('/listarTodos').then(response => (this.esportes = response.data))            
            },
            inserir: function () {
                let currentObj = this;
                const response = axios.post('/inserir', {
                    titulo: this.titulo,
                    descricao: this.descricao
                }).then(response => {
                    currentObj.output = response.data;
                    this.listarTodos();
                    this.titulo = '';
                    this.descricao = ''; 
                }).catch(function (error) {
                    currentObj.output = error;
                });                
            },
            enviarDados: function (_id, titulo, descricao) {
                this.id_modal = _id;
                this.titulo_modal = titulo;
                this.descricao_modal = descricao;
            },
            alterar: function () {
                let currentObj = this;
                const response = axios.put('/atualizar/' + this.id_modal, {
                    _id: this.id_modal,
                    titulo: this.titulo_modal,
                    descricao: this.descricao_modal                    
                }).then(response =>  {
                    currentObj.output = response.data;
                    this.listarTodos();
                }).catch(function (error) {
                    currentObj.output = error;
                });                
            },
        }
    };

    // const created = async () => {
    // const createds = await createds()

    //   const response = await axios.get('/listarTodos');
    //           esportes = await response.data;
    // }

    // created();






</script>