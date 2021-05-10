package src;


import java.util.LinkedList;

import exceptions.QuantidadeInsuficienteException;

public class Loja{
	LinkedList<Produto> produtos = new LinkedList<>();
        
   public void adicionarProduto(Produto produto){
            produtos.add(produto);
   }
   public Produto comprarProduto(String nome){
       Produto achado=null;
       for(Produto p: produtos){
          if(p.getDescStr().equals(nome)){
               achado=p;
               break;
           }
    }
       return achado;
    } 
}