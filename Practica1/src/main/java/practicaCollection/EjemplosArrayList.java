/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaCollection;

/*RECORDAR, para poder utilizar la biblioteca de listas, hay que importarlas*/
import java.util.*;

/**
 *
 * @author Tureskao
 */
public class EjemplosArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Como declarar un ArrayList
            List <TIPO-OBJETO> nombreArray = new ArrayList<TIPO-OBJETO>();*/
        
        /*IMPORTANTE: Los ArrayList no toman tipos primitivos, sí o sí toman 
        objetos; cuando se quiera invocar un ArrayList con un tipo primitivo
        hay que usar los Wrappers, que son objetos que contienen tipos 
        primitivos */
        /* EJEMPLOS:
        
        WRAPPERS            PRIMITIVOS
        - Integer    <->    - int
        - Boolean    <->    - boolean
        - Long       <->    - long
        - Float      <->    - float
        
        */
        
        /*Declarar un ArrayList de ints, utilizando el Wrapper Integer*/
        List <Integer> listaInt = new ArrayList<>();
        listaInt.add(2);
        for(int i=0; i<listaInt.size();i++){
            System.out.println( "Array de numeros \n"+
                    "Pos: "+i+" num: "+listaInt.get(i));
        }
        
        /*Declarar un ArrayList de strings, String es un tipo de objeto*/
        List <String> listaStr = new ArrayList<>();
        listaStr.add("String");
        for(String str : listaStr){
            System.out.println( "Array de string \n"+
                    "Pos: "+ listaStr.indexOf(str)+" str: "+str);
        }
    }
    
    /*Declarando ArrayList*/
    
    
}
