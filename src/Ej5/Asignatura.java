package Ej5;
//Crear clase Asignatura, con lo atributos privados int créditos, String nombre. Crear constructores al gusto.
//Crear getters y setters. No permitir en ninguno de los setters ni en el constructor que se indique un
//valor negativo para el atributo créditos. Probar en una clase con un método main.

public class Asignatura {

    //Atributos privados
    private int creditos;
    private String nombre;
    private String profesor;

    //Constructor
    public Asignatura(int creditos) {
        if (creditos >= 0) {
            this.creditos = creditos;
        } else {
            System.out.println("(No se permitira un valor negativo para créditos. Se establecerá a 0)");
            this.creditos = 0;
        }
    }

    public Asignatura(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    //Getter y Setter para los creditos
    //Getter
    public int getCreditos() {
        return creditos;
    }

    //Setter
    public void setCreditos(int creditos) {
        if (creditos >= 0) {
            this.creditos = creditos;
        } else {
            System.out.println("(No se permitira un valor negativo para créditos. Se establecerá a 0)");
        }
    }

    //Getter y Setter para el nombre    
    //Getter
    public String getNombre() {
        return nombre;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter y Setter para el profesor
    //Getter
    public String getProfesor() {
        return profesor;
    }

    //Setter
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
