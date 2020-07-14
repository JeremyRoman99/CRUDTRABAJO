package arreglos;
import utils.Leer;
// Desarrollar el siguiente ejercicio:
// Eliminar elementos de un arreglo
// Cantidad: 5
// Datos de entrada:10, 4, -6, 12, 100
public class Prog104 {
    public static int[] numeros = new int[100];
    public static int cantidad;
    
    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = Leer.entero();
        } 
    }
    public static void eliminarelemento(){
        int posicion;
        listararreglo();
        System.out.print("Indique la posicion a eliminar: ");
        posicion = Leer.entero();
        for (int i = posicion; i < cantidad-1; i++) {
            numeros[i] = numeros[i+1];
        }
        numeros[cantidad-1] = 0;
        cantidad--;
    }
    public static void listararreglo(){
        System.out.println("Valores del arreglo");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero[ " +i + " ]: " + numeros[i]);                            
        }
    }
    public static void inicio(){
        System.out.print("cantidad: ");
        cantidad = Leer.entero();
        escribirarreglo();
        eliminarelemento();
        listararreglo();
    }
    public static void main(String[] args) {
        inicio();
    }
}
