package ru.job4j.police.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.police.model.Accident;

public interface AccidentRepo extends CrudRepository<Accident, Integer> {
}
