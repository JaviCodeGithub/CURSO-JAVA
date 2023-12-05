package poo;

public interface Trabajadores {		//PUBLIC Y ABSTRACT SE SOBREENTIENDEN EN MÉTODOS DE INTERFACES
	
	public abstract double estableceBonus(double gratificación);
	
	public static final double bonusBase=1500;	//PUBLIC STATIC Y FINAL SE SOBREENTIENDEN EN CONSTANTES DE INTERFACES
	
}
