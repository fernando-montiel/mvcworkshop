package com.g.l.mvc.repository;

import com.g.l.mvc.model.Blueprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlueprintRepository extends JpaRepository<Blueprint, Integer> {


}