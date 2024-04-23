package Ej6;
//Crear la clase Chalet. Atributos privados String calle, int numParcela, double precio, int superficie, boolean
//conPiscina. Crear constructores por defecto como se desee. Crear getters y setters, que cumplan estas
//validaciones: numParcela ha de estar entre 1-10, precio no puede ser negativo, superficie no puede ser
//negativo ni mayor de 2000. Probar en una clase con un método main.

public class Chalet {

    //Atributos privados
    private String calle;
    private int numParcela;
    private double precio;
    private int superficie;
    private boolean conPiscina;

    //Constructor
    public Chalet(String calle, int numParcela, double precio, int superficie, boolean conPiscina) {
        this.calle = calle;
        this.numParcela = numParcela;
        this.precio = precio;
        this.superficie = superficie;
        this.conPiscina = conPiscina;

        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("No se permite un numero negativo (Se establece a 0)");            
        }

        if (superficie >= 0 && superficie <= 2000) {
            System.out.println("La superficie no puede ser negativo ni mayor a 2000");
        }
        
        if (numParcela >= 1 && numParcela <= 10) {
            System.out.println("El numero de la parcela ha de estar entre 1 y 10");
        }
        
    }

    //Getters
    public String getCalle() {
        return calle;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSuperficie() {
        return superficie;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    //Setters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }

}
