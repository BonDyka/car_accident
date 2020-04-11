package ru.job4j.police.repository;

import ru.job4j.police.model.Accident;

import java.util.List;

public interface AccidentRepo {
    void save(Accident entity);
    void update(Accident entity);
    void delete(Accident entity);

    Accident findById(Integer id);
    List<Accident> findAll();
}
