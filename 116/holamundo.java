/**
 * Hola Mundo
 * El ejercicio 116
 *
 * @author JCHacking
 * @version 05.11.2020
 */
public class holamundo
{
    static java.util.Scanner entrada;
   
    public static void main (String args[]) {
        entrada = new java.util.Scanner(System.in);

        int numCasosDePrueba = entrada.nextInt();

        for (int i = 1; i <= numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba(){
		System.out.println("Hola mundo.");
    }
}

