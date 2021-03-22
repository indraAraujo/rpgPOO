public class Loja{

	private int quantidade;
	private Produto produto;

	public Loja (Produto p, int q){
		produto = p;
		quantidade = q;
	}

	public String toString(){
		return String.format("%s. Quantidade solicitada: %s", produto, quantidade);
	}

