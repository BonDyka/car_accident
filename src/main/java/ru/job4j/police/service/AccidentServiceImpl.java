package ru.job4j.police.service;

import org.springframework.stereotype.Service;
import ru.job4j.police.domain.Accident;
import ru.job4j.police.repos.AccidentRepo;

@Service
public class AccidentServiceImpl implements AccidentService {
    private AccidentRepo accidentRepo;

    public AccidentServiceImpl(AccidentRepo accidentRepo) {
        this.accidentRepo = accidentRepo;
    }

    @Override
    public Iterable<Accident> findAll() {
        return accidentRepo.findAll();
    }

    @Override
    public Accident save(Accident accident) {
        return accidentRepo.save(accident);
    }
}
