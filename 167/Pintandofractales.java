/**
 * Pintando Fractales
 * El ejercicio 167
 *
 * @author JCHacking
 * @version 10.11.2020
 */
public class Pintandofractales{
    static java.util.Scanner sc;
   
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int lado = recogerDatos();

			System.out.println(factral(lado));
		}

		sc.close();
	}	

	public static int recogerDatos(){
		return sc.nextInt();
	}

	public static int factral(int lado){
		int ladoActual = lado;
		int numeroCuadrados = 1;
		int perimetroTotal = 0;

		while(esDivisible(ladoActual)){
			perimetroTotal += calcularPerimetros(ladoActual, numeroCuadrados);

			ladoActual /= 2;
			numeroCuadrados *= 4;
		}

		return perimetroTotal;
	}

	public static boolean esDivisible(int lado){
		boolean esDivisible = true;

		if(lado < 1)
			esDivisible = false;

		return esDivisible;
	}

	public static int calcularPerimetros(int ladoActual, int numeroCuadrados){
		return perimetro(ladoActual) * numeroCuadrados;
	}

	public static int perimetro(int lado){
		return lado * 4;
	}
}
