package it.epicode.Catalogo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


    @Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    public abstract class ElementoCatalogo {
        @Id
        private String isbn;
        private String titolo;
        private int annoPubblicazione;
        private int numeroPagine;

        public void setIsbn(String number) {
        }

        public void setTitolo(String ilSignoreDegliAnelli) {
        }

        public void setAnnoPubblicazione(int i) {
        }

        public void setNumeroPagine(int i) {
        }

        public void setAutore(String s) {
        }

        public void setGenere(String fantasy) {
        }

        public void setPeriodicita(Rivista.Periodicita periodicita) {

        }
    }

