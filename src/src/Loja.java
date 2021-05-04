package src;


import java.util.LinkedList;

import exceptions.QuantidadeInsuficienteException;

public class Loja{
	LinkedList<Produto> produtos = new LinkedList<>();
        
   public void adicionarProduto(Produto produto){
            produtos.add(produto);
   }
   public void comprarProduto(String nome, int qnt) throws QuantidadeInsuficienteException{
       for(Produto p: produtos){
          if(p.getDescStr().equals(nome)){
                if(p.getQuantidade()<=qnt){
                   p.setQuantidade(p.getQuantidade()-qnt);
                } else throw new QuantidadeInsuficienteException(qnt);
           }
       }
    }
   
   public Produto buscarProduto(String nome){
       Produto achado=null;
       for(Produto p: produtos){
          if(p.getDescStr().equals(nome)){
                achado=p;
           }
       }
       return achado;
   }
        
}