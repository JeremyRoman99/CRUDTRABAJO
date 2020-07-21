
package arreglos;

import utils.Leer;


public class CRUD3 {
    //variables
    public static String[] placa = new String[1000];
    public static String[] marca = new String[1000];
    public static String[] modelo= new String[1000];
    public static String[] telefono = new String[1000];
    public static int posicion = -1;
    
    public static void agregarauto(){
        String continuar;
        do {            
            posicion++;
        System.out.println("agregar auto");
        System.out.print("placa: ");
        placa[posicion] = Leer.cadena();
        System.out.print("marca del auto: ");
        marca[posicion] = Leer.cadena();
        System.out.print("modelo: ");
        modelo[posicion] = Leer.cadena();
        System.out.print("telefono del propietario: ");
        telefono[posicion] = Leer.cadena();
        System.out.print("deseas agregar otro s/n: ");
        continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
        
    }
    public static void eliminarauto(){
        listarauto();
        System.out.print("ingrese el mumero de la persona a aeliminar: ");
        int numero = Leer.entero();
        numero--;
        for (int i = numero; i <= posicion; i++) {
            placa[i]= placa[i+1];
            marca[i]= marca[i+1];
            modelo[i]= modelo[i+1];
            telefono[i]= telefono[i+1];
        }
        placa[posicion]= "";
        marca[posicion]= "";
        modelo[posicion]= "";
        telefono[posicion]= "";
        posicion--;
        

    }
    public static void editarauto(){
        listarauto();
        System.out.println("ingrese el numero de la persona a editar: ");
        int numero = Leer.entero();
        numero--;
        System.out.println("resultado:" +placa[numero]+ "(" +marca[numero]+"(" +modelo[numero]+")- "+ telefono[numero]);
        System.out.println("nueva placa: ");
        placa[numero]=Leer.cadena();
        System.out.println("nueva marca: ");
        marca[numero]=Leer.cadena();
        System.out.println("nuevo telefono: ");
        modelo[numero]=Leer.cadena();
        System.out.println("nueva fecha de nacimiento: ");
        telefono[numero]=Leer.cadena();
    }
    public static void listarauto(){
        System.out.println("listado");
        System.out.println("N\tMARCA\tMODELO\tTELEFONO\tPLACA");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i+1)+"\t"+ marca[i]+"\t"+ modelo[i]+ "\t" + telefono[i]+ "\t" +placa[i]);
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
        System.out.println("1.agregar auto");
        System.out.println("2.eliminar auto");
        System.out.println("3.editar auto");
        System.out.println("4.listar auto");
        System.out.println("5.salir");
        System.out.println("escoja una de las opciones: ");
        
    }
    public static void inicio(){
        int opcion;
        do {            
            menu();
            opcion = Leer.entero();
            switch(opcion){

                case 1: agregarauto();
                   break;
                case 2: eliminarauto();
                   break;
                case 3: editarauto();
                   break;
                case 4: listarauto();
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
