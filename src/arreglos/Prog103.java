
package arreglos;
import utils.Leer;
public class Prog103 {
    public static int[] numeros = new int[100];
    public static int cantidad;

    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = Leer.entero();
        }        
    }
    public static String parimpar(int numero){
        String resultado;
        if (numero%2==0) {
            if(numero==0){
                resultado="Neutro";
            }else{
                resultado ="Par";
            }
        }else{ 
            resultado = "Impar";
        }
        return resultado;
    }
    public static String positivonegativo(int numero){
        String resultado;
        if (numero>0) {
            resultado = "Positivo";
        }else if (numero<0){
            resultado = "negativo";
        } else{
            resultado = "Neutro";
        }
        return resultado;
    }
    public static void imprimir(){
        System.out.println("Resultado: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i] + ": " + positivonegativo(numeros[i]) + " - " + parimpar(numeros[i]));
        }
    }
    public static void inicio(){
        System.out.print("cantidad: ");
        cantidad = Leer.entero();
        escribirarreglo();
        imprimir();
    }
    public static void main(String[] args) {
        inicio();
    }
}
