package Coche;

public class Inicio {

    public static void main(String[] args) {
        MiClaseCoche coche1 = new MiClaseCoche();
        coche1.setMarca("BMW");
        coche1.setColor("Negro");
        coche1.setMatricula("RFG564");
        coche1.setCilindrada(2000);

        System.out.println("La marca del coche es: " + coche1.getMarca());
        System.out.println("El color antes es: " + coche1.getColor());
        // Llamamos la variable y que nos diga si es metalizado o no
        coche1.dimeSiEsMetalizado();
        coche1.setColor("Blanco");
        System.out.println("El color despues es: " + coche1.getColor());
        coche1.dimeSiEsMetalizado();
        
        System.out.println("Matricula antes: " + coche1.getMatricula());
        coche1.cambiarMatricula("ABC000");
        System.out.println("Matricula nueva: " + coche1.getMatricula());
     
       if (coche1.altaCilindrada())
           System.out.println("El coche tiene alta cilindrada");
       else
            System.out.println("El coche tiene baja cilindrada");
       
       MiClaseCoche coche2 = new MiClaseCoche("BMW", "Plata", "DSC213", 2300);
        System.out.println("");
        System.out.println("Coche 2");
        System.out.println("Marca: " +coche2.getMarca());
        System.out.println("Color: " +coche2.getColor());
        System.out.println("Placa: " +coche2.getMatricula());
        System.out.println("Cilindrada: " +coche2.getCilindrada());
    }   
}

