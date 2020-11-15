/*
 * Perimetro de un rectangulo
 * Problema 155 de acepta el reto
 *
 * @author JCHacking
 * @version 6.11.2020
*/

public class Rectangulo{

	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int[] numeros = separar(sc.nextLine());
			boolean validados = true;

			for(int numero : numeros){
				if(!validar(numero)){
					validados = false;
				}
			}

			if(validados){
				int resultado = perimetro(numeros);
				
				System.out.println(resultado);
			}else{
				break;
			}
		}
	}	

	private static int[] separar(String entrada){
		int[] numeros = new int[2];

		numeros[0] = Integer.parseInt(entrada.split(" ")[0]);
		numeros[1] = Integer.parseInt(entrada.split(" ")[1]);

		return numeros;
	}
	private static boolean validar(int numero){
		boolean valido = false;

		if(numero >= 0){
			valido = true;
		}

		return valido;
	}
	private static int perimetro(int[] numeros){
		return (numeros[0] * 2) + (numeros[1] * 2);
	}


}
