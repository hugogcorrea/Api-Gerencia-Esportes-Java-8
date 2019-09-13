package com.sports.Sports.Repository;


import com.sports.Sports.Model.Esporte;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsporteRepository extends  MongoRepository<Esporte, Integer>{

}
