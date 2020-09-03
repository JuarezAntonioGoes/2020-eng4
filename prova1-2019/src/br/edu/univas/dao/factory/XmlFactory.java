package br.edu.univas.dao.factory;

import br.edu.univas.dao.PedidoDAO;
import br.edu.univas.dao.PedidoDAOXML;
import br.edu.univas.dao.ProdutoDAO;
import br.edu.univas.dao.ProdutoDAOXML;

public class XmlFactory implements AbstractFactory {

	@Override
	public PedidoDAO getPedidoDAO() {
		return new PedidoDAOXML();
	}

	@Override
	public ProdutoDAO getProdutoDAO() {
		return new ProdutoDAOXML();
	}

}
