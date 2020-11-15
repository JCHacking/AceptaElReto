/**
 * Palabras Pentavocalicas
 * El ejercicio 300
 *
 * @author JCHacking
 * @version 11.11.2020
 */
public class Pentavocalica{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		final int numeroCasos = sc.nextInt();
		sc.nextLine();

		for(int caso = 0; caso < numeroCasos; caso++){
			String palabra = sc.nextLine();

			boolean pentavocalica = esPentavocalica(palabra);

			if(pentavocalica)
					System.out.println("SI");
			else
					System.out.println("NO");
		}
	}	

	private static boolean esPentavocalica(String palabra){
			boolean pentavocalica = true;

			String[] vocales = {"a","e","i","o","u"};

			for(String vocal : vocales){
					if(!palabra.contains(vocal)){
							pentavocalica = false;
							break;
					}
			}


			return pentavocalica;
	}
}
