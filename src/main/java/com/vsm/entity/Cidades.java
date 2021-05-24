package com.vsm.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CIDADES")	
public class Cidades {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "CIDADE_ID")
		private Integer cidadeId;
		
		@Column(name = "NOMECIDADE")
		private String nomeCidade;
		
		@Column(name = "UF")
		private String uf;


	/*public Cidades(String nomeCidade, String uf){
			nomeCidade = this.nomeCidade;
			uf = this.uf;
		}

	public Cidades(){

	}*/
		

		
}
