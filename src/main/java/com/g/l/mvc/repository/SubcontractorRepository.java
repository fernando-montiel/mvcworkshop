package com.g.l.mvc.repository;


import com.g.l.mvc.model.Subcontractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcontractorRepository extends JpaRepository<Subcontractor, Integer> {
}
