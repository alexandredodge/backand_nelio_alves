package br.com.alexandre.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.domain.Categoria;
import br.com.alexandre.services.CategoriaService;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {

	@Autowired
	private CategoriaService servico;
	
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
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@PathVariable Categoria cat) {
		servico.salvar(cat);
	}
}
