package br.edu.univas.dao.factory;

import br.edu.univas.dao.PedidoDAO;
import br.edu.univas.dao.ProdutoDAO;

public interface AbstractFactory {

	PedidoDAO getPedidoDAO();
	
	ProdutoDAO getProdutoDAO();
	
}
