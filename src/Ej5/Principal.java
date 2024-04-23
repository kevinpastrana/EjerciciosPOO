package Ej5;

public class Principal {

    public static void main(String[] args) {
        //Crear objeto de la clase Asignatura 
        System.out.println("Asignatura");
        Asignatura asignatura = new Asignatura("Programacion Orientada a Objetos", "con Carlos Pedraza");

        //Obtener y mostrar los atributos de la asignatura
        System.out.println("Nombre: " + asignatura.getNombre());
        System.out.println("Créditos: " + asignatura.getCreditos());
        System.out.println("Profesor: " + asignatura.getProfesor());

        //Intentar establecer créditos a un valor negativo
        asignatura.setCreditos(-3);
        System.out.println("Créditos después de intentar establecer un valor negativo: " + asignatura.getCreditos());

        //Establecer créditos a un valor positivo
        asignatura.setCreditos(10);
        System.out.println("Créditos después de establecer un valor positivo: " + asignatura.getCreditos());
    }
}
