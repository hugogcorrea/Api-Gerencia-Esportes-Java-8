package com.sports.Sports.Service;

import java.util.Collection;

import org.bson.types.ObjectId;

import com.sports.Sports.Model.Esporte;

public interface EsporteService {

	Esporte getBy_id(ObjectId _id);

	void deletarEsporte(ObjectId _id);
	
	void inserirEsporte(Esporte esp);
	
	void atualizarEsporte(Esporte esp);
	
	Collection<Esporte> listarTodosEsportes();
}
