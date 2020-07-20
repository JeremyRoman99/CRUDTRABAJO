
package arreglos;
import java.util.Scanner;

public class Prog106 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 0, y = 1, z, numero;
       
        System.out.print("Ingrese cantidad de elementos para la serie: ");
        numero = teclado.nextInt();
       
        for (int i = 0; i < numero; i++) {
            System.out.println("fibonacci:"+x);
            z = x + y;
            x = y;
            y = z;
        }
    }
         
}
