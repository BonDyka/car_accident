package ru.job4j.police.service;

import org.springframework.stereotype.Service;
import ru.job4j.police.model.Accident;
import ru.job4j.police.repository.AccidentRepo;

@Service
public class AccidentServiceImpl implements AccidentService {
    private final AccidentRepo accidentRepo;

    public AccidentServiceImpl(AccidentRepo accidentRepo) {
        this.accidentRepo = accidentRepo;
    }

    @Override
    public void save(Accident entity) {
        this.accidentRepo.save(entity);
    }

    @Override
    public Iterable<Accident> findAll() {
        return this.accidentRepo.findAll();
    }
}
