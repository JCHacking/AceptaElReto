import java.util.Arrays;
/**
 * Y el ganador es ...
 * El ejercicio 186
 *
 * @author JCHacking
 * @version 20.11.2020
 */
public class Ganador{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int numeroEquipos = sc.nextInt();
			int numeroGlobos = sc.nextInt();
			sc.nextLine();

			int[] globosEquipo = new int[numeroEquipos];

			//SI ES 0 0 
			if(numeroEquipos == 0 && numeroGlobos == 0)
				break;

			//CONTAR GLOBOS POR EQUIPO
			for(int globo = 0; globo < numeroGlobos; globo++){
				String linea = sc.nextLine();
				int separacion = linea.indexOf(" ");
				String numeroStr = linea.substring(0, separacion);
				int equipo = Integer.parseInt(numeroStr);
				
				globosEquipo[equipo - 1] += 1;
			}

			//Encontrar el mayor indice
			if(numeroEquipos > 1){
				int indiceMayor = 0;
				int indiceMayorSiguiente = 1;
			
				if(globosEquipo[indiceMayor] < globosEquipo[indiceMayorSiguiente]){
					indiceMayor = 1;
					indiceMayorSiguiente = 0;
				}

				if(numeroEquipos > 2){
					for(int equipo = 2; equipo < numeroEquipos; equipo++){
						int numeroGlobosEquipoActual = globosEquipo[equipo];

						if(numeroGlobosEquipoActual > globosEquipo[indiceMayor]){
							indiceMayorSiguiente = indiceMayor;
							indiceMayor = equipo;
						}else if(numeroGlobosEquipoActual > globosEquipo[indiceMayorSiguiente]){
							indiceMayorSiguiente = equipo;
						}
					}
				}

				boolean empate = false;
				if(globosEquipo[indiceMayor] == globosEquipo[indiceMayorSiguiente])
					empate = true;

					
				if(empate){
					System.out.println("EMPATE");
				}else{
					System.out.println(indiceMayor + 1);
				}
			}else{
				System.out.println(1);
			}
		}
	}	
}
