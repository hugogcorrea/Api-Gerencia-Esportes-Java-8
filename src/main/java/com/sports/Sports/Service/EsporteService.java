package com.sports.Sports.Service;

import java.util.Collection;

import org.bson.types.ObjectId;

import com.sports.Sports.Model.Esporte;

public interface EsporteService {

	Esporte getById(ObjectId id);

	void deletarEsporte(ObjectId id);
	
	void inserirEsporte(Esporte esp);
	
	void atualizarEsporte(Esporte esp);
	
	Collection<Esporte> listarTodosEsportes();
}
