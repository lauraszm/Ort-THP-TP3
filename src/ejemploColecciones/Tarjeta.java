package ejemploColecciones;

public class Tarjeta {
	private int numero;
	private String banco;
	private String tipo;
	
	public Tarjeta(int numero, String banco, String tipo) {
		this.numero = numero;
		this.banco = banco;
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
}
