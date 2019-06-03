package Model;

import java.util.ArrayList;

public class Carrinho {
	private int idCliente;
	private ArrayList<Produtos> produtos;
	
	public Carrinho() {
	
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void addIdCliente(int number) {
		this.idCliente = number;
	}
	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}
	public void addProduto(Produtos produto) {
		produtos.add(produto);
	}

	
}
