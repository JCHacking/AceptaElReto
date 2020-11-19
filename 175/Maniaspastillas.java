/**
 * Manias tenemos todos
 * El ejercicio 175
 *
 * @author JCHacking
 * @version 13.11.2020
 */
public class Maniaspastillas{
    static java.util.Scanner sc;
	static int[] pastillasPorDia;

	public static void main(String[] args){
		final String DIA = "LMXJVSD";
		sc = new java.util.Scanner(System.in);

		int numeroCasos = Integer.parseInt(sc.nextLine());

		for(int caso = 0; caso < numeroCasos; caso++){
			int semanasGuardadas = Integer.parseInt(sc.nextLine());

			pastillasPorDia = new int[7];
			contarPastillasPorDia(semanasGuardadas);

			int menorDia = menorDia();
			System.out.println(DIA.charAt(menorDia) + " " + (pastillasPorDia[menorDia] + 1));
		}
	}	

	/**
	 * Cuenta las pastillas por dia durante cada semana
	 * @param semanasGuardadas el numero de semanas que existen
	 */
	public static void contarPastillasPorDia(int semanasGuardadas){
		for(int semana = 0; semana < semanasGuardadas; semana++){
			String semanaStr = sc.nextLine();

			for(int dia = 0; dia < 7; dia++)
				sumarPastilla(dia, semanaStr);
		}
	}

	/**
	 * Sumar si hay pastilla
	 * @param dia El numero de dia
	 * @param semanaStr La semana
	 */
	public static void sumarPastilla(int dia, String semanaStr){
		if(semanaStr.charAt(dia) == '*')
			pastillasPorDia[dia]++;
	}

	/**
	 * Devuelve cual es el menor dia
	 * @return indice del menor dia
	 */
	public static int menorDia(){
		int indiceMenor = 0;

		for(int dia = 1; dia < 7; dia++){
			if(pastillasPorDia[dia] < pastillasPorDia[indiceMenor])
				indiceMenor = dia;
		}

		return indiceMenor;
	}
}
