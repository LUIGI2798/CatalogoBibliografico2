package it.epicode.Catalogo;

import javax.persistence.Entity;

@Entity
public class Libro extends ElementoCatalogo {
    private String autore;
    private String genere;
}