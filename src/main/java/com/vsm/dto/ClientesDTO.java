package com.vsm.dto;

import com.sun.istack.NotNull;
import com.vsm.entity.Cidades;
import com.vsm.entity.Clientes;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class ClientesDTO {

	//private Integer id;
	
	@NotNull
	private String nome;
	
	//private String uf;
	
	//private String nomeCidade;
	
	@NotNull
	private String cpf;

	private Cidades cidade;

	private String endereco;
	
	private long numero;
	
	private String bairro;
	
	private String cep;
	
	private String telefone;
	
	private String email;

	private boolean status;

	public ClientesDTO (Clientes clientes){
		//id = clientes.getClienteId();
		nome = clientes.getNome();
		//uf = clientes.getUf();
		//nomeCidade = clientes.getNomeCidade();
		cpf = clientes.getCpf();
		endereco = clientes.getEndereco();
		numero = clientes.getNumero();
		bairro = clientes.getBairro();
		cep = clientes.getCep();
		telefone = clientes.getTelefone();
		email = clientes.getEmail();
		status = clientes.isStatus();
		cidade = clientes.getCidade();
	}

    public ClientesDTO() {

    }

	public static List<ClientesDTO> converterToList(List<Clientes> listClientes) {
		return listClientes.stream().map(ClientesDTO::new).collect(Collectors.toList());
	}
		
}
