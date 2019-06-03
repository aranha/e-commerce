package Model;

public class Produtos {

	private int idProduto;
	private String nomeProduto;
	private double preco;
	
	public Produtos() {
		super();
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	public double getPrecoProduto () {
		return preco;
	}
}
