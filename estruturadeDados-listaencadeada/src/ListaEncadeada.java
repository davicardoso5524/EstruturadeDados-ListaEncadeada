public class ListaEncadeada {
    private No cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    // Métodos da lista encadeada

    public No getCabeca() {
        return cabeca;
    }

    // Inserir no início da lista
    public void inserirInicio(int dado) {
        No novoNo = new No(dado);
        novoNo.proximo = cabeca;
        cabeca = novoNo;
    }
	
	// Inserir no final da lista
	public void inserirFinal(int dado) {
		No novoNo = new No(dado);
		if (cabeca == null) {
			cabeca = novoNo;
		} else {
			No temp = cabeca;
			while (temp.proximo != null) {
				temp = temp.proximo;
			}
			temp.proximo = novoNo;
		}
	}
	
	// remover o primeiro elemento da lista
	public void removerInicio() {
		if (cabeca != null) {
			cabeca = cabeca.proximo;
		}
	}
	
	
	public void exibirLista() {
		No temp = cabeca;
		while (temp != null) {
			System.out.print(temp.dado + " -> ");
			temp = temp.proximo;
		}
		System.out.println("null");
	}	
}
