/**
 *  Nochevieja
 * El ejercicio 148
 *
 * @author JCHacking
 * @version 07.11.2020
 */
public class Nochevieja{
    static java.util.Scanner entrada;
   
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			String linea = sc.nextLine();

			if(linea.equals("00:00"))
				break;
			else{
				int[] horas = separar(linea);

				System.out.println(calcular(horas));
			}
		}
	}	

	public static int[] separar(String linea){
		String[] horasStr = linea.split(":");
		
		int[] horas = {Integer.parseInt(horasStr[0]), Integer.parseInt(horasStr[1])};
		
		return horas;
	}

	public static int calcular(int[] hora){
		int horasFaltantes = 23-hora[0];
		int minutosFaltantes = 60-hora[1];

		return (horasFaltantes*60) + minutosFaltantes;
	}
}

