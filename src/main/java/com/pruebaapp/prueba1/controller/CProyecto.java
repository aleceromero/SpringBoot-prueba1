package com.pruebaapp.prueba1.controller;

import com.pruebaapp.prueba1.entity.Proyecto;
import com.pruebaapp.prueba1.service.SProyecto;
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
@RequestMapping("proyecto") //localhost:8080/proyecto
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    
    @Autowired
    SProyecto proyectServ;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Proyecto> getProyectos(){
        return proyectServ.getProyectos();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Proyecto findProyecto(@PathVariable int id){
        return proyectServ.findProyecto(id);
    }
    
    @PostMapping ("/crear")
    public String saveProyecto(@RequestBody Proyecto proyect){
        proyectServ.saveProyecto(proyect);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteProyecto(@PathVariable int id){
        proyectServ.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping ("/editar")
    public String editProyecto(@RequestBody Proyecto proyect){
        proyectServ.editProyecto(proyect);
        return "El proyecto fue editado correctamente";
    }
    
    
}
