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

	ArrayList<Carrinho> carrinhosDeCompras = new ArrayList<Carrinho>();

	// insere produtos por cliente
	public void addProducts(Produtos prod, Clientes cliente) {
		for (int i = 0; i < carrinhosDeCompras.size(); i++) {
			if (cliente.getIdCliente() != carrinhosDeCompras.get(i).getIdCliente()) {

				carrinhosDeCompras.get(i).addIdCliente(cliente.getIdCliente());
				carrinhosDeCompras.get(i).addProduto(prod);

			} else {
				System.out.println("Cliente já possui carrinho");
			}
		}
	}

	// finalizar compra retornando o valor da compra
	public double finalizarCompra(int idCliente) {
		double preco = 0;
		for (int i = 0; i < carrinhosDeCompras.size(); i++) {
			if (carrinhosDeCompras.get(i).getIdCliente() == idCliente) {
				for (int j = 0; j < carrinhosDeCompras.get(i).getProdutos().size(); j++) {
					preco += carrinhosDeCompras.get(i).getProdutos().get(j).getPrecoProduto();

				}

			}
		} return preco;
	}
}
