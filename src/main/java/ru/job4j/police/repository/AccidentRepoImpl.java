package ru.job4j.police.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.job4j.police.model.Accident;

import java.util.List;

@Repository
public class AccidentRepoImpl implements AccidentRepo {

    private final SessionFactory sessionFactory;

    public AccidentRepoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Accident entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

    @Override
    public void update(Accident entity) {

    }

    @Override
    public void delete(Accident entity) {

    }

    @Override
    public Accident findById(Integer id) {
        return sessionFactory.openSession().load(Accident.class, id);
    }

    /** @noinspection SyntaxError*/
    @Override
    public List<Accident> findAll() {
        return this.sessionFactory.openSession().createQuery("from Accident", Accident.class).list();
    }
}
