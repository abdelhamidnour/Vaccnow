package com.exercise.vaccnow.repositry;

import com.exercise.vaccnow.model.Vaccines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccinesRepo extends JpaRepository<Vaccines,Integer> {
   List<Vaccines> findByIdIn(List<Integer> ids);
}
