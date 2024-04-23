package Ej1;

public class Principal {

    public static void main(String[] args) {

        Papel p1 = new Papel();
        Papel p2 = new Papel();
        Papel p3 = new Papel();

        p1.color = "Azul";
        p1.grosor = 1;

        p2.color = "Negro";
        p2.grosor = 2;

        p3.color = "Verde";
        p3.grosor = 3;

        // Mostrar atributos de p1
        System.out.println("");
        System.out.println("Atributos del papel p1:");
        System.out.println("Color: " + p1.color);
        System.out.println("Grosor: " + p1.grosor);

        // Mostrar atributos de p2
        System.out.println("\nAtributos del papel p2:");
        System.out.println("Color: " + p2.color);
        System.out.println("Grosor: " + p2.grosor);

        // Mostrar atributos de p3
        System.out.println("\nAtributos del papel p3:");
        System.out.println("Color: " + p3.color);
        System.out.println("Grosor: " + p3.grosor);
    }
}
