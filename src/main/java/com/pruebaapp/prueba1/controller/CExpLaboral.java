package com.pruebaapp.prueba1.controller;

import com.pruebaapp.prueba1.entity.ExpLaboral;
import com.pruebaapp.prueba1.service.SExpLaboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class CExpLaboral {
    
    @Autowired
    SExpLaboral expeServ;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <ExpLaboral> getExperiencias(){
        return expeServ.getExperiencias();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public ExpLaboral findExperiencia(@PathVariable int id){
        return expeServ.findExperiencia(id);
    }
    
    @PostMapping ("/crear")
    public String saveExperiencia(@RequestBody ExpLaboral expe){
        expeServ.saveExperiencia(expe);
        return "La experiencia laboral fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteExperiencia(@PathVariable int id){
        expeServ.deleteExperiencia(id);
        return "La experiencia laboral fue eliminada correctamente";
    }
    
    @PutMapping ("/editar")
    public String editExperiencia(@RequestBody ExpLaboral expe){
        expeServ.editExperiencia(expe);
        return "La experiencia laboral fue editada correctamente";
    }
    
    
}
