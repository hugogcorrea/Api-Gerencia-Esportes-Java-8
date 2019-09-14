module.exports = {
  devServer: {
    port: 8081,
    proxy: {
      "/listarTodos": {
        target: "http://localhost:8080/v1/esporte",
        secure: false
      },
      "/inserir": {
        target: "http://localhost:8080/v1/esporte",
        secure: false
      }
    }
  }
};