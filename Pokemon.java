public class Pokemon{
	private int id;
	private String nombre;
	private boolean capturado;
	private boolean visto;
	private int exp;
	private int nivel;
	private final int ps_max;
	private int ps;
	private int ataque;
	private Ataque [] ataques = new Ataque[SetupPokemon.cantidadAtaques];

	Pokemon(int id, String nombre, String [] listaAtaques){
		int valor=6;
		this.id = id;
		this.nombre = nombre;
		this.ps_max = SetupPokemon.ps_max;
		this.ps = this.ps_max;
		this.ataque = SetupPokemon.ataque;
		this.exp = SetupPokemon.experiencia;
		this.nivel = SetupPokemon.nivel;
		this.capturado = false;
		this.visto = false;
		for(int i=0;i<SetupPokemon.cantidadAtaques;i++){
			this.ataques[i] = new Ataque(listaAtaques[i],i+1,valor-(i+1),valor/2-i);
		}
	}
	public void setCapturado(){
		this.capturado = true;
	}
	
	public void setVisto(){
		this.visto = true;
	}
	public String getNombre(){
		return this.nombre;
	}
	public boolean getCapturado(){
		return this.capturado;
	}
	public int getId(){
		return this.id;
	}
	public void recibirAtaque(Ataque ataque){
		this.ps -= ataque.getDano();
	}
	public Ataque [] getAtaques(){
		return ataques;
	}
	public int getPs(){
		return ps;
	}
	public void restaurar(){
		this.ps = this.ps_max;
	}
	public int getExp(){
		return this.exp;
	}
	public int nivel(){
		return nivel;
	}
	public void ganar_exp(){
		this.exp = getExp()+1;
		if(this.exp>=3){
			this.lvl = this.lvl+1;
			System.out.println("*** Felicidades ***");
			System.out.println(getNombre()+"Ha subido de nivel"+ getlvl());
			this.exp = 0;
		}
	}

}