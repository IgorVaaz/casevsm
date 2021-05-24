package com.vsm.entity;

import jdk.jshell.Snippet;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CLIENTES")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLIENTE_ID")
	private Integer clienteId;

	@ManyToOne
	@JoinColumn(name = "CIDADE_ID")
	private Cidades cidade;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "NUMERO")
	private Long numero;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Column(name = "CEP")
	private String cep;

	//@Column(name = "NOME_CIDADE")
	//private String nomeCidade;

	//@Column(name = "UF")
	//private String uf;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "STATUS")
	private boolean status;

}











