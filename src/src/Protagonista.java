/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.exceptions.SemDinheiroException;

/**
 *
 * @author indra
 */
public class Protagonista extends Personagem {
    
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
