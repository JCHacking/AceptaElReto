/**
 * Saliendo de la crisis
 * El ejercicio 247
 *
 * @author JCHacking
 * @version 13.11.2020
 */
public class Saliendocrisis{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int numeroIndicadores = sc.nextInt();

			if(numeroIndicadores == 0)
					break;

			int[] indicadores = recogerIndicadores(numeroIndicadores);

			boolean salimos = salimosCrisis(indicadores);

			if(salimos)
					System.out.println("SI");
			else
					System.out.println("NO");
		}

		sc.close();
	}	

	/**
	 * Devuelve un array con los indicadores
	 * @param numeroIndicadores El numero de indicadores que nos pasan
	 */
	public static int[] recogerIndicadores(int numeroIndicadores){
		int[] indicadores = new int[numeroIndicadores];

		for(int indicador = 0; indicador < numeroIndicadores; indicador++){
				indicadores[indicador] = sc.nextInt();
		}

		return indicadores;
	}

	/**
	 * Devuelve TRUE si todos los valores van en aumento o FALSE en caso contrario
	 * @param indicadores[] El array con todos los indicadores
	 */
	public static boolean salimosCrisis(int[] indicadores){
		boolean salimos = true;

		for(int indicador = 0; indicador < indicadores.length - 1; indicador++){
			if(indicadores[indicador] >= indicadores[indicador + 1]){
				salimos = false;
				break;
			}
		}

		return salimos;
	}
}
