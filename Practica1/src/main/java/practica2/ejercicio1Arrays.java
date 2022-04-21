/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;
import java.util.Scanner;
/**
 *
 * @author Tureskao
 */
public class ejercicio1Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* CONSIGNA:
        
        Una matriz de 5 filas x 3 columnas almacena el total de goles de 
        5 jugadores de futbol en los últimos 3 partidos que jugaron, donde cada
        fila representa a un jugador y cada columna a la cantidad de goles que
        hizo. Se necesita un programa que sea capaz de permitir la carga de los
        goles, calcular el promedio de goles realizado por cada jugador y
        almacenar el resultado en un vector de 5 posiciones, donde 
        cada posición representará a un jugador*/
        
        int [][] golesJugadores = new int [5][3];
        float [] promedioJugadores = new float [5];
        inicializarArrayPromedio(promedioJugadores);
        rellenarArray(golesJugadores);
        printArray(golesJugadores);
        promedioArray(golesJugadores,promedioJugadores);
        printVector(promedioJugadores);
    }
    
    
    /*rellenar array: int[][] -> void
    Permite llenar una matriz de números por medio de un input*/
    public static void rellenarArray(int [][] array){
        Scanner teclado = new Scanner (System.in);
        for(int i = 0; i < array.length; i++){
            for (int j=0 ; j < array[i].length; j++){
                System.out.println("Ingrese los goles del jugador "+i+
                        " realizados el dia: "+ j);
                int tecla = teclado.nextInt();
                array[i][j] = tecla;
            }
        }
    }
    
   /*printArray: int[][] -> void
    Imprime por consola los elementos de una matriz, con el formato
    "fila - columna: elemento[fila][columna]"*/
    
    public static void printArray(int [][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0; j < array[i].length; j++){
                System.out.println(i+"-"+j+": "+ array[i][j]);
            }
        }
    }
    
    /*printVector: int[] -> void
    Imprime por consola los elementos de un vector, con el formato
    "columna: elemento[columna]"*/
    
    public static void printVector(float [] vector){
        for (int i=0; i<vector.length; i++){
            System.out.println(i+": "+ vector[i]);
        }
    }
    
    /*inicializarArrayPromedio: float[] -> void
    Rellena un vector de floats de tamaño n, con n ceros (0)
    Es necesario que el vector de promedios inicie con 0 en todos sus elementos 
    para sumarle otros elementos que luego serán divididos por la cantidad de 
    elementos sumados (calculo de promedio)*/
    
    public static void inicializarArrayPromedio(float[]vector){
        for (int i = 0; i < vector.length; i++){
            vector[i] = 0;
        }
    }
   
    /*promedioArray: int[][],float[] -> void
    Calcula el promedio de los elementos de la matriz de int, y luego guarda
    los promedios en un vector de floats*/
    public static void promedioArray(int [][] array, float [] vector){
        for (int i=0;i < array.length ;i++){
            for (int j=0; j < array[i].length; j++){
                vector[i]+= array[i][j];
            }
            float promedioActual = vector[i]/array[i].length;
            System.out.println("El jugador "+i+" hizo "+ vector[i]+" goles en los ultimos "+
                    array[i].length + " dias, por tanto tiene un promedio de "+ promedioActual);
            vector[i] = promedioActual;
        }
    } 
    
}
