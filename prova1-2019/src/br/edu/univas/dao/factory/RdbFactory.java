package br.edu.univas.dao.factory;

import br.edu.univas.dao.PedidoDAO;
import br.edu.univas.dao.PedidoDAORDB;
import br.edu.univas.dao.ProdutoDAO;
import br.edu.univas.dao.ProdutoDAORDB;

public class RdbFactory implements AbstractFactory {

	@Override
	public PedidoDAO getPedidoDAO() {
		return new PedidoDAORDB();
	}

	@Override
	public ProdutoDAO getProdutoDAO() {
		return new ProdutoDAORDB();
	}

}
