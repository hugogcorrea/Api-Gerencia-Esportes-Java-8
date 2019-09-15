package com.sports.Sports.Service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.Sports.Model.Esporte;
import com.sports.Sports.Repository.EsporteRepository;

import lombok.AllArgsConstructor;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EsporteServiceImpl implements EsporteService {
	@Autowired
	private EsporteRepository esporteRepository;

	@Override
	public void inserirEsporte(Esporte esp) {
		esporteRepository.save(esp);
	}

	@Override
	public Esporte getBy_id(ObjectId _id) {
		return esporteRepository.findById(_id).get();
	}

	@Override
	public void deletarEsporte(ObjectId _id) {
		esporteRepository.deleteById(_id);
	}

	@Override
	public void atualizarEsporte(Esporte esp) {
		esporteRepository.save(esp);
	}

	@Override
	public Collection<Esporte> listarTodosEsportes() {
		return esporteRepository.findAll();
	}

}
