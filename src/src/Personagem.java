
public abstract class Personagem {

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
	
	//Métodos
	
}
