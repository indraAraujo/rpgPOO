
package src;

import java.util.Random;

public class Nivel {
    Protagonista protagonista;
    Vilao vilao;
    int nivel;
    Random rand = new Random();
    
    public Nivel(Protagonista protagonista, Vilao vilao){
        this.protagonista=protagonista;
        this.vilao=vilao;
    }
    
    public int getNivel(int capacidade){
        nivel = rand.nextInt((capacidade - 1) + 1) + 1;
        return nivel;
    }
    
}