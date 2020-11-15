/**
 * Ultimo digito factorial
 * El ejercicio 114
 *
 * @author JCHacking
 * @version 07.11.2020
 */
public class Ultimofactorial{
    static java.util.Scanner entrada;
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);

		final int numeroCasos = sc.nextInt();

		for(int caso = 0; caso<numeroCasos; caso++){
			int ultimoDigito = ultimoDigitoFactorial(sc.nextInt());
			
			System.out.println(ultimoDigito);
		}
	}	

	public static int ultimoDigitoFactorial(int numero){
		int ultimoDigito = 1;

		if(numero == 0)
			ultimoDigito = 1;
		else if(numero < 3)
			ultimoDigito = numero;
		else if(numero == 3)
			ultimoDigito = 6;
		else if(numero == 4)
			ultimoDigito = 4;
		else
			ultimoDigito = 0;

		return ultimoDigito;
	}

}
