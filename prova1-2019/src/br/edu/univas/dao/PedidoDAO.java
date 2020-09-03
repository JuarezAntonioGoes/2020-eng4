package br.edu.univas.dao;

import java.util.List;

import br.edu.univas.vo.Pedido;

public interface PedidoDAO {

	void insertPedido(Pedido pedido);
	
	List<Pedido> listPedidos();
	
}
