package ru.job4j.police.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.job4j.police.model.Accident;
import ru.job4j.police.repository.AccidentRepo;

import java.util.List;

@Service
public class AccidentServiceImpl implements AccidentService {
    private AccidentRepo accidentRepo;

    @Autowired
    public AccidentServiceImpl(AccidentRepo accidentRepo) {
        this.accidentRepo = accidentRepo;
    }

    @Override
    public void save(Accident entity) {
        this.accidentRepo.save(entity);
    }

    @Override
    public void update(Accident entity) {
        this.accidentRepo.update(entity);
    }

    @Override
    public void delete(Accident entity) {
        this.accidentRepo.delete(entity);
    }

    @Override
    public Accident findById(Integer id) {
        return this.accidentRepo.findById(id);
    }

    @Override
    public List<Accident> findAll() {
        return this.accidentRepo.findAll();
    }
}
