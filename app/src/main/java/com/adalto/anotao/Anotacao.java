package com.adalto.anotao;

public class Anotacao {

    private String id;
    private String titulo, texto;


    @Override
    public String toString() {
        return this.titulo + "\n" + this.texto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
