package src;


public abstract class Personagem {
    private String nome;
	private int vida;
	private int defesa;
	private int ataque;
	
    public Personagem(String n) {
        nome=n;
	ataque = 1;
	defesa = 1;
	vida = 5;
    }
        
    public String getNome(){
      return nome;
    }
        
    public void setNome(String n){
       nome=n;
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
    public int ataquesimples(int aleatorio){
      int dano=aleatorio*getAtaque();
      return  dano;
    }
    public int ataquecombo(int aleatorio){
            int dano = aleatorio*getAtaque();
            return dano;
    }
    
    public void levarDano(int aleatorio) {
       setVida(getVida()-(aleatorio/getDefesa()));
     }
        
           
}