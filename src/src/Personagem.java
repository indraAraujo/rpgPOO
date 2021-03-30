package src;

import java.util.Random;


public abstract class Personagem {
        Random rand = new Random();
	private int poder;
	private int vida;
	private int defesa;
	private int ataque;
	//private int nivel;
	
	public Personagem(int p, int v, int d, int a) {
		this.poder = p;
		this.ataque = a;
		this.defesa = d;
		this.vida = v;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public void ataquesimples(){
            int ataquesimples; 
            int dano;

            ataquesimples = rand.nextInt(this.getAtaque());

            dano = ataquesimples - getDefesa();

        }
        public void ataquecombo(){
            int ataquecombo; 
            int dano;
            ataquecombo = rand.nextInt(this.getAtaque());

            dano =ataquecombo - getDefesa();
        }
        public void usarpoder(){
          int usarpoder; 
          int dano;

          usarpoder = rand.nextInt(this.getPoder());

          dano = usarpoder - getDefesa();
        }
	
}
