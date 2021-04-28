package src;

import java.util.Random;
import src.exceptions.SemDinheiroException;
import src.exceptions.VidaCheiaException;

public class Protagonista extends Personagem{
	Random rand = new Random();
	private double dinheiro;
	private int cura; //deve estar dentro da mochila
	
	public Protagonista(String n, int p) {
		super(n, p);
		this.dinheiro = 0;
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
            if(super.getVida()==5) throw new VidaCheiaException();
            else{
                super.setVida(super.getVida()+getCura());
            }
        }
	public void comprarCura()throws SemDinheiroException{
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
	            super.setDefesa(super.getDefesa()+1);
	        }else throw new SemDinheiroException(3);
	    }
       public String toString(){
           return super.toString()+"\nDINHEIRO:  $"+getDinheiro();
       }
}
