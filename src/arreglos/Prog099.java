
package arreglos;
// Diseñar un algoritmo que permita el ingreso de 7 
// valores a una arreglo y mostrarlos
// Autor: Flor Cerdán
import utils.Leer;
public class Prog099 {
    public static void inicio(){
        int[] a = new int[7];
        System.out.println("Tamaño del arreglo: " + a.length);
        System.out.println("Ingresar los elementos: ");
        for (int i = 0; i < a.length ; i++) {
            System.out.print("a[ "+i+" ]: ");
            a[i] = Leer.entero();
            
        }
        System.out.println("Los elementos del arreglo son: ");
        for (int i = 0; i <  a.length; i++) {
            System.out.println("a[ "+i+" ]: " + a[i]);
            
        }
        
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
