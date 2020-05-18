package ru.job4j.police.service;

import ru.job4j.police.domain.Accident;

public interface AccidentService {
    Iterable<Accident> findAll();
    Accident save(Accident accident);
}
