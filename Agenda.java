package lista04;

public class Agenda {
	private int tamanhoMaximo;
	private int posicaoAtual;
	private Pessoa[] contatos;
	//private ArrayList<Pessoa> contatos;
	
	public Agenda(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
		this.posicaoAtual = 0;
		contatos = new Pessoa[tamanhoMaximo];
	}
	
	public void adicionaContato(Pessoa p) {
		if(posicaoAtual<tamanhoMaximo) {
			contatos[posicaoAtual] = p; 
			posicaoAtual++;
		}
		else {
			System.out.println("Capacidade máxima atingida. Não foi possível adicionar o contato.");
		}	
	}
	
	public void removeContato(String nome) {
		int posicao = buscaContato(nome);
		
		if(posicao == -1)
			return;
		
		// fazer os deslocamentos para não deixar "buracos" no vetor
		// "shift"
		for(int i=posicao; i<posicaoAtual; i++) {
			contatos[i] = contatos[i+1];
		}
		
		posicaoAtual--;
		
	}
	
	private int buscaContato(String nome) {
		
		if(posicaoAtual == 0) {
			System.out.println("Agenda vazia.");
			return -1;
		}
		
		for(int i=0; i<posicaoAtual; i++) {
			Pessoa p = contatos[i];
			if(p.getNome().equals(nome))
				return i;
		}
		
		System.out.println("Não existe contato com o nome informado.");
		return -1;
	}
	
	public void imprimeAgenda() {
		for(int i=0; i<posicaoAtual; i++) {
			Pessoa p = contatos[i];
			System.out.println(p);
		}
	}
	
}
