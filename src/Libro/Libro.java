package Libro;

public class Libro {

    //Atributos
    String titulo;
    String autor;
    int ejemplares;
    int prestados;

    //Constructores
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public Libro() {
    }
    
    //Metodos
    public boolean prestar(){
        if (this.prestados<this.ejemplares) {
            this.prestados++;
            return true;
        } else
            return false;
    }
}
