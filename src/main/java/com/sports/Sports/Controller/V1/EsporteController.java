package com.sports.Sports.Controller.V1;

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

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("v1/esporte/")
public class EsporteController {

	@Autowired
	EsporteService serv;

	/**
	 * Method to save employees in the db.
	 * 
	 * @param emp
	 * @return
	 */
	@PostMapping(value = "/inserir")
	public String inserir(@RequestBody Esporte esp) {
		serv.inserirEsporte(esp);
		return "Esporte records created.";
	}

	/**
	 * Method to fetch all employees from the db.
	 * 
	 * @return
	 */
	@GetMapping(value = "/listarTodos")
	public Collection<Esporte> listarTodos() {
		return serv.listarTodosEsportes();
	}

	/**
	 * Method to fetch employee by id.
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/getbyid/{esporte-id}")
	public Esporte getById(@PathVariable(value = "esporte-id") int id) {
		return serv.getById(id);
	}

	/**
	 * Method to update employee by id.
	 * 
	 * @param id
	 * @param e
	 * @return
	 */
	@PutMapping(value = "/atualizar/{employee-id}")
	public String atualizar(@PathVariable(value = "esporte-id") int id, @RequestBody Esporte esp) {

		serv.atualizarEsporte(esp);
		return "Esporte record for esporte-id= " + id + " updated.";
	}

	/**
	 * Method to delete employee by id.
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/deletar/{employee-id}")
	public String delete(@PathVariable(value = "esporte-id") int id) {
		serv.deletarEsporte(id);
		return "Esporte record for esporte-id= " + id + " deleted.";
	}

}
