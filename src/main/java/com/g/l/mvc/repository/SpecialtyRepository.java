package com.g.l.mvc.repository;

import com.g.l.mvc.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpecialtyRepository extends JpaRepository<Specialty, String> {
}
