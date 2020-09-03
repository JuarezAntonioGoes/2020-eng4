package br.edu.univas.dao;

import java.util.List;

import br.edu.univas.vo.Pedido;

public class PedidoDAORDB implements PedidoDAO {

	@Override
	public void insertPedido(Pedido pedido) {
		System.out.println("Inserindo pedido em arquivo RDB");
	}

	@Override
	public List<Pedido> listPedidos() {
		System.out.println("Listando pedido em arquivo RDB");
		return null;
	}
}
