package ru.job4j.police.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.job4j.police.model.Accident;

import java.util.List;

@Repository
public class AccidentRepoImpl implements AccidentRepo {
//    private List<Accident> database = List.of(
//            new Accident(1, "test", "test", "test"),
//            new Accident(2, "test2", "test2", "test2"),
//            new Accident(3, "test3", "test3", "test3")
//    );

    private SessionFactory sessionFactory;

    @Autowired
    public AccidentRepoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Accident entity) {

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

    @Override
    public List<Accident> findAll() {
        return this.sessionFactory.openSession().createQuery("from Accident", Accident.class).list();
    }
}
