package it.epicode.Catalogo;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Utente utente;
    @ManyToOne
    private ElementoCatalogo elementoPrestato;
    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzioneEffettiva;

    public void setUtente(Utente utente) {
    }

    public void setElementoPrestato(Libro libro) {
    }

    public void setDataInizioPrestito(LocalDate now) {
    }

    public void setDataRestituzionePrevista(LocalDate localDate) {
    }
}