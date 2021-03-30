/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.LinkedList;
import src.exceptions.QuantidadeInsuficienteException;

/**
 *
 * @author indra
 */
public class Loja{
	LinkedList<Produto> produtos = new LinkedList<>();
        
        public void adicionarProduto(Produto produto){
            produtos.add(produto);
        }
        public void comprarProduto(String nome, int qnt) throws QuantidadeInsuficienteException{
            for(Produto p: produtos){
                if(p.getDesc()==nome){
                    if(p.getQuantidade()<=qnt){
                        p.setquant(p.getQuantidade()-qnt);
                    } else throw new QuantidadeInsuficienteException(qnt);
                }
            }
        }
        
	/*public String toString(){
		return String.format("%s. Quantidade solicitada: %s", produto, quantidade);
	}*/
}