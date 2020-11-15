import java.util.ArrayList;
/**
 * Saltos de Trampolin
 * El ejercicio 195
 *
 * @author JCHacking
 * @version 11.11.2020
 */
public class Saltostrampolin{
    static java.util.Scanner sc;
   
	static ArrayList<Double> notas = new ArrayList<Double>();

	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
				recogerNotas();
			
				for(int i = 0; i<2;i++)
						quitarMayor();
					
				for(int i = 0; i<2;i++)
						quitarMenor();

				System.out.println((int) obtenerNota());

				limpiar();
		}

		sc.close();
	}	

	public static void limpiar(){
		notas.clear();
	}

	public static void recogerNotas(){
		int contador = 1;

		while(contador <= 7){
				notas.add(sc.nextDouble());
				contador++;
		}
	}

	public static void quitarMayor(){
		int indiceMayor = 0;

		for(int indice = 0; indice < notas.size(); indice++){
				if(notas.get(indice) > notas.get(indiceMayor))
						indiceMayor = indice;
		}

		notas.remove(indiceMayor);
	}

	public static void quitarMenor(){
		int indiceMenor = 0;

		for(int indice = 0; indice < notas.size(); indice++){
				if(notas.get(indice) < notas.get(indiceMenor))
						indiceMenor = indice;
		}

		notas.remove(indiceMenor);
	}

	public static double obtenerNota(){
		double multiplicacion = 0;

		for(double nota : notas){
				multiplicacion += nota;
		}

		return multiplicacion * 2;
	}
}
