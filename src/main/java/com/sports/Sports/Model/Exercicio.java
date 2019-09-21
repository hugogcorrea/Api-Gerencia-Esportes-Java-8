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

@Document(collection= "esporte")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Exercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId _id;

	private String nome;

	private String tipo;

	public String get_id() {
		return _id.toHexString();
	}
}
