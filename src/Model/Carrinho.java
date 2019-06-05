package Model;

import java.util.ArrayList;

public final class Carrinho {

	private ArrayList<Produtos> produtos;
	private static Carrinho unico = null;

	private Carrinho() {
	}

	public static synchronized Carrinho getInstance() {
		if (unico == null)
			unico = new Carrinho();

		return unico;
	}


	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}

	public void addProduto(Produtos produto) {
		produtos.add(produto);
	}

}
