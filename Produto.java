 public class Produto{

  private enum Descricao{

  VIDA("vida"),
  REGENERACAO("regeneração"),
  FORCA ("força");

  private String descricao;

  Descricao(String descricao) {
     this.descricao = descricao;
  }

  public String getDescricao() {
     return descricao;
  }
}
	private double preco;
	private int quantidade;

	public Produto ( double p, int quant){
		preco = p;
		quantidade= quant;
	}

	public void setquant(int q){
		quantidade = q;
	}
	
	public String toString(){
		return String.format("Preço: MOEDADOJOGO %.2f. Estoque: %d", preco, quantidade);
	}}
//metodos


	
