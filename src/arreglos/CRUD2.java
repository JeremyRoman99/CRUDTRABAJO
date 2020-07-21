
package arreglos;
import utils.Leer;
import java.util.Scanner;


public class CRUD2 {
    public static int posicion = -1;       
    public static void suma(){
      
        Scanner teclado;
        int primerNumero, segundoNumero;
 
        teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "Su suma es: " );
        System.out.println( primerNumero+segundoNumero );	
    
        
        
    }
    public static void paroimpar(){
       int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
        

    }
    public static void multiplicacion(){
        Scanner teclado;
        int primerNumero, segundoNumero;
 
        teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "Su multiplicacion es: " );
        System.out.println( primerNumero*segundoNumero );
    }
    public static void fibonacci(){
        Scanner teclado = new Scanner(System.in);
        int x = 0, y = 1, z, numero;
       
        System.out.print("Ingrese cantidad de elementos para la serie: ");
        numero = teclado.nextInt();
       
        for (int i = 0; i < numero; i++) {
            System.out.println("fibonacci:"+x );
            z = x + y;
            x = y;
            y = z;
        }
        
    }
    public static void factorial(){
        long factorial=1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        
        
    }
    public static void salir(){
        System.out.println("gracias por su visitar");
        
    }
    public static void error(){
        System.out.println("error, opcion incorrecta");
    }
    public static void menu(){
        System.out.println("menu principal");
        System.out.println("1.suma");
        System.out.println("2.par o impar");
        System.out.println("3.multiplicacion");
        System.out.println("4.fibonacci");
        System.out.println("5.factorial");
        System.out.println("6.salir");
        System.out.println("escoja una de las opciones: ");
        
    }
    public static void inicio(){
        int opcion;
        do {            
            menu();
            opcion = Leer.entero();
            switch(opcion){

                case 1: suma();
                   break;
                case 2: paroimpar();
                   break;
                case 3: multiplicacion();
                   break;
                case 4: fibonacci();
                   break;
                case 5: factorial();
                   break;
                case 6: salir();
                   break;
                default:
                    error();
            }            
        } while (true);
        
    }
    public static void main(String[] args) {
     inicio();   
    }
}
