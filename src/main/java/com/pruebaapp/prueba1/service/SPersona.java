package com.pruebaapp.prueba1.service;

import com.pruebaapp.prueba1.entity.Persona;
import com.pruebaapp.prueba1.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona persoRep;
    
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRep.findAll();
        return listaPersonas;
    }
    
    public Persona findPersona(int id){
        Persona perso = persoRep.findById(id).orElse(null);
        return perso;
    }
    
    public void savePersona(Persona perso) {
        persoRep.save(perso);
    }
    
    public void deletePersona(int id){
        persoRep.deleteById(id);
    }
    
    public void editPersona(Persona perso) {
        persoRep.save(perso);
    }
    
    
}
