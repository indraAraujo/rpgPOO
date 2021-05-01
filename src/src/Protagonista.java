import exceptions.SemDinheiroException;
import exceptions.VidaCheiaException;

public class Protagonista extends Personagem{
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
   
	public void comprarCura(int preco)throws SemDinheiroException{
	  if(getDinheiro() > preco){
	      setDinheiro(getDinheiro()-preco);
	      setCura(getCura()+1);
	  }else throw new SemDinheiroException(preco);
	}
	
	public void aumentarAtaque(int preco) throws SemDinheiroException{
	    if(getDinheiro()  > preco){
	       setDinheiro(this.getDinheiro()-preco);
	       super.setAtaque(super.getAtaque()+1);
	   }else throw new SemDinheiroException(preco);
	}
	
	public void aumentarDefesa(int preco) throws SemDinheiroException{
	     if(getDinheiro()  > preco){
	         setDinheiro(this.getDinheiro()-preco);
	         super.setDefesa(super.getDefesa()+1);
	     }else throw new SemDinheiroException(preco);
	}
    
	public String toString(){
       return super.toString()+"\nDINHEIRO:  $"+getDinheiro();
    }
}
