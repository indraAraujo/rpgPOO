
import java.util.LinkedList;

import exceptions.QuantidadeInsuficienteException;

public class Loja{
	LinkedList<Produto> produtos = new LinkedList<>();
        
   public void adicionarProduto(Produto produto){
            produtos.add(produto);
   }
   public void comprarProduto(String nome, int qnt) throws QuantidadeInsuficienteException{
       for(Produto p: produtos){
          if(p.getDesc().equals(nome)){
                if(p.getQuantidade()<=qnt){
                   p.setQuantidade(p.getQuantidade()-qnt);
                } else throw new QuantidadeInsuficienteException(qnt);
           }
       }
    }
        
	/*public String toString(){
		return String.format("%s. Quantidade solicitada: %s", produto, quantidade);
	}*/
}