package br.com.alexandre.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexandre.domain.Produto;

public interface ProdutoDAO extends JpaRepository<Produto, Integer>{

}
