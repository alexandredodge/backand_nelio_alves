package br.com.alexandre.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.domain.Categoria;
import br.com.alexandre.repositories.CategoriaRepository;
import br.com.alexandre.servicos.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaDAO;
	
	public Categoria find(Integer id){
		Optional<Categoria> retorno = categoriaDAO.findById(id);
		return retorno.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

	public List<Categoria> finAll() {
		List<Categoria> retTodos = categoriaDAO.findAll();
		return retTodos;
	}
	
	public void salvar(Categoria categoria) {
		categoriaDAO.save(categoria);
	}
}
