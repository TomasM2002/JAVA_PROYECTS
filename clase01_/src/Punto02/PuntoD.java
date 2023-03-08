package Punto02;

public class PuntoD {

	public static void main(String[] args) {
		int ingresos = 47 ;
		int vehiculos = 2 ;
		int inmuebles = 1 ;
		boolean Embarcacion = false;
		
		if ((ingresos >= 489083) || (vehiculos >= 3) || (inmuebles >= 3) || (Embarcacion == true) ) {
			System.out.println("Perteneces a ingresos ALTOS");
		}else {
			System.out.println("Perteneces a ingresos BAJOS");
		}

	}

}
