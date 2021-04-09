package src;

import src.exceptions.VidaCheiaException;

public class Protagonista extends Personagem{
	
	private double dinheiro;
	private int cura; //deve estar dentro da mochila
	
	public Protagonista(String n, int p, int v, int d, int a, int din) {
		super(n, p, v, d, a);
		this.dinheiro = din;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getCura() {
		return cura;
	}

	public void setCura(int cura) {
		this.cura = cura;
	}
        
        public void usarCura()throws VidaCheiaException{
            if(getVida()==5) throw new VidaCheiaException();
            else{
                setVida(getVida()+getCura());
            }
        }
	
	/* public void comprarCura()throws SemDinheiroException{
	       if(this.getDinheiro() > 2.5){
	           this.setDinheiro(this.getDinheiro()-2.5);
	           this.setCura(this.getCura()+1);
	       }else throw new SemDinheiroException(2.5);
	    }
	    public void aumentarAtaque() throws SemDinheiroException{
	        if(this.getDinheiro()  > 3){
	            this.setDinheiro(this.getDinheiro()-3);
	            this.setAtaque(this.getAtaque()+1);
	        }else throw new SemDinheiroException(3);
	    }
	    public void aumentarDefesa() throws SemDinheiroException{
	        if(this.getDinheiro()  > 3){
	            this.setDinheiro(this.getDinheiro()-3);
	            this.setDefesa(this.getDefesa()+1);
	        }else throw new SemDinheiroException(3);
	    }*/
       public String toString(){
           return super.toString()+"\nDINHEIRO:  $"+getDinheiro();
       }
}
