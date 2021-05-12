package upeu.edu.pe.casos;

import java.util.Scanner;


public class sueldoService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double hora;
		double precio;
		System.out.print("Ingrese el nro de horas trabajadas: ");
		 hora = teclado.nextDouble();
		System.out.print("Ingrese el sueldo que recibe por hora: ");
		 precio = teclado.nextDouble();
		SueldoImpService su = new SueldoImpService();
		SueldoDao caso = su.getSueldoImpPort();
		System.out.print("sueldo: ");
		System.out.println(caso.sueldo(hora, precio));
	}

}
