package com.sports.Sports.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Mongo database annotation.
@Document(collection= "esporte")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Esporte {

	@Id
	@GeneratedValue
	private ObjectId id;
	@Setter 
	private String titulo;
	@Setter 
	private String descricao;

}
