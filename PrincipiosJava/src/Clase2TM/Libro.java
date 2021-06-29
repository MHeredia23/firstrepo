package Clase2TM;

import java.util.Objects;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private String cliente;

    public Libro() {}

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getIsbn() {return isbn;}

    public void setIsbn(String isbn) {this.isbn = isbn;}

    public String getAutor() {return autor;}

    public void setAutor(String autor) {this.autor = autor;}

    public String getCliente() {return cliente;}

    public void setCliente(String cliente) {this.cliente = cliente;}

    public boolean prestar(String cliente){
        if(Objects.isNull(this.cliente)){
            this.cliente = cliente;
            return true;
        }
        return false;
    }

    public void devolver(){
        this.cliente = null;
    }
}
