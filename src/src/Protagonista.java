package src;

import exceptions.SemDinheiroException;
import exceptions.VidaCheiaException;
import java.util.LinkedList;
import src.exceptions.SemProdutoException;

public class Protagonista extends Personagem{
	private double dinheiro;
	private LinkedList<Produto> mochila = new LinkedList<>();
	
    public Protagonista(String n) {
		super(n);
		this.dinheiro = 0;
    }

    public double getDinheiro() {
		return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
    }
        
   public void usarCura()throws VidaCheiaException, SemProdutoException{
       System.out.println(mochila);
       for(Produto p: mochila){
           if(p.getDescStr().equals("CURA")){
              if(super.getVida()==5) throw new VidaCheiaException();
            else{
              super.setVida(5);
              mochila.remove(p);
            }
        }else throw new SemProdutoException();   
       }
    }
   
    public void comprarCura(Produto curaComprar)throws SemDinheiroException{
       Produto cura = new Produto(Descricao.CURA);
       if(getDinheiro() >= curaComprar.getPreco()){
	      setDinheiro(getDinheiro()-curaComprar.getPreco());
              mochila.add(cura);
	}else throw new SemDinheiroException(curaComprar.getPreco());
    }
	
    public void comprarAtaque(Produto ataqueComprar)throws SemDinheiroException{
       if(getDinheiro() >= ataqueComprar.getPreco()){
	      setDinheiro(getDinheiro()-ataqueComprar.getPreco());
	      setAtaque(getAtaque()+1);
	}else throw new SemDinheiroException(ataqueComprar.getPreco());
    }	
    public void comprarDefesa(Produto defesaComprar)throws SemDinheiroException{
       if(getDinheiro() >= defesaComprar.getPreco()){
	      setDinheiro(getDinheiro()-defesaComprar.getPreco());
	      setDefesa(getDefesa()+1);
	}else throw new SemDinheiroException(defesaComprar.getPreco());
    }	   
    
    public void guardarItem(Itens item){
        if(String.valueOf(item).equals("DINHEIRO")){
            setDinheiro(getDinheiro()+3);
        }else{
            Produto itemAdd = new Produto(item);
            mochila.add(itemAdd);
        }
    }
    
    public LinkedList getMochila(){
        return mochila;
    }
    public void reset(){
        super.setVida(5);
        super.setAtaque(1);
        super.setDefesa(1);
        dinheiro=0;
    }

}
