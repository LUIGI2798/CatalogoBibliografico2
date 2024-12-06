package it.epicode.Catalogo;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
    @Id
    private int numeroTessera;
    private String nome;
    private String DataDiNascita;
    private String cognome;

    public void setNumeroTessera(int i) {
    }

    public void setNome(String mario) {
    }

    public void setCognome(String rossi) {
    }

    public void setDataDiNascita(String date) {
    }
}
