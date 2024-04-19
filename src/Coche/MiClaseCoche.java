package Coche;

public class MiClaseCoche {

    //Atributos de la clase
    String marca;
    String color;
    String matricula;
    int cilindrada;

    //Metodos constructrores
    public MiClaseCoche(String marca, String color, String matricula, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public MiClaseCoche() {
    }
    
    
    //Metodos de la clase
    public void dimeSiEsMetalizado() {
        if (color.equals("Negro")) {
            System.out.println("El coche tiene pintura metalizada");
        } else {
            System.out.println("El coche no tiene pintura metalizada");
        }
    }

    public void cambiarMatricula(String matriculaNueva) {
        matricula = matriculaNueva;
    }

    public boolean altaCilindrada() {
        if (cilindrada > 3000) {
            return true;
        } else {
            return false;
        }
    }

}
