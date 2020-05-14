package ru.job4j.police.repos;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.police.domain.Accident;

public interface AccidentRepo extends CrudRepository<Accident, Integer> {
}
