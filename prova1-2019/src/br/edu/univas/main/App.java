package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Pedido;
import br.edu.univas.vo.PedidoDAORDB;
import br.edu.univas.vo.PedidoDAOXML;
import br.edu.univas.vo.Produto;
import br.edu.univas.vo.ProdutoDAORDB;
import br.edu.univas.vo.ProdutoDAOXML;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 - XML");
		System.out.println("2 - RDB");
		System.out.print("Digite sua opção:");
		int option = scanner.nextInt();
		
		if (option == 1) {
			PedidoDAOXML pedidoDaoXml = new PedidoDAOXML();
			pedidoDaoXml.insertPedido(new Pedido());
			pedidoDaoXml.listPedidos();
			
			ProdutoDAOXML produtoDaoXml = new ProdutoDAOXML();
			produtoDaoXml.insertProduto(new Produto());
			produtoDaoXml.listProdutos();
		} else if (option == 2) {
			PedidoDAORDB pedidoDaoRdb = new PedidoDAORDB();
			pedidoDaoRdb.insertPedido(new Pedido());
			pedidoDaoRdb.listPedidos();
			
			ProdutoDAORDB produtoDaoRdb = new ProdutoDAORDB();
			produtoDaoRdb.insertProduto(new Produto());
			produtoDaoRdb.listProdutos();
		}
		
		scanner.close();
	}
}
