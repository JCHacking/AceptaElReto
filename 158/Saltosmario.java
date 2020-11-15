/**
 * Los Saltos de Mario
 * El ejercicio 158
 *
 * @author JCHacking
 * @version 09.11.2020
 */
public class Saltosmario{
    static java.util.Scanner entrada;
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);

		final int numeroCasos = sc.nextInt();
		
		for(int caso = 0; caso < numeroCasos; caso++){
				int numeroSaltos = sc.nextInt();

				int[] alturas = new int[numeroSaltos];
				
				for(int digito = 0; digito < alturas.length; digito++)
						alturas[digito] = sc.nextInt();

				int[] saltos = calcularSaltos(alturas);

				System.out.println(saltos[0] + " " + saltos[1]);
		}
	}	

	private static int[] calcularSaltos(int[] alturas){
		int arriba = 0;
		int abajo = 0;

		for(int salto = 0; salto < alturas.length-1; salto++){
				if(alturas[salto] > alturas[salto+1])
						abajo++;
				else if(alturas[salto] < alturas[salto+1])
						arriba++;
		}

		final int[] arribaAbajo = {arriba, abajo};
		return arribaAbajo;
	}
}
