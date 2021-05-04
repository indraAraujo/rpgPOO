package src;


public abstract class Personagem {
    private String nome;
	private int poder;
	private int vida;
	private int defesa;
	private int ataque;
	//private int nivel;
	
    public Personagem(String n, int p) {
        nome=n;
	poder = p;
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
    public int ataquesimples(int aleatorio){
      int ataqueSimples=aleatorio;
      return  ataqueSimples - getDefesa();
    }
    public int ataquecombo(int aleatorio){
            int ataquecombo = aleatorio;
            int dano =ataquecombo - getDefesa();
            return dano;
    }
    public void usarpoder(){
          int usarpoder; 
          int dano;
          usarpoder =0;
          //rand.nextInt(this.getPoder());

          dano = usarpoder - getDefesa();
    }
        
    public void levarDano(int dano) {
       setVida(getVida()-dano);
     }
        
        
     public String toString(){
       return "\n"+getNome()+"\nVIDA:  "+getVida()+"\nATAQUE:  "+getAtaque()+"\nDEFESA:  "+getDefesa();
    }
        
}