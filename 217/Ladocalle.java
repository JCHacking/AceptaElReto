/**
 * Que lado de la calle
 * El ejercicio 217
 *
 * @author JCHacking
 * @version 05.11.2020
 */
public class Ladocalle{
    static java.util.Scanner entrada;
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		while(sc.hasNext()){
			int numero = sc.nextInt();

			if(ejecutar(numero))
				lado(numero);
			else
				break;
		}
	}	

	public static boolean ejecutar(int numero){
		boolean resultado = true;

		if(numero == 0)
			resultado = false;

		return resultado;
	}

	public static void lado(int numero){
		if(numero % 2 == 0)
			System.out.println("DERECHA");
		else
			System.out.println("IZQUIERDA");
	}
}
