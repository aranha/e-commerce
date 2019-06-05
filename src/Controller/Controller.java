package Controller;

import java.util.ArrayList;

import Model.Carrinho;
import Model.Clientes;
import Model.Produtos;

public class Controller {
		
	// retorna produtos por cliente
	public ArrayList<Produtos> queryProducts(String nome, ArrayList<Produtos> listProd) {
		ArrayList<Produtos> result = null;
		for (int i = 0; i < listProd.size(); i++) {
			if (listProd.get(i).getNomeProduto().contentEquals(nome)) {
				result.add(listProd.get(i));
			}
		}
		return result;
	}

	// insere produtos por cliente
	public void addProducts(Produtos prod, Clientes cliente) {
		
	}

	// finalizar compra retornando o valor da compra
	public double finalizarCompra(int idCliente) {
		return 'S';
	}
}
