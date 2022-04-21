/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Tureskao
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Se necesita un vector que permita cargar por teclado el nombre de 
        10 animales. A partir de esta carga, se desea otro vector que copie
        los mismos nombres pero en el orden inverso, es decir, si los nombres
        son: perro, gato, lagartija, el nuevo vector debe contener: 
        lagartija, gato, perro.
        Una vez realizado el cambio, mostrar por pantalla ambos vectores para
        compararlos.

*/
        
        String [] vectorAnimales = new String [10];
        llenarVector(vectorAnimales);
        String [] vectorAnimalesInvertido = new String [10];
        System.arraycopy(vectorAnimales, 0, vectorAnimalesInvertido, 0, 
                vectorAnimales.length);
        invertirVector(vectorAnimalesInvertido);
        System.out.println("Usted ingreso: ");
        printVector(vectorAnimales);
        System.out.println("La lista invertida es: ");
        printVector(vectorAnimalesInvertido);
        
    }
    
    public static void llenarVector(String[] vector){
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i< vector.length; i++){
            System.out.println("Ingrese nombre de animal para la posicion: " +
                    (i+1));
            String tecla = teclado.nextLine();
            vector[i] = tecla;
        }
    }
    public static void printVector(String[] vector) {
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    public static void invertirVector(String[] vector){  
        for(int i=0; i<(vector.length/2);i++){
            String stringAuxiliar = vector[i];
            vector[i]=vector[vector.length - (i+1)];
            vector[vector.length-(i+1)] = stringAuxiliar;
        }
    }
    
}
