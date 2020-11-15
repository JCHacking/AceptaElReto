/**
 * La tienda de la esquina
 * El ejercicio 284
 *
 * @author JCHacking
 * @version 12.11.2020
 */
public class Tiendaesquina{
    static java.util.Scanner sc;
   	static int[] valorMonedas = {200, 100, 50, 20 ,10, 5, 2, 1};
	static int[] monedasADar = new int[valorMonedas.length];

	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		int numeroCasos = sc.nextInt();

		for(int caso = 0; caso < numeroCasos; caso++){
			int centimosCosto = sc.nextInt();
			int centimosRecibidos = sc.nextInt();

			if(centimosRecibidos < centimosCosto)
				System.out.println("DEBE " + ((centimosRecibidos - centimosCosto)*-1));
			else{
				calcularMonedas(centimosRecibidos - centimosCosto);

				imprimirMonedas();
			}
		}
	}	

	public static void calcularMonedas(int centimosADevolver){
		for(int moneda = 0; moneda < monedasADar.length; moneda++){
			int valor = valorMonedas[moneda];
			int cantidad = centimosADevolver/valor;

			monedasADar[moneda] = cantidad;
			centimosADevolver -= valor * cantidad;
		}
	}

	public static void imprimirMonedas(){
		for(int posicion = 0; posicion < monedasADar.length; posicion++){
			if(posicion == monedasADar.length-1){
				System.out.println(monedasADar[posicion]);
			}else{
				System.out.print(monedasADar[posicion] + " ");
			}

		}
	}
}
