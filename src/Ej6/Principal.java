package Ej6;

public class Principal {

    public static void main(String[] args) {
        //Crear objeto de Chalet con valores válidos
        System.out.println("Chalet");
        Chalet chalet = new Chalet("Calle Principal", 3, 140000, 500, false);

        //Obtener y mostrar los atributos
        System.out.println("==============================");
        System.out.println("¿Cuál es la Calle?: " + chalet.getCalle());
        System.out.println("¿Cuál es el Número de Parcela?: " + chalet.getNumParcela());
        System.out.println("¿De cuánto es el Precio?: " + chalet.getPrecio());
        System.out.println("¿De cuánto es la Superficie?: " + chalet.getSuperficie());
        System.out.println("¿El chalet cuenta con piscina?: " + chalet.isConPiscina());
        System.out.println("==============================");
    }
}

