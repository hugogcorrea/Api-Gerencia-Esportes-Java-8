package com.sports.Sports.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Mongo database annotation.
@Document(collection= "employee")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Esporte {

	@Id
	@GeneratedValue
	private Integer id;
	private String titulo;
	private String descricao;

}
