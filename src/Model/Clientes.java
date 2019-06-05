package Model;

public class Clientes {
	private int idCliente;
	private Carrinho carrinho;
	
	
	public Clientes() {
		super();
	}
	

	public Carrinho getCarrinho() {
		return carrinho;
	}


	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}


	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
