package com.alura.literatura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaLibroDto {

    @JsonProperty("results")
    private List<LibroDto> libros;


    public List<LibroDto> getLibros() {
        return libros;
    }


    public void setLibros(List<LibroDto> libros) {
        this.libros = libros;
    }

}
