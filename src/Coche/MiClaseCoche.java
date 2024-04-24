package Coche;

public class MiClaseCoche {

    // Atributos de la clase
    private String marca;
    private String color;
    private String matricula;
    private int cilindrada;

    // Constructores
    public MiClaseCoche(String marca, String color, String matricula, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public MiClaseCoche() {
    }

    // Métodos de la clase
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
        return cilindrada > 3000;
    }

    // Métodos Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

