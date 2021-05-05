package br.com.alexandre.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.domain.Categoria;
import br.com.alexandre.servicos.CategoriaServico;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaServico servico;
	
	@RequestMapping(value="/{id}" ,method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria categoria = servico.buscar(id);
		return ResponseEntity.ok(categoria);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> findAll(){
		List<Categoria> categorias = servico.buscarTodos();
		return categorias;
	} 
}
