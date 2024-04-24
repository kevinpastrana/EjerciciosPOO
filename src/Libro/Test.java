package Libro;

public class Test {
    public static void main(String[] args) {
                                //(String titulo, String autor, int ejemplares, int prestados)
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 10, 10);
        System.out.println("Número de ejemplares prestados: " + libro.getPrestados());
        if (libro.prestar()) {
            System.out.println("Préstamo exitoso.");
        } else {
            System.out.println("No se puede prestar más ejemplares.");
        }
    }
}

