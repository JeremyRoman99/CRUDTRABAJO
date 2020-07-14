/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

// Desarrollar un programa que permita el ingreso de valores

import utils.Leer;

// a un arreglo y muestre la sumatoria de sus elementos. Utilizando métodos.
public class Prog101 {
    public static int[] numeros = new int[1000];
    public static int cantidad;
    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = Leer.entero();
        }
    }
    public static void sumatoria(){
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma+=numeros[i];
            
        }
        System.out.println("Resultado(Sumatoria):" + suma );
    }
    public static void inicio(){
        System.out.print("cantidad: ");
        cantidad = Leer.entero();
        escribirarreglo();
        sumatoria();
        
    }

    public static void main(String[] args) {
        
        inicio();
    }
    
}
