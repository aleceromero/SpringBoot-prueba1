package com.pruebaapp.prueba1.controller;

import com.pruebaapp.prueba1.entity.Persona;
import com.pruebaapp.prueba1.service.SPersona;
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
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    
       
    @Autowired
    SPersona persoServ;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Persona> getPersonas(){
        return persoServ.getPersonas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Persona findPersona(@PathVariable int id){
        return persoServ.findPersona(id);
    }
    
    @PostMapping ("/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deletePersona(@PathVariable int id){
        persoServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("/editar")
    public String editPersona(@RequestBody Persona perso){
        persoServ.editPersona(perso);
        return "La persona fue editada correctamente";
    }
    
    @PutMapping ("/editar/{id}")
    public String editPersonaId(@PathVariable ("id") int id,@RequestBody Persona perso){
        persoServ.editPersona(perso);
        return "La persona fue editada correctamente";
    }
    
    
    
    
}
