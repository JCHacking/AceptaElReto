/**
 * Area de un rectangulo
 * El ejercicio 164
 *
 * @author JCHacking
 * @version 10.11.2020
 */
public class Arearectangulo{
    static java.util.Scanner sc;
  
	public static void main(String[] args){
		sc = new java.util.Scanner(System.in);

		while(sc.hasNext()){
			int[] a = recogerDatos();
			int[] b = recogerDatos();

			int base = base(a, b);
			int altura = altura(a, b);

			if(segundoVertizeDebajo(base, altura))
				break;

			int area = area(base, altura);

			System.out.println(area);
		}
	}	

	public static int[] recogerDatos(){
		int[] vertize = {sc.nextInt(), sc.nextInt()};

		return vertize;
	}

	public static int base(int[] a, int[] b){
		return b[0] - a[0];
	}

	public static int altura(int[] a, int[] b){
		return b[1] - a[1];
	}

	public static int area(int base, int altura){
		return base * altura;
	}

	public static boolean segundoVertizeDebajo(int base, int altura){
		boolean estaDebajo = false;

		if(base < 0 || altura < 0)
			estaDebajo = true;

		return estaDebajo;
	}

}
