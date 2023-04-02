package com.pruebaapp.prueba1.controller;

import com.pruebaapp.prueba1.entity.Habilidad;
import com.pruebaapp.prueba1.service.SHabilidad;
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
@RequestMapping("habilidad") //localhost:8080/habilidad
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    
    @Autowired
    SHabilidad habServ;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Habilidad> getHabilidades(){
        return habServ.getHabilidades();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Habilidad findHabilidad(@PathVariable int id){
        return habServ.findHabilidad(id);
    }
    
    @PostMapping ("/crear")
    public String saveHabilidad(@RequestBody Habilidad hab){
        habServ.saveHabilidad(hab);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteHabilidad(@PathVariable int id){
        habServ.deleteHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }
    
    @PutMapping ("/editar")
    public String editHabilidad(@RequestBody Habilidad hab){
        habServ.editHabilidad(hab);
        return "La habilidad fue editada correctamente";
    }
    
    
}
