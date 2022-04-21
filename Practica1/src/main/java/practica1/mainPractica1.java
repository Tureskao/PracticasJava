/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.*;

/**
 *
 * @author Tureskao
 */
public class mainPractica1 {

    /**
     * @param args the command line arguments
     */
    
    /*Método de lectura de vectores de números enteros*/
    
    public static void leerVector(int[] vectorInt){
        for (int i=0; i< vectorInt.length; i++){
            System.out.println(vectorInt[i]);
        }
    }
    
    public static void escribirVectorScanner(int[] vectorInt){
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i< vectorInt.length; i++){
            System.out.println("Ingrese numero para la posicion: " + (i+1));
            int tecla = teclado.nextInt();
            vectorInt[i] = tecla;
        }
    }
    public static void main(String[] args) {
        
        /* Práctica de vectores */
        int vectornum[] = new int[5];
        
        escribirVectorScanner(vectornum);
        leerVector(vectornum);
        
        
        
    }
    
}
