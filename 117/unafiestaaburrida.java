/**
 * La fiesta aburrida
 * El ejercicio 117
 *
 * @author JCHacking
 * @version 05.11.2020
 */
public class unafiestaaburrida{
    static java.util.Scanner entrada;
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		int numeroCasos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numeroCasos; i++){
			saludar(nombre(sc.nextLine()));	
		}
	}	

	public static String nombre(String entrada){
		return entrada.substring(4);
	}

	public static void saludar(String nombre){
		System.out.println("Hola, " + nombre + ".");
	}
}

