package com.diw.practica1;

import jakarta.persistence.*;

@Entity
@Table(name = "Libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    private int anio;
    private float precio;

    private enum estado {TRAMITADO, PENDIENTE, ESPERA};
    @Enumerated (EnumType.STRING)
    private estado estadoLibro;

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public estado getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(estado estadoLibro) {
        this.estadoLibro = estadoLibro;
    }
}
