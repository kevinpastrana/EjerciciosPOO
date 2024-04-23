package Ej4;

public class Principal {
    public static void main(String[] args) {
        
        Vivienda vivienda1 = new Vivienda();           
        Vivienda vivienda2 = new Vivienda();        
        Vivienda vivienda3 = new Vivienda();
        Vivienda vivienda4 = new Vivienda();
        Vivienda vivienda5 = new Vivienda();
        
        vivienda1.calle = "Calle 56";
        vivienda1.numero = 12;
        vivienda1.precio = 1250000;
        vivienda1.conGaraje = true;
        vivienda1.superficie = 144;
        
        vivienda2.calle = "Calle 57";
        vivienda2.numero = 13;
        vivienda2.precio = 1250000;
        vivienda2.conGaraje = true;
        vivienda2.superficie = 144;
        
        vivienda3.calle = "Calle 58";
        vivienda3.numero = 14;
        vivienda3.precio = 1250000;
        vivienda3.conGaraje = true;
        vivienda3.superficie = 144;
        
        vivienda4.calle = "Calle 59";
        vivienda4.numero = 15;
        vivienda4.precio = 1250000;
        vivienda4.conGaraje = true;
        vivienda4.superficie = 144;
        
        vivienda5.calle = "Calle 60";
        vivienda5.numero = 16;
        vivienda5.precio = 1250000;
        vivienda5.conGaraje = true;
        vivienda5.superficie = 144;        
        
        System.out.println("");
        System.out.println("Bienvenido al Conjunto Residencial Fjodur");        
        
        // Mostrar atributos de cada objeto
        System.out.println("");
        System.out.println("Atributos de la vivienda 1:");
        vivienda1.mostrarAtributos();

        System.out.println("\nAtributos de la vivienda 2:");
        vivienda2.mostrarAtributos();

        System.out.println("\nAtributos de la vivienda 3:");
        vivienda3.mostrarAtributos();

        System.out.println("\nAtributos de la vivienda 4:");
        vivienda4.mostrarAtributos();

        System.out.println("\nAtributos de la vivienda 5:");
        vivienda5.mostrarAtributos();
    }
}
