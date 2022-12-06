package lista04;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	
	public Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return "Nome: "    +nome+"\n"+
			   "Telefone: "+telefone+"\n"+
			   "E-mail: "  +email;
	}
	
}
