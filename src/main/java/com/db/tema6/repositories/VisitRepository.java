package com.db.tema6.repositories;

import com.db.tema6.models.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Integer> {
}
