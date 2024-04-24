package Libro;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    // Constructores
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public Libro() {
    }

    // Métodos Getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }
    

    // Método prestar
    public boolean prestar() {
        if (prestados < ejemplares) {
            prestados++;
            return true;
        } else {
            return false;
        }
    }
}
