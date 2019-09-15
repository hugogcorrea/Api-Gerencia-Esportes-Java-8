package com.sports.Sports.Controller.V1;

import java.util.Collection;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sports.Sports.Model.Esporte;
import com.sports.Sports.Service.EsporteService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1/esporte")
public class EsporteController {

	@Autowired
	EsporteService serv;

	
	@PostMapping(value = "/inserir")
	public String inserir(@RequestBody Esporte esp) {
		serv.inserirEsporte(esp);
		//return "Esporte criado com sucesso.";
		return esp.getTitulo() + " Cadastrado com sucesso. ";
	}
	


	@GetMapping(value = "/listarTodos")
	public Collection<Esporte> listarTodos() {
		return serv.listarTodosEsportes();
	}

	@GetMapping(value = "/getbyid/{esporte-id}")
	public Esporte getById(@PathVariable(value = "esporte-id") ObjectId _id) {
		return serv.getBy_id(_id);
	}

	
	@PutMapping(value = "/atualizar/{esporte-id}")
	public String atualizar(@PathVariable(value = "esporte-id") ObjectId _id, @RequestBody Esporte esp) {

		serv.atualizarEsporte(esp);
		return "Esporte atualiz para esporte-id= " + _id + " atualizado.";
	}

	
	@DeleteMapping(value = "/deletar/{esporte-id}")
	public String delete(@PathVariable(value = "esporte-id") ObjectId _id) {
		serv.deletarEsporte(_id);
		return "Esporte esporte-id= " + _id + " excluído.";
	}
	

}
