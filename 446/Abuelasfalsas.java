/**
 * AbuelasFalsas
 * El ejercicio 446
 *
 * @author JCHacking
 * @version 19.11.2020
 */
public class Abuelasfalsas{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		int numeroCasos = Integer.parseInt(sc.nextLine());

		for(int caso = 0; caso < numeroCasos; caso++){
			String[] linea = sc.nextLine().split(" ");

			boolean esAbuela = false;
			boolean encontrado = false;
			int numeroNombres = Integer.parseInt(linea[1]);
			String nombreReal = linea[0];

			if(numeroNombres > 1){
				for(int nombre = 2; nombre < linea.length ; nombre++){
					if(nombreReal.equals(linea[nombre])){
						if(nombre == linea.length - 1 && !encontrado){
							esAbuela = true;
						}

						encontrado = true;
					}
				}
			}

			if(esAbuela)
				System.out.println("VERDADERA");
			else
				System.out.println("FALSA");
		}
		
		sc.close();
	}	
}
