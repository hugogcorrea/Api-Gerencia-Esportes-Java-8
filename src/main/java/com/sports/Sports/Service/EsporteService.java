package com.sports.Sports.Service;

import java.util.Collection;

import com.sports.Sports.Model.Esporte;

public interface EsporteService {

	Esporte getById(int id);

	void deletarEsporte(int id);
	
	void inserirEsporte(Esporte esp);
	
	void atualizarEsporte(Esporte esp);
	
	Collection<Esporte> listarTodosEsportes();
}
