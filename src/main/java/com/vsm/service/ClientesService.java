package com.vsm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.mysql.cj.xdevapi.Client;
import com.vsm.dto.ClientesDTO;
import com.vsm.entity.Cidades;
import com.vsm.repository.CidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vsm.entity.Clientes;
import com.vsm.repository.ClientesRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository clienteRepository;

	//listar todos
	public List<Clientes> retornaClientes() {
		return clienteRepository.findAll();
	}


	//busca por ID
	public Clientes buscarPorId(Integer clienteId){

		return clienteRepository.findById(clienteId).orElseThrow();
	}

	//busca por nome
	public Clientes buscarPorNome(String nome) throws Exception{
			return clienteRepository.findByNome(nome);
	}

	//inserir
	public Clientes insert(Clientes c){
		return clienteRepository.save(c);

	}

	public Clientes atualizaCadastro(ClientesDTO clientes, Integer clienteId) {
		Clientes verificarCliente = clienteRepository.findByClienteId(clienteId);
		if(verificarCliente.getClienteId() != null){

			if (clientes.getBairro() != null){
				verificarCliente.setBairro(clientes.getBairro());
			}
			if (clientes.getCep() != null){
				verificarCliente.setCep(clientes.getCep());
			}
			if (clientes.getCpf() != null){
				verificarCliente.setCpf(clientes.getCpf());
			}
			if (clientes.getEmail() != null){
				verificarCliente.setEmail(clientes.getEmail());
			}
			if (clientes.getEndereco() != null){
				verificarCliente.setEndereco(clientes.getEndereco());
			}
			if (clientes.getNome() != null){
				verificarCliente.setNome(clientes.getNome());
			}

			if (clientes.getCidade() != null){
				verificarCliente.setCidade(clientes.getCidade());
			}

			/*if (clientes.getNomeCidade() != null){
				verificarCliente.setNomeCidade(clientes.getNomeCidade());
			}*/
			/*if (clientes.getNumero() != null){
				verificarCliente.setNumero(clientes.getNumero());
			}
			if(clientes.isStatus() != null){

			}*/
			/*if (clientes.getUf() != null){
				verificarCliente.setUf(clientes.getUf());
			}*/
		}

		return clienteRepository.save(verificarCliente);
	}

	public Clientes atualizaStatus(Integer clienteId) {
		Clientes verificarCliente = clienteRepository.findByClienteId(clienteId);
		if (verificarCliente.isStatus()){
			verificarCliente.setStatus(true);
		} else{
			verificarCliente.setStatus(false);
		}
		return clienteRepository.save(verificarCliente);
	}

}
