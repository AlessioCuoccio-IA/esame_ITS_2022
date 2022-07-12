
public abstract class Frutto {
	
	protected String nome;
	protected Double peso;
	
	public Frutto(String nome, Double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	

}
