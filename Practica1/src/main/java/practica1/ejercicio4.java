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
public class ejercicio4 {

    /**
     * @param vectorTemp
     */
    
     public static void llenarVector(int[] vectorTemp){
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i< vectorTemp.length; i++){
            System.out.println("Ingrese numero para la posicion: " + (i+1));
            int tecla = teclado.nextInt();
            vectorTemp[i] = tecla;
        }
    }
     
     public static void printVector(int[]vector){
         for(int i=0;i<vector.length;i++){
             System.out.println(i + ": " + vector[i]);
         }
     }
     
    public static void main(String[] args) {
        
        /*En un vector de 23 posiciones se tienen las temperaturas máximas 
        de las capitales de las 23 provincias argentinas en el último mes.
        A partir de esta información, un noticiero desea determinar el top 5
        de las temperaturas más altas para poder mostrar en la pantalla de su
        programa, para ello se necesita un programa que sea capaz de recorrer
        el vector de temperaturas, determinar las 5 más altas y copiarlas en
        un nuevo vector de 5 posiciones*/
        
        int [] vectorTemp = new int[23];
        int [] vectorMax = new int[5];
        
        llenarVector(vectorTemp);
        
        
        /*Bubblesort para vectores de mayor a menor*/
        for(int i=0; i<(vectorTemp.length - 1); i++){
            for(int j=i+1; j<vectorTemp.length; j++){
                if(vectorTemp[j]>vectorTemp[i]){
                    int auxiliarVar = vectorTemp[i];
                    vectorTemp[i]=vectorTemp[j];
                    vectorTemp[j]=auxiliarVar;
                }
            }
        }
        
        /*Relleno un vector con los primeros 5 elementos del vector ordenado
        de mayor a menor en el paso anterior*/
        for(int i=0; i<vectorMax.length; i++){
            vectorMax[i] = vectorTemp[i];
        }
        
        /*Leo el vector con las 5 mayores temperaturas registradas*/
        printVector(vectorMax);
        
    }
    
}
