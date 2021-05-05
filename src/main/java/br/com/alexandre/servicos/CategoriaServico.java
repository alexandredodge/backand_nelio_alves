package br.com.alexandre.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.DAO.CategoriaDAO;
import br.com.alexandre.domain.Categoria;

@Service
public class CategoriaServico {

	@Autowired
	private CategoriaDAO categoriaDAO;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> retorno = categoriaDAO.findById(id);
		return retorno.orElse(null);
	}

	public List<Categoria> buscarTodos() {
		List<Categoria> retTodos = categoriaDAO.findAll();
		return retTodos;
	}
}
