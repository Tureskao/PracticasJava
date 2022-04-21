/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaCollection;
import java.util.*;

/**
 *
 * @author Tureskao
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CONSIGNAS
        
1.      Crear una clase Mascota, que tenga los siguientes atributos: nombre,
        especie, sexo, color, pelaje y raza (tener en cuenta todos sus 
        atributos, constructores y métodos getters y setters). A partir de ello:

a.      Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas 
        en la lista.

b.      Recorrer la lista creada y mostrar por pantalla el nombre, especie
        y pelaje de las mascotas almacenadas.

c.      Durante el recorrido, cambiar el nombre de dos mascotas.
        Volver a recorrer la lista y mostrar los nuevos datos

d.      Agregar dos nuevas mascotas a la lista.

e.      Recorrer la lista pero solo mostrando las mascotas que sean de
        la especie “perro”.*/
        
        
        Mascota Perreke1 = new Mascota 
        ("Jorge",
        "Perro",
        'M',
        "Marron",
        "Pelaje perruno",
        "Raza perro");
        
        Mascota Michi1 = new Mascota
        ("Rosa",
        "Gato",
        'F',
        "Dorado",
        "Pelaje gatuno",
        "Raza perron't");
        
        Mascota Perreke2 = new Mascota 
        ("Jorge2",
        "Perro",
        'M',
        "Marron",
        "Pelaje perruno2",
        "Raza perro2");
        
        Mascota Michi2 = new Mascota
        ("Rosa2",
        "Gato",
        'F',
        "Dorado2",
        "Pelaje gatuno2",
        "Raza perron't2");
        
        Mascota EntidadLoveCraftiana = new Mascota
        ("John Doe",
        "Abominacion de Eldritch",
        '?',
        "Color incomprensible",
        "Escamas, plumas y tentáculos",
        "Raza del abismo");
        
        List <Mascota> listaMascota = new ArrayList<Mascota>();
        listaMascota.add(Perreke1);
        listaMascota.add(Michi1);
        listaMascota.add(Perreke2);
        listaMascota.add(Michi2);
        listaMascota.add(EntidadLoveCraftiana);
        
                
        for(Mascota mascota : listaMascota){
            mascota.PrintMascota();
            System.out.println("\n");
        }
    
    }
}
