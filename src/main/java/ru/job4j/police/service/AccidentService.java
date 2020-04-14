package ru.job4j.police.service;

import ru.job4j.police.model.Accident;

public interface AccidentService {

    void save(Accident entity);
    Iterable<Accident> findAll();
}
