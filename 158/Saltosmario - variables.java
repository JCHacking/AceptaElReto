/**
 * Los Saltos de Mario
 * El ejercicio 158
 *
 * @author JCHacking
 * @version 09.11.2020
 */
public class Saltosmario{
    static java.util.Scanner sc;
   
	static int saltosArriba;
	static int saltosAbajo;
	static int alturaActual;
	static int alturaSiguiente;

	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		final int numeroCasos = sc.nextInt();
		
		for(int caso = 0; caso < numeroCasos; caso++){
			resetearValores();

			final int numeroSaltos = sc.nextInt() - 1;
			
			alturaSiguiente = sc.nextInt(); //Para que la funcion siguienteSalto() pueda pillar la alturaActual en el primer salto
			for(int salto = 0; salto < numeroSaltos; salto++){
					siguienteSalto();
					calcularSalto();
			}

			System.out.println(saltosArriba + " " + saltosAbajo);
		}
	}	

	private static void siguienteSalto(){
		alturaActual = alturaSiguiente;
		alturaSiguiente = sc.nextInt();
	}

	private static void calcularSalto(){
		if(alturaActual > alturaSiguiente)
				saltosAbajo++;
		else if(alturaActual < alturaSiguiente)
				saltosArriba++;
	}

	private static void resetearValores(){
		saltosArriba = 0;
		saltosAbajo = 0;
		alturaActual = 0;
		alturaSiguiente = 0;
	}
}
