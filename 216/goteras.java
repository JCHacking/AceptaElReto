/**
 * Goteras
 * El ejercicio 216
 *
 * @author JCHacking
 * @version 09.11.2020
 */
public class Goteras{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		final int numeroCasos = sc.nextInt();

		for(int caso = 0; caso < numeroCasos; caso++){
			final int numeroGotas = sc.nextInt();

			int[] tiempo = tiempo(numeroGotas);

			String horas = ceroIzquierda(tiempo[0]);
			String minutos = ceroIzquierda(tiempo[1]);
			String segundos = ceroIzquierda(tiempo[2]);

			System.out.println(horas + ":" + minutos + ":" + segundos);
		}
	}	

	private static int[] tiempo(int numeroGotas){
		int horas = numeroGotas/(60*60);
		numeroGotas -= horas*(60*60);

		int minutos = numeroGotas/60;
		numeroGotas -= minutos*60;

		int segundos = numeroGotas;

		final int[] tiempo = {horas,minutos,segundos};
		return tiempo;
	}

	private static String ceroIzquierda(int numero){
		String resultado = "";
	
		if(numero < 10)
			resultado = "0" + numero;
		else
			resultado = "" + numero;

		return resultado;
	}
}
