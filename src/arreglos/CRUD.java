
package arreglos;
import utils.Leer;
/*
persona
-nomnre
-dni
-fecha de naciemiento
menu principal
 agregar personas
eliminar persoas
editar personar
listar personas
ssalir
*/
public class CRUD {
    //variables
    public static String[] nombre = new String[1000];
    public static String[] dni = new String[1000];   
    public static String[] fnacimiento = new String[1000];
    public static int posicion = -1;
    
    public static void agregarpersona(){
        String continuar;
        do {            
            posicion++;
        System.out.println("Agregar persona");
        System.out.print("nombre: ");
        nombre[posicion] = Leer.cadena();
        System.out.print("DNI: ");
        dni[posicion] = Leer.cadena();
        System.out.print("fecha de nacimiento: ");
        fnacimiento[posicion] = Leer.cadena();
        System.out.print("deseas agregar otro s/n: ");
        continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
        
    }
    public static void eliminarpersona(){
        listarpersona();
        System.out.print("ingrese el mumero de la persona a aeliminar: ");
        int numero = Leer.entero();
        numero--;
        for (int i = numero; i <= posicion; i++) {
            nombre[i]= nombre[i+1];
            dni[i]= dni[i+1];
            fnacimiento[i]= fnacimiento[i+1];
        }
        nombre[posicion]= "";
        dni[posicion]= "";
        fnacimiento[posicion]= "";
        posicion--;
        

    }
    public static void editarpersona(){
        listarpersona();
        System.out.println("ingrese el numero de la persona a editar: ");
        int numero = Leer.entero();
        numero--;
        System.out.println("resultado:" +nombre[numero]+ "(" +dni[numero]+")- "+ fnacimiento[numero]);
        System.out.println("nuevo nombre: ");
        nombre[numero]=Leer.cadena();
        System.out.println("nuevo dni: ");
        dni[numero]=Leer.cadena();
        System.out.println("nueva fecha de nacimiento: ");
        fnacimiento[numero]=Leer.cadena();
    }
    public static void listarpersona(){
        System.out.println("listado");
        System.out.println("N\tDNI\t\tf.NAC. \t\tNombre Completo");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i+1)+"\t"+ dni[i]+ "\t" + fnacimiento[i]+ "\t" +nombre[i]);
        }
        
    }
    public static void salir(){
        System.out.println("gracias por su visitar");
        
    }
    public static void error(){
        System.out.println("error, opcion incorrecta");
    }
    public static void menu(){
        System.out.println("menu principal");
        System.out.println("1.agregar");
        System.out.println("2.eliminar");
        System.out.println("3.editar");
        System.out.println("4.listar");
        System.out.println("5.salir");
        System.out.println("escoja una de las opciones: ");
        
    }
    public static void inicio(){
        int opcion;
        do {            
            menu();
            opcion = Leer.entero();
            switch(opcion){

                case 1: agregarpersona();
                   break;
                case 2: eliminarpersona();
                   break;
                case 3: editarpersona();
                   break;
                case 4: listarpersona();
                   break;
                case 5: salir();
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
