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
public class ejercicio1 {


        public static void main(String[] args){
        
        int[] vectorInt = new int[10];
        llenarVector1a100(vectorInt);
    }
    
    public static void llenarVector1a100(int[] vectorInt){
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i< vectorInt.length; i++){
            System.out.println("Ingrese numero para la posicion: " + (i+1));
            int tecla = teclado.nextInt();
            if(tecla<101 && tecla>0){
                vectorInt[i] = tecla;
            } else {
             System.out.println("Error, debe ingresar un numero entre el 1 y el 100");
             i = i-1;
            }
        }
    }
}

