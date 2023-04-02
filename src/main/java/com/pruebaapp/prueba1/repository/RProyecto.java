package com.pruebaapp.prueba1.repository;

import com.pruebaapp.prueba1.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer> {
    
}
