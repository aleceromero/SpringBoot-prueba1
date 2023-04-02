package com.pruebaapp.prueba1.repository;

import com.pruebaapp.prueba1.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer> {
    
}
