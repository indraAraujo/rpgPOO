import src.exceptions.SemDinheiroException;

public class Protagonista extends Personagem{
	
	private int dinheiro;
	private int cura;
	
	public Protagonista(int p, int v, int d, int a, int din, int c) {
		super(p, v, d, a);
		this.dinheiro = din;
		this.cura = c;
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getCura() {
		return cura;
	}

	public void setCura(int cura) {
		this.cura = cura;
	}
	
	 public void comprarCura()throws SemDinheiroException{
	       double dinheiro=0.0;//variavel provisória
	       int cura=0; //variavel provisória
	       if(dinheiro > 2.5){
	           dinheiro-=2.5;
	           cura++;
	       }else throw new SemDinheiroException(2.5);
	    }
	    
	    public void aumentarAtaque() throws SemDinheiroException{
	        double dinheiro=0.0;//variavel provisória
	        int ataque=0; //variavel provisória
	        if(dinheiro > 3){
	            dinheiro-=3;
	            ataque++;
	        }else throw new SemDinheiroException(3);
	    }
	    public void aumentarDefesa() throws SemDinheiroException{
	        double dinheiro=0.0;//variavel provisória
	        int defesa=0; //variavel provisória
	        if(dinheiro > 3){
	            dinheiro-=3;
	            defesa++;
	        }else throw new SemDinheiroException(3);
	    }
	}
	
	

}
