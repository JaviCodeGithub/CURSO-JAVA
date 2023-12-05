package poo;

public class Furgoneta extends Coche2 {
	
	private int capacidadExtra;
	
	private int plazasExtra;
	
	public Furgoneta(int plazasExtra, int capacidadExtra) {
		
		super();	//LLAMAR AL CONSTRUCTOR DE LA CALSE PADRE(COCHE)
		
		this.capacidadExtra=capacidadExtra;
		
		this.plazasExtra=plazasExtra;
	}
	
	public String dimeDatosFurgoneta() {
		
		return "La capacidad de carga de la furgoneta es de: " + capacidadExtra +
				"Kg y tiene un total de " + plazasExtra + " plazas.";
		
	}

}
