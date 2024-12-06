package it.epicode.Catalogo.Dao;



import javax.persistence.EntityManager;
import java.util.List;

public class GenericDaoImpl<T> implements GenericDao<T> {
    private final EntityManager em;

    public GenericDaoImpl(EntityManager em, Class<T> clazz) {
        this.em = em;
    }

    @Override
    public void save(T t) {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T findById(Object id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

}
