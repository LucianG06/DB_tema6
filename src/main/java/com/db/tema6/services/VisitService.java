package com.db.tema6.services;

import com.db.tema6.models.Visit;
import com.db.tema6.repositories.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

    public List<Visit> getAllVisits() {
        List<Visit> aux = new ArrayList<>();
        visitRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Visit> getVisitById(Integer id) {
        return visitRepository.findById(id);
    }

    public void insertVisit(Visit visit) {
        visitRepository.save(visit);
    }

    public void updateVisit(Visit visit) {
        visitRepository.save(visit);
    }

    public void deleteVisit(Visit visit) {
        visitRepository.delete(visit);
    }
}
