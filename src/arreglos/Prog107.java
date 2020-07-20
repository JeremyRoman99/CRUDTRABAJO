
package arreglos;
import utils.Leer;

public class Prog107 {
    public static int[] numeros = new int[100];
    public static int cantidad;
    
    public static void escribir(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numero en la posicion[ " + i + " ]: ");
            numeros[i] = Leer.entero();
        } 
    }
    public static void repetir(){
        int comparar;
        int contador=0;
        System.out.print("Datos de Entrada Buscar: ");
        comparar = Leer.entero();
        for (int i = 0; i < cantidad; i++) {
           if( numeros[i] == comparar){
               contador++;  
           } 
        }System.out.println("Datos de Salida Resultado: "+contador+" veces");   
    }
  
    public static void inicio(){
        System.out.print("Cantidad de numeros para el arreglo: ");
        cantidad = Leer.entero();
        escribir();
        repetir();
    }
    public static void main(String[] args) {
        inicio();
    }
}
