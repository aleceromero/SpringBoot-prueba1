package com.pruebaapp.prueba1.repository;

import com.pruebaapp.prueba1.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository <Educacion, Integer> {
    
}
