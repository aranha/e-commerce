package View;

public class DecoratorJanelaInicial {

	

class JanelaSimples extends DecoratorJanelaInicial {

	public void draw() {
	        System.out.println("desenha uma janela");
	    }
}

abstract class JanelaDecoratorJanelaInicial extends DecoratorJanelaInicial {

	protected DecoratorJanelaInicial janelaDecorada;

	public JanelaDecoratorJanelaInicial(DecoratorJanelaInicial janelaDecorada) {
		this.janelaDecorada = janelaDecorada;
	}

	}	
}
