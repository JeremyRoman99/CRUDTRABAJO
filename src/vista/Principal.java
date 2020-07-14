
package vista;
import utils.Leer;
//Autor: Flor Cerdán
public class Principal {
    // Métodos
    
    public static void factorial(){
        System.out.println("*** FACTORIAL ***");
        System.out.print("Ingrese Número: ");
        int numero = Leer.entero();
        int fac = 1;
        for (int i = 1; i <= numero; i++) {
            fac*=i;
        }
        System.out.println(numero + "! = " + fac); // Ejemplo: 5! = 120
    }
    public static void mayordeedad(){
        System.out.println("*** MAYOR DE EDAD ***");
        int edad;
        System.out.print("Edad: ");
        edad = Leer.entero();
        if (edad>=18) {
            System.out.println("Mayor de Edad");
        } else {
            System.out.println("Menor de Edad");
        }
    }
    public static void parimpar(){
        System.out.println("*** PAR O IMPAR ***");
        int numero;
        System.out.print("Numero: ");
        numero = Leer.entero();
        if (numero%2==1) {
            System.out.println("Impar");
        } else if(numero==0){
            System.out.println("Neutro");
        } else{
            System.out.println("Par");
        }
    }
    public static void primo(){
        System.out.print("Ingrese un número: ");
        int numero, c=0;
        numero = Leer.entero();
        for(int i=1; i<=numero && c<=2; i++){
            System.out.println(numero + " % " + i);
            if(numero%i==0){
                c++;
            }
        }
        if( c==2 ){
            System.out.println("El número "+numero+" es primo");
        }
        else{
            System.out.println("El número "+numero+" no es primo");
        }
    }
        
    
    public static void error(){
        System.out.println("Error. Opción incorrecta");
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos...");
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Factorial");
        System.out.println("2. Mayor de Edad");
        System.out.println("3. PAr Impar");
        System.out.println("4. Primo");
        System.out.println("5. Salir");
        System.out.print("Ingrese opción [1-5]: ");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: factorial();
                        break;
                case 2: mayordeedad();
                        break;
                case 3: parimpar();
                        break;
                case 4: primo();
                        break;
                case 5: salir();
                        break;
                default:error();
            }
        }while(opcion!=5);
    }
    // Método principal
    public static void main(String[] args) {
        inicio();
    }
}
