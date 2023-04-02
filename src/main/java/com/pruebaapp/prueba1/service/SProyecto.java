package com.pruebaapp.prueba1.service;

import com.pruebaapp.prueba1.entity.Proyecto;
import com.pruebaapp.prueba1.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    
    @Autowired
    public RProyecto proyectRep;
    
    public List<Proyecto> getProyectos() {
        List<Proyecto> listaProyectos = proyectRep.findAll();
        return listaProyectos;
    }
    
    public Proyecto findProyecto(int id){
        Proyecto proyect = proyectRep.findById(id).orElse(null);
        return proyect;
    }
    
    public void saveProyecto(Proyecto proyect) {
        proyectRep.save(proyect);
    }
    
    public void deleteProyecto(int id){
        proyectRep.deleteById(id);
    }
    
    public void editProyecto(Proyecto proyect) {
        proyectRep.save(proyect);
    }
        
    
}
