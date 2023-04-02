package com.pruebaapp.prueba1.service;

import com.pruebaapp.prueba1.entity.Habilidad;
import com.pruebaapp.prueba1.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    
    @Autowired
    public RHabilidad habRep;
    
    public List<Habilidad> getHabilidades() {
        List<Habilidad> listaHabilidades = habRep.findAll();
        return listaHabilidades;
    }
    
    public Habilidad findHabilidad(int id){
        Habilidad hab = habRep.findById(id).orElse(null);
        return hab;
    }
    
    public void saveHabilidad(Habilidad hab) {
        habRep.save(hab);
    }
    
    public void deleteHabilidad(int id){
        habRep.deleteById(id);
    }
    
    public void editHabilidad(Habilidad hab) {
        habRep.save(hab);
    }
    
    
}
