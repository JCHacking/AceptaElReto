/**
 * Cuantos Dias Faltan
 * El ejercicio 157
 *
 * @author JCHacking
 * @version 8.11.2020
 */
public class Diasfaltan{
    static java.util.Scanner entrada;
	final static int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);

		final int numeroCasos = sc.nextInt();
		sc.nextLine();

		for(int caso = 0; caso<numeroCasos; caso++){
			String linea = sc.nextLine();

			int[] diaMes = separarDiaMes(linea);

			int dias = diasFaltanAcabarMes(diaMes[0],diaMes[1]) + mesADias(diaMes[1]);

			System.out.println(dias);
		}
	}	

	private static int[] separarDiaMes(String fecha){
		String[] diaMesStr = fecha.split(" ");

		int[] diaMes = { Integer.parseInt(diaMesStr[0]), Integer.parseInt(diaMesStr[1]) };
		
		return diaMes;
	}

	private static int diasFaltanAcabarMes(int dia, int mes){
		return diasMeses[mes - 1] - dia;
	}

	private static int mesADias(int mes){
		int dias = 0;
		
		while(mes < 12){
			dias += diasMeses[mes];

			mes++;
		}

		return dias;
	}
}
