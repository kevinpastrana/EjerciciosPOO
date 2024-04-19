package Libro;

public class Test {

    public static void main(String[] args) {
        Libro l = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 10, 0);
        System.out.println("Numero de prestados: " + l.prestados);
        if (l.prestar()) {
            System.out.println("Prestamo exitoso");
            System.out.println("Numero de prestados: " + l.prestados);
        } else {
            System.out.println("No se puede prestar");
            System.out.println("Numero de prestados: " + l.prestados);
        }

    }
}
