/**
 * Abadias Pirenaicas
 * El ejercicio 171
 *
 * @author JCHacking
 * @version 12.11.2020
 */
public class Abadiaspirenaicas{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int numeroMontannas = sc.nextInt();

			if(numeroMontannas == 0)
				break;

			int[] alturasMontannas = recogerAlturas(numeroMontannas);

			int numeroAbadias = numeroPosiblesAbadias(alturasMontannas);
			System.out.println(numeroAbadias);
		}
	}	

	public static int[] recogerAlturas(int numeroMontannas){
		int[] alturasMontannas = new int[numeroMontannas];

		for(int posicion = 0; posicion < numeroMontannas; posicion++){
			alturasMontannas[posicion] = sc.nextInt();
		}

		return alturasMontannas;
	}

	public static int numeroPosiblesAbadias(int[] alturas){
		int numeroAbadias = 1;
		int alturaMaxima = alturas[alturas.length - 1];

		for(int posicion = alturas.length-2; posicion >= 0; posicion--){
			if(alturas[posicion] > alturaMaxima){
				alturaMaxima = alturas[posicion];
				numeroAbadias++;
			}
		}

		return numeroAbadias;
	}
}
