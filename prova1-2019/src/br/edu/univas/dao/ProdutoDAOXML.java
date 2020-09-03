package br.edu.univas.dao;

import java.util.List;

import br.edu.univas.vo.Produto;

public class ProdutoDAOXML implements ProdutoDAO {

	@Override
	public void insertProduto(Produto produto) {
		System.out.println("Inserindo produto em XML.");
	}

	@Override
	public List<Produto> listProdutos() {
		System.out.println("Listando produto em XML");
		return null;
	}

}
