
package src;

public class Produto{
	private double preco;
	private int quantidade;
        private Descricao desc;

	public Produto ( double p, int quant, Descricao desc){
		preco = p;
		quantidade= quant;
                this.desc = desc;
	}

	public void setquant(int q){
		quantidade = q;
	}
        

        public int getQuantidade() {
            return quantidade;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }
        public Descricao getDesc() {
            return desc;
        }

        public void setDesc(Descricao desc) {
            this.desc = desc;
        }
              
	
	public String toString(){
		return String.format("Preço: MOEDADOJOGO %.2f. Estoque: %d", preco, quantidade);
	}
}


