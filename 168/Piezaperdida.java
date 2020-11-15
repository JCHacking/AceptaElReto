/**
 * La pieza perdida
 * El ejercicio 168
 *
 * @author JCHacking
 * @version 11.11.2020
 */
public class Piezaperdida{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int numeroPiezas = sc.nextInt();
			
			if(numeroPiezas == 0)
					break;

			int totalPiezas = totalPiezas(numeroPiezas);
			int totalPiezasFaltante = totalPiezasFaltante(numeroPiezas);

			int piezaFaltante = quePiezaFalta(totalPiezas,totalPiezasFaltante);

			System.out.println(piezaFaltante);
		}
	}	

	private static int totalPiezas(int numeroPiezas){
		int sumaTotal = 0;
		int numeroActual = 1;

		while(numeroActual <= numeroPiezas){
				sumaTotal += numeroActual;
				numeroActual++;
		}
		
		return sumaTotal;
	}

	private static int totalPiezasFaltante(int numeroPiezas){
		int sumaTotal = 0;

		for(int numeroPieza = 0; numeroPieza < numeroPiezas-1; numeroPieza++)
				sumaTotal += sc.nextInt();

		return sumaTotal;
	}

	private static int quePiezaFalta(int totalPiezas, int totalPiezasFaltante){
		return totalPiezas - totalPiezasFaltante;
	}
}
