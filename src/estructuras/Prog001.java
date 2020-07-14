
package estructuras;

import java.util.Scanner;



public class Prog001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Numero: ");
        numero = Integer.valueOf(teclado.nextLine());
        if (numero % 2 == 0){
            System.out.println("Resultado = PAR");
        }else{
            System.out.println("Resultado = IMPAR");
        }
        
        teclado.close();
      
        
    }
    
}
