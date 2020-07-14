
package estructuras;

import java.util.Scanner;


public class Prog002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double importe;
        System.out.print("Importe: ");
        importe = Double.valueOf(teclado.nextLine());
        System.out.print("Categoria: ");
        if (importe>4000) {
            System.out.println("D");
            
        } else if (importe >2000){
            System.out.println("C");
        }else if (importe>1000){
            System.out.println("B");
        }else if (importe>=0){
            System.out.println("A");
        }else{
            System.out.println("Fuera de Rango");
        }
  
        
        teclado.close();
        
       
    }
    
}
