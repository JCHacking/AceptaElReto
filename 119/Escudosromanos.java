import java.util.ArrayList;
/**
 * Escudos del Ejercito Romano
 * El ejercicio 119
 *
 * @author JCHacking
 * @version 08.11.2020
 */
public class Escudosromanos{
    static java.util.Scanner entrada;
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		while(sc.hasNext()){
			final int linea = sc.nextInt();

			if(linea == 0)
				break;
			else{
				final int numeroLegionarios = linea;
				
				ArrayList<Integer> formaciones = formar(numeroLegionarios);
				
				System.out.println(numeroEscudosTotales(formaciones));
			}
		}
	}	

	private static ArrayList<Integer> formar(int numeroLegionarios){
		ArrayList<Integer> formaciones = new ArrayList<Integer>();

		int numeroLegionariosRestante = numeroLegionarios;

		while(numeroLegionariosRestante > 0){
			int posibleLado = 1;

			while((posibleLado * posibleLado) <= numeroLegionariosRestante){
				posibleLado++;
			}
			posibleLado--;

			numeroLegionariosRestante -= (posibleLado * posibleLado);
			formaciones.add(posibleLado);
		}

		return formaciones;
	}

	private static int numeroEscudosTotales(ArrayList<Integer> formaciones){
		int escudosTotales = 0;

		for(Integer formacion:formaciones){
			escudosTotales += numeroEscudosPorFormacion(formacion);
		}

		return escudosTotales;
	}

	private static int numeroEscudosPorFormacion(int ladoFormacion){
		int arriba = ladoFormacion * ladoFormacion;
		int flancos = ladoFormacion * 4;

		return arriba + flancos;
	}
}
