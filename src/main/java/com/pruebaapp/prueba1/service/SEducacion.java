package com.pruebaapp.prueba1.service;

import com.pruebaapp.prueba1.entity.Educacion;
import com.pruebaapp.prueba1.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    
    @Autowired
    public REducacion eduRep;
    
    public List<Educacion> getEstudios() {
        List<Educacion> listaEstudios = eduRep.findAll();
        return listaEstudios;
    }
    
    public Educacion findEducacion(int id){
        Educacion edu = eduRep.findById(id).orElse(null);
        return edu;
    }
    
    public void saveEducacion(Educacion edu) {
        eduRep.save(edu);
    }
    
    public void deleteEducacion(int id){
        eduRep.deleteById(id);
    }
    
    public void editEducacion(Educacion edu) {
        eduRep.save(edu);
    }
    
}
