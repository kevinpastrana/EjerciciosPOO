package Ej1;
//Crear una clase Papel. Atributos públicos String color, int grosor. Hacer programa Principal, con un
//método main donde se creen objetos de la clase Papel (con constructor por defecto), dar valor a los
//atributos y consultarlos por consola

public class Papel {

    String color;
    int grosor;

    // Constructor 
    public Papel(String color, int grosor) {
        this.color = color;
        this.grosor = grosor;
    }
    
    public Papel(){
        System.out.println("Se creo el objeto: " + this);
    }
    
    public void mostrarAtributos() {
        System.out.println("Color del papel: " + color);
        System.out.println("Grosor del papel: " + grosor);
    }
}
