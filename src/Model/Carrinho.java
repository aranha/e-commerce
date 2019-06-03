package Model;

import java.util.ArrayList;

public class Carrinho {
	private int idCarrinho;
	private ArrayList<Produtos> produtos;
	
	public Carrinho() {
	
	}
	public int getIdCarrinho() {
		return idCarrinho;
	}
	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}
	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produtos> produtos) {
		this.produtos = produtos;
	}

	
}
