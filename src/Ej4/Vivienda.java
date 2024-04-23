package Ej4;
//Crear la clase Vivienda. Atributos públicos String calle, int numero, double precio, int superficie, boolean
//conGarage. Crear al menos dos constructors y ademas uno por defecto. Hacer programa Principal, con
//un método main donde se creen objetos de la clase con todos los constructores, y consultar sus
//atributos por consola
public class Vivienda {
    
    String calle;
    int numero;
    double precio;
    int superficie;
    boolean conGaraje;

    // Constructor con todos los atributos
    public Vivienda(String calle, int numero, double precio, int superficie, boolean conGaraje) {
        this.calle = calle;
        this.numero = numero;
        this.precio = precio;
        this.superficie = superficie;
        this.conGaraje = conGaraje;
    }

    // Constrcutores por aparte
    //String
    public Vivienda(String calle) {
        this.calle = calle;
    }

    //Booleano
    public Vivienda(boolean conGaraje) {
        this.conGaraje = conGaraje;
    }
    
    // Int y Double
    public Vivienda(int numero, double precio, int superficie) {
        this.numero = numero;
        this.precio = precio;
        this.superficie = superficie;
    }

    public Vivienda(){
        System.out.println("Se creo el objeto" + this);
    }
    
    public void mostrarAtributos() {  
        System.out.println("¿Qué calle es?: " + calle);
        System.out.println("¿Tiene garaje?: " + conGaraje);    
        System.out.println("¿Qué número es?: " + numero);
        System.out.println("¿Cuál es el precio?: $" + precio);
        System.out.println("¿De cuánto es la superficie?: " + superficie + "Mts²" );
    }
}
