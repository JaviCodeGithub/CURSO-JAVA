package poo;

public class Coche2 {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche2() {
		
		ruedas=4;
		
		largo=3000;
		
		motor=1600;
		
		peso_plataforma=500;
		
		ancho=180;
		
	}

	public String dime_datos_generales() {//GETTER
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas" +
		". Mide " + largo/1000 + " metros, con un ancho de " + ancho + " cm.";
		
	}
	
	public void establece_color(String color_coche) {//SETTER		
		//color="azul";
		color=color_coche;
		
	}
	
	public String dime_color() {//GETTER		
		return "El color de éste modelo es " + color;
		
	}
	
	public void configura_asientos(String asientos_cuero) {//SETTER		
		if(asientos_cuero.equalsIgnoreCase("si")) {			
			this.asientos_cuero=true;			
		}else {
			this.asientos_cuero=false;
		}		
	}
	
	public String dime_asientos() {//GETTER
		if (asientos_cuero==true) {			
			return "Éste modelo incluye asientos en cuero";			
		}else {			
			return "Éste modelo tiene asientos standard";			
		}
	}
	
	public void configura_climatizador(String climatizador) {//SETTER
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {//GETTER		
		if(climatizador==true) {			
			return "Éste modelo incluye climatizador";			
		}else {			
			return "Éste modelo incluye aire acondicionado";
		}				
	}
	
	public String dime_peso_coche() {//SETTER + GETTER(NO SE RECOMIENDA)
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero=true) {
			peso_total=peso_total+25;
		}
		if(climatizador) {//PODEMOS OBVIAR CLIMATIZADOR(=TRUE)
			peso_total=peso_total+50;
		}
		return "El peso total del modelo es de " + peso_total + " kg";
	}
	
	public int precio_coche() {
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=4000;
		}
		if(climatizador==true	) {
			precio_final+=1500;
		}
		return precio_final;
	}
	
}
