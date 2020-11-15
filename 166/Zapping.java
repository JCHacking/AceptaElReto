/**
 * Zapping
 * El ejercicio 166
 *
 * @author JCHacking
 * @version 10.11.2020
 */
public class Zapping{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int canalActual = sc.nextInt();
			int canalSiguiente = sc.nextInt();

			if(canalActual == 0 && canalSiguiente == 0)
				break;

			int pulsacionesAdelante = botonAdelante(canalActual, canalSiguiente);
			int pulsacionesAtras = botonAtras(canalActual, canalSiguiente);

			if(canalActual == canalSiguiente)
				System.out.println("0");
			else if(pulsacionesAdelante < pulsacionesAtras)
				System.out.println(pulsacionesAdelante);
			else
				System.out.println(pulsacionesAtras);
		}
	}	

	private static int botonAdelante(int canalActual, int canalSiguiente){
		int pulsaciones = 0;

		if(canalActual < canalSiguiente)
			pulsaciones = canalSiguiente - canalActual;
		else
			pulsaciones = (99 - canalActual) + canalSiguiente;

		return pulsaciones;
	}

	private static int botonAtras(int canalActual, int canalSiguiente){
		int pulsaciones = 0;
		
		if(canalActual < canalSiguiente)
			pulsaciones = canalActual + (99 - canalSiguiente);
		else
			pulsaciones = canalActual - canalSiguiente;

		return pulsaciones;
	}
}
