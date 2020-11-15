/**
 * Suma de digitos
 * El ejercicio 140
 *
 * @author JCHacking
 * @version 08.11.2020
 */
public class Sumadigitos{
    static java.util.Scanner entrada;
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			String linea = sc.nextLine();

			if(Integer.parseInt(linea) < 0)
				break;
			else{
				int[] numeros = digitos(linea);

				int resultado = suma(numeros);

				imprimir(numeros,resultado);
			}
		}
	}	

	private static int[] digitos(String numerosJuntos){
		String[] digitosStr = numerosJuntos.split("");
		int[] digitos = new int[digitosStr.length];
		
		for(int posicion = 1; posicion<digitosStr.length; posicion++){
			digitos[posicion] = Integer.parseInt(digitosStr[posicion]);
		}

		return digitos;
	}

	private static int suma(int[] numeros){
		int suma = 0;

		for(int numero:numeros)
			suma+=numero;

		return suma;
	}

	private static void imprimir(int[] numeros, int resultado){
		String texto = "";

		for(int posicion = 1; posicion < numeros.length; posicion++){
			String operador = " + ";

			if(posicion == (numeros.length - 1))
				operador = " = ";
			
			texto += numeros[posicion] + operador;
		}
		
		texto += resultado;

		System.out.println(texto);
	}
}
