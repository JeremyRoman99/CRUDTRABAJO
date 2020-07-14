package modularidad;

// Autor: Flor Cerdán
public class Prog008 {

    // Método que reciben parámetros
    public static void saludo(String nombre) {
        System.out.println("Bienvenido " + nombre);
        System.out.println("Disfruta tu estadía en este lugar");
    }

    public static void saludo2(String nombre, String carrera) {
        System.out.println("Disfruta tu estadía en la carrera de" + carrera);
    }
    public static void factorial(int num){
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac*=i;
            
        }
        System.out.println("Factorial de " +num + ": " + fac);
    }

    public static void main(String[] args) {
        saludo("Daniel");
        saludo2("Juan", "Ing. Sistemas");
        factorial(5);
    }

}
