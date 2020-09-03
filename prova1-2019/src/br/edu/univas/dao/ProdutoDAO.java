package br.edu.univas.dao;

import java.util.List;

import br.edu.univas.vo.Produto;

public interface ProdutoDAO {

	void insertProduto(Produto produto);
	
	List<Produto> listProdutos();
	
}
