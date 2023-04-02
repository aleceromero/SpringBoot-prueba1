package com.pruebaapp.prueba1.service;

import com.pruebaapp.prueba1.entity.ExpLaboral;
import com.pruebaapp.prueba1.repository.RExpLaboral;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExpLaboral {
    
    @Autowired
    public RExpLaboral expeRep;
    
    public List<ExpLaboral> getExperiencias() {
        List<ExpLaboral> listaExperiencias = expeRep.findAll();
        return listaExperiencias;
    }
    
    public ExpLaboral findExperiencia(int id){
        ExpLaboral expe = expeRep.findById(id).orElse(null);
        return expe;
    }

    public void saveExperiencia(ExpLaboral expe) {
        expeRep.save(expe);
    }    
    
    public void deleteExperiencia(int id){
        expeRep.deleteById(id);
    }
    
    public void editExperiencia(ExpLaboral expe) {
        expeRep.save(expe);
    } 
}
