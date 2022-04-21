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
public class ejercicio2 {

    /**
     * @param vectorInt
     * @param args the command line arguments
     */

    public static void escribirVectorScanner(int[] vectorInt){
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i< vectorInt.length; i++){
            System.out.println("Ingrese edad para el alumno n°: " + (i+1));
            int tecla = teclado.nextInt();
            vectorInt[i] = tecla;
        }
    }
    
    public static void main(String[] args) {
        
        /*En un vector de 15 posiciones se almacenan las edades de 15 alumnos. 
        Se desea un programa que sea capaz de determinar cuál es la mayor edad y
        cuál es la menor edad que se encuentra entre los estudiantes.*/
        
        /*Declaro la lista de 15 alumnos*/
        int[]vectorAlumnos = new int[15];
        /*Relleno el vector con las edades*/
        escribirVectorScanner(vectorAlumnos);
        
        /*Declaro los ints min, que representa la edad minima, 
        max que representa la edad maxima, minPos que representa la posicion 
        en el vector de la edad minima y maxPos que representa la posicion 
        en el vector de la edad maxima*/
        
        int min = vectorAlumnos[0], max = vectorAlumnos [0], 
                minPos = 0, maxPos = 0;
        
        /*Itero en la lista a partir de la segunda posicion, 
        reemplazando los valores declarados en caso de que exista un 
        nuevo minimo y un nuevo maximo*/
        
        for(int i = 1; i < vectorAlumnos.length; i++){
            if (vectorAlumnos[i]<=min){
                min = vectorAlumnos[i];
                minPos = i;
            } else {
                if(vectorAlumnos[i] >=max){
                    max = vectorAlumnos[i];
                    maxPos = i;
                }
            }
        }
        
        /*Imprimo por consola los resultados*/
        System.out.println("El alumno con la mayor edad tiene "+ 
                max + " años y está en la posicion: " + (maxPos + 1));
        System.out.println("El alumno con la menor edad tiene "+
                min + " años y está en la posicion: " + (minPos + 1));
                
    }
    
}
