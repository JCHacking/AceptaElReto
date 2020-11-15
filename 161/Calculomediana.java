import java.util.Arrays; 
/**
 * Calculo de la mediana
 * El ejercicio 161
 *
 * @author JCHacking
 * @version 13.11.2020
 */
public class Calculomediana{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int cantidadValoresMuestra = sc.nextInt();

			if(cantidadValoresMuestra == 0)
					break;

			int[] valoresMuestra = recogerValoresMuestra(cantidadValoresMuestra);

			int mediana = medianaPor2(valoresMuestra);

			System.out.println(mediana);
		}

		sc.close();
	}	

	/**
	 * Devuelve un array con los valores de muestra ordenados
	 * @param cantidadValoresMuestra La cantidad de valores de muestra
	 */
	public static int[] recogerValoresMuestra(int cantidad){
		int[] valoresMuestra = new int[cantidad];

		for(int valor = 0; valor < cantidad; valor++){
			valoresMuestra[valor] = sc.nextInt();
		}

		return valoresMuestra;
	}

	/**
	 * Ordena el Array y Devuelve la mediana x2 del array
	 * @param valoresMuestra Array con los valores de muestra
	 */
	public static int medianaPor2(int[] valoresMuestra){
		Arrays.sort(valoresMuestra);

		double mediana = 0;
		int mitad = valoresMuestra.length / 2;

		if(valoresMuestra.length % 2 == 0){
			mediana = valoresMuestra[mitad - 1] + valoresMuestra[mitad];
			mediana /= 2;
		}else
			mediana = valoresMuestra[mitad];

		mediana *= 2;
		
		return (int) mediana;
	}
}
