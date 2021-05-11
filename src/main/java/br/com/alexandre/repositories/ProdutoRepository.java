package br.com.alexandre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexandre.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
