/**
 * Encadenando Palabras
 * El ejercicio 188
 *
 * @author JCHacking
 * @version 11.11.2020
 */
public class Encadenandopalabras{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);
		
		while(sc.hasNext()){
			String linea = sc.nextLine();

			String[] palabras = separarPalabras(linea);

			boolean estanEncadenadas = estanEncadenadas(palabras);
			
			if(estanEncadenadas)
					System.out.println("SI");
			else
					System.out.println("NO");
		}

		sc.close();
	}	

	private static String[] separarPalabras(String linea){
		return linea.split(" ");
	}

	private static boolean estanEncadenadas(String[] palabras){
		boolean estanEncadenadas = true;

		for(int numeroPalabra = 0; numeroPalabra < palabras.length-1; numeroPalabra++){
				int longitudPalabra = palabras[numeroPalabra].length();

				String palabra1 = palabras[numeroPalabra].substring(longitudPalabra - 2);
				String palabra2 = palabras[numeroPalabra + 1].substring(0,2);

				if(!palabra1.equals(palabra2)){
					estanEncadenadas = false;
					break;
				}
		}

		return estanEncadenadas;
	}
}
