package recursividad;
import utils.Leer;
public class Prog011 {
    public static void factorial1(int numero){
        int fac=1;
        for (int i = 1; i <= numero; i++) {
            fac*=i;
        }
        System.out.println("Factorial01 de " + numero + ": " + fac);
    }
    public static int factorial2(int numero){
        int fac;
        if(numero==0){
            fac=1;
        }else{
            fac = numero*factorial2(numero-1);
        }
        return fac;
    }
    
    public static void inicio(){
        System.out.print("Numero: ");
        int numero = Leer.entero();
        factorial1(numero);
        System.out.println("Factorial2 de + " + numero + ": " + factorial2(numero) );
        
    }
    public static void main(String[] args) {
        inicio();
    }    
}
