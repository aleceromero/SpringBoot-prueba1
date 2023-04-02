package com.pruebaapp.prueba1.controller;

import com.pruebaapp.prueba1.entity.Educacion;
import com.pruebaapp.prueba1.service.SEducacion;
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
@RequestMapping("educacion") //localhost:8080/educacion
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    
    @Autowired
    SEducacion eduServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Educacion> getEstudios(){
        return eduServ.getEstudios();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Educacion findEducacion(@PathVariable int id){
        return eduServ.findEducacion(id);
    }
    
    @PostMapping ("/crear")
    public String saveEducacion(@RequestBody Educacion edu){
        eduServ.saveEducacion(edu);
        return "El estudio fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteEducacion(@PathVariable int id){
        eduServ.deleteEducacion(id);
        return "El estudio fue borrado correctamente";
    }
    
    @PutMapping ("/editar")
    public String editEducacion(@RequestBody Educacion edu){
        eduServ.editEducacion(edu);
        return "El estudio fue editado correctamente";
    }
    
    
}
