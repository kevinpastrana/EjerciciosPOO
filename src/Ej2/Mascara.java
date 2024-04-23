package Ej2;
//Crear una clase Mascara. Atributos públicos String personaje, boolean tienePelo. Hacer programa Principal,
//con un método main donde se creen objetos de la clase, con constructor por defecto, dar valor a los
//atributos y consultarlos por consola

public class Mascara {

    String personaje;
    boolean tienePelo;

    //Constructores String y Booleano
    public Mascara(String personaje, boolean tienePelo) {
        this.personaje = personaje;
        this.tienePelo = tienePelo;
    }

    //Creacion de objeto
    public Mascara() {
        System.out.println("Se creo el objeto: " + this);
    }

    public void mostrarAtributos() {
        System.out.println("Tu personaje: " + personaje);
        System.out.println("¿Tiene pelo?: " + tienePelo);
    }
}
