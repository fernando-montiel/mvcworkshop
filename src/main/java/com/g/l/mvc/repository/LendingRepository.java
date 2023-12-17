package com.g.l.mvc.repository;


import com.g.l.mvc.model.Lending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendingRepository extends JpaRepository<Lending, Integer> {
}
