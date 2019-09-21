package com.sports.Sports.Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

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
public class Datas {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId _id;

	private String descricao;
	
	private Date data;
	
	private Collection<Exercicio> exercicio = new ArrayList<Exercicio>();
	
	public String get_id() {
		return _id.toHexString();
	}

}
