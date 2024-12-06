package it.epicode.Catalogo;





import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class MainCreated {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogPU");
        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();


            Libro libro = new Libro();
            libro.setIsbn("1234567890123");
            libro.setTitolo("Pokemon");
            libro.setAnnoPubblicazione(2010);
            libro.setNumeroPagine(3000);
            libro.setAutore("Jackson");
            libro.setGenere("Fantasy Magic");
            em.persist(libro);


            Rivista rivista = new Rivista();
            rivista.setIsbn("1076543210987");
            rivista.setTitolo("Discovery");
            rivista.setAnnoPubblicazione(2023);
            rivista.setNumeroPagine(100);
            rivista.setPeriodicita(Rivista.Periodicita.MENSILE);
            em.persist(rivista);


            Utente utente = new Utente();
            utente.setNumeroTessera(1);
            utente.setNome("Luigi");
            utente.setCognome("Carannante");
            utente.setDataDiNascita("1980-05-15");
            em.persist(utente);


            Prestito prestito = new Prestito();
            prestito.setUtente(utente);
            prestito.setElementoPrestato(libro);
            prestito.setDataInizioPrestito(LocalDate.now());
            prestito.setDataRestituzionePrevista(LocalDate.now().plusDays(30));
            em.persist(prestito);


            em.getTransaction().commit();

            System.out.println("Dati salvati nel database con successo!");
        } catch (Exception e) {

            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {

            em.close();
            emf.close();
        }
    }
}
