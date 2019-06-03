package View;

import Model.Clientes;
import Model.Produtos;

public class App {

	public static void main(String[] args) {
			Clientes cliente = new Clientes();
			cliente.setIdCliente(012);
			
			Produtos produto = new Produtos();
			produto.setIdProduto(1);
			produto.setNomeProduto("iPhone XS MAX 512 GB");
			produto.setPreco(9899.99);
	}
}
