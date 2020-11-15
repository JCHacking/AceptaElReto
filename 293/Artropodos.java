/**
 * Artropodos
 * El ejercicio 293
 *
 * @author JCHacking
 * @version 06.11.2020
 */
public class Artropodos{
    static java.util.Scanner entrada;
	
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		int numeroCasos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numeroCasos; i++){
			int[] cantidades = separacion(sc.nextLine());
			
			System.out.println(sumar(cantidades));
		}
	}	

	public static int[] separacion(String cantidades){
		String[] numerosStr = cantidades.split(" ");
		int[] numeros = new int[numerosStr.length];

		for(int contador = 0; contador < numerosStr.length; contador++){
			numeros[contador] = Integer.parseInt(numerosStr[contador]);
		}

		return numeros;
	}

	public static int sumar(int[] cantidades){
		int[] numPatas = {6,8,10,2};
		int suma = 0;
		int contador = 3;

		while(contador >= 0){
			suma += contar(cantidades[contador],numPatas[contador]);

			if(contador == 3)
				suma *= cantidades[contador+1];

			contador--;
		}

		return suma;
	}

	public static int contar(int cantidad, int patasPorArtropodo){
		return cantidad * patasPorArtropodo;
	}
}
