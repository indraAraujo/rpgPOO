package src;
public class Produto{
	private double preco;
	private int quantidade;
        private Enum desc;

    public Produto ( Enum desc){
        this.desc = desc;
    }

    public void setQuantidade(int q){
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

    public String getDescStr(){
        return String.valueOf(getDesc());
    }
    public Enum getDesc() {
        return desc;
    }
    
    public void setDesc(Enum desc) {
           this.desc = desc;
    }

}


