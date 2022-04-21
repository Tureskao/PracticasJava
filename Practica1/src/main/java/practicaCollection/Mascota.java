/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaCollection;

/**
 *
 * @author Tureskao
 */
public class Mascota {
    String nombre;
    String especie;
    char sexo;
    String color;
    String pelaje;
    String raza;
    
    /*Constructor*/
    
    public Mascota (String nombre,
            String especie,
            char sexo,
            String color,
            String pelaje,
            String raza){
        this.nombre=nombre;
        this.especie=especie;
        this.sexo=sexo;
        this.color=color;
        this.pelaje=pelaje;
        this.raza=raza;
    }
    
    /*printMascota(): void -> void
    Imprime por consola los atributos de un objeto Mascota*/
    public void PrintMascota(){
    System.out.println("Nombre: "+this.nombre);
    System.out.println("Especie: "+this.especie);
    System.out.println("Sexo: "+this.sexo);
    System.out.println("Color: "+this.color);
    System.out.println("Pelaje: "+this.pelaje);
    System.out.println("Raza: "+this.raza);
    }
    
    
    /*Getters y Setters*/
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre (String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
     public String getEspecie(){
        return this.especie;
    }
     
    public void setEspecie (String nuevaEspecie){
        this.especie = nuevaEspecie;
    }
     
    public char getSexo(){
        return this.sexo;
    }
    
    public void setSexo (char nuevoSexo){
        this.sexo = nuevoSexo;
    }
     
    public String getColor(){
        return this.color;
    }
    
    public void setColor (String nuevoColor){
        this.color = nuevoColor;
    }
     
    public String getPelaje(){
        return this.pelaje;
    }
     
    public void setPelaje (String nuevoPelaje){
        this.pelaje = nuevoPelaje;
    }
}



