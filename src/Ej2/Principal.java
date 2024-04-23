package Ej2;

public class Principal {
    
    public static void main(String[] args) {
        
        Mascara mascara1 = new Mascara();
        Mascara mascara2 = new Mascara();
        Mascara mascara3 = new Mascara();

        mascara1.personaje = "Batman";
        mascara1.tienePelo = false;

        mascara2.personaje = "Spiderman";
        mascara2.tienePelo = true;

        mascara3.personaje = "Iron Man";
        mascara3.tienePelo = false;

        // Mostrar atributos de mascara1
        System.out.println("");
        System.out.println("Atributos de la mascará 1:");
        mascara1.mostrarAtributos();

        // Mostrar atributos de mascara2
        System.out.println("\nAtributos de la mascará 2:");
        mascara2.mostrarAtributos();

        // Mostrar atributos de mascara3
        System.out.println("\nAtributos de la mascará 3:");
        mascara3.mostrarAtributos();
    }
}
