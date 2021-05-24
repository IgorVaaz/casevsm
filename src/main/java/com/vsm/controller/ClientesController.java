package com.vsm.controller;

import java.util.List;

import com.vsm.dto.ClientesDTO;
import com.vsm.entity.Clientes;
import com.vsm.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vsm.service.ClientesService;

@RestController
@RequestMapping({"/clientes"})
//@CrossOrigin

public class ClientesController {
	
	@Autowired
	private ClientesService clienteService;

	//listar todos
	@GetMapping
	public ResponseEntity<List<Clientes>> getClientes() {
		List<Clientes> clientes = clienteService.retornaClientes();
		return ResponseEntity.ok().body(clientes);

	}

	// pesquisa por ID
	@GetMapping("{clienteId}")
	public ResponseEntity<Clientes> findById(@PathVariable Integer clienteId){
		return  ResponseEntity.ok().body(clienteService.buscarPorId(clienteId));
	}

	// pesquisa por nome
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping("/nome/{nome}")
	public ResponseEntity<Clientes> findByNome(@PathVariable String nome){
		try{
			return ResponseEntity.ok().body(clienteService.buscarPorNome(nome));
		} catch (Exception e){

		}
		return null;
	}


	//Inserir
	@PostMapping
	public Clientes create(@RequestBody Clientes c){

		return clienteService.insert(c);
	}

	//Atualizar
	@RequestMapping(value = "/idcliente/{clienteId}", method = RequestMethod.PATCH)
	//@PatchMapping("{clienteId")
	public ResponseEntity<ClientesDTO> atualizaClientes(@RequestBody ClientesDTO clientes, @PathVariable("clienteId") Integer clienteId){
		return ResponseEntity.ok().body(new ClientesDTO(clienteService.atualizaCadastro(clientes, clienteId)));
	}

	@RequestMapping(value = "/{status}", method = RequestMethod.PATCH)
	public  ResponseEntity<ClientesDTO> atualizaStatus(@PathVariable("clienteId") Integer clienteId){
		return ResponseEntity.ok().body(new ClientesDTO(clienteService.atualizaStatus(clienteId)));
	}


}

