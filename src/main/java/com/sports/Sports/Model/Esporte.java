package com.sports.Sports.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Mongo database annotation.
@Document(collection= "esporte")
//cria automaticamente um construtor com todas os atributos da classe como argumento.
@AllArgsConstructor
//cria automaticamente um construtor vazio (sem argumentos).
@NoArgsConstructor
//cria automaticamente os métodos toString, equals, hashCode, getters e setters.
@Data
@ToString
public class Esporte{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId _id;

	private String titulo;
	 
	private String descricao;

	public String get_id() {
		return _id.toHexString();
	}
	

	
}
