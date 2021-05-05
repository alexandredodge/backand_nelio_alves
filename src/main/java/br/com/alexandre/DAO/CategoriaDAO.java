package br.com.alexandre.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alexandre.domain.Categoria;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria,Integer>{

	//SOMENTE PARA PODER SER FEITO AS OPERAÇÕES DE CRUD
}
