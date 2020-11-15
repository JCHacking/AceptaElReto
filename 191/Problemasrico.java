/**
 * Los problemas de ser rico
 * El ejercicio 191
 *
 * @author JCHacking
 * @version 11.11.2020
 */
public class Problemasrico{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		final int numeroCasos = sc.nextInt();

		for(int caso = 0; caso < numeroCasos; caso++){
			final int numeroCompartimentos = sc.nextInt();
			final int capacidadDelGrande = sc.nextInt();
			final int diferenciaEntreCompartimentos = sc.nextInt();

			System.out.println(totalLitros(numeroCompartimentos,capacidadDelGrande,diferenciaEntreCompartimentos));
		}
	}	

	public static int totalLitros(int numeroCompartimentos, int capacidadDelGrande, int diferenciaEntreCompartimentos){
		int totalLitros = 0;

		for(int compartimento = 0; compartimento < numeroCompartimentos; compartimento++)
			totalLitros += capacidadDelGrande - (compartimento * diferenciaEntreCompartimentos);

		return totalLitros;
	}
}
