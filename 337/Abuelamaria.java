/**
 * La abuela Maria
 * El ejercicio 337
 *
 * @author JCHacking
 * @version 12.11.2020
 */
public class Abuelamaria{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		int numeroCasos = sc.nextInt();

		for(int caso = 0; caso < numeroCasos; caso++){
			int[] filaArriba = recogerFila();
			int[] filaAbajo = recogerFila();

			boolean encajan = hasEncajan(filaArriba, filaAbajo);

			if(encajan)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
	}	

	private static int[] recogerFila(){
		int[] altoDientes = new int[6];

		for(int diente = 0; diente < 6; diente++){
			altoDientes[diente] = sc.nextInt();
		}

		return altoDientes;
	}

	private static boolean hasEncajan(int[] filaArriba, int[] filaAbajo){
		boolean encajan = true;
		int alturaTotal = filaArriba[0] + filaAbajo[0];

		for(int posicion=1; posicion < 6; posicion++){
			if((filaArriba[posicion] + filaAbajo[posicion]) != alturaTotal){
				encajan = false;
				break;
			}
		}

		return encajan;
	}
}
