import java.util.ArrayList;
/**
 * Hyperpar
 * El ejercicio 165
 *
 * @author JCHacking
 * @version 10.11.2020
 */
public class Hyperpar{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			String numero = sc.nextLine();

			if(hasNegativo(numero))
				break;

			int[] digitos = digitos(numero);
			

			boolean todosPares = sonPares(digitos);

			System.out.println(todosPares ? "SI" : "NO");
		}
	}	

	private static int[] digitos(String numero){
		String[] digitosStr = numero.split("");

		int[] digitos = new int[digitosStr.length];
		
		for(int numDigito = 0; numDigito < digitos.length; numDigito++){
			try{
				digitos[numDigito] = Integer.parseInt(digitosStr[numDigito]);
			}catch(Exception e){}
		}

		return digitos;
	}

	private static boolean hasNegativo(String numero){
		boolean esNegativo = false;

		if(Integer.parseInt(numero) < 0)
			esNegativo = true;

		return esNegativo;
	}

	private static boolean sonPares(int[] digitos){
		boolean todosPares = true;

		for(int numero:digitos){
			if(numero % 2 != 0){
				todosPares = false;
				break;
			}
		}

		return todosPares;
	}
}
