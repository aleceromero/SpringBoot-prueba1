package com.pruebaapp.prueba1.repository;

import com.pruebaapp.prueba1.entity.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExpLaboral extends JpaRepository <ExpLaboral, Integer> {
    
}
