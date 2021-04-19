package projeto.unipe.model;

public class Conversor {
	
	public Conversor(String nome, String local) {
		super();
		this.nome = nome;
		this.local = local;
	}
	private String nome;
	private String local;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

}
