package com.alura.literatura.dto;

import com.alura.literatura.service.LibroService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LibroDto {

    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String titulo;

    @JsonProperty("authors")
    private List<AutorDto> autores;


    @JsonProperty("languages")
    private List<String> idiomas;


    @JsonProperty("download_count")
    private int numeroDescargas;

    // Getters y Setters

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


    public List<AutorDto> getAutores() {
        return autores;
    }


    public void setAutores(List<AutorDto> autores) {
        this.autores = autores;
    }


    public List<String> getIdiomas() {
        return idiomas;
    }


    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }


    public int getNumeroDescargas() {
        return numeroDescargas;
    }


    public void setNumeroDescargas(int numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }
}
