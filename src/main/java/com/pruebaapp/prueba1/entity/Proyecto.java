package com.pruebaapp.prueba1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Proyecto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nombre;
@Lob
@Column(length=500)
private String descripcion;
private String imgProyecto;
private String urlProyecto;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String imgProyecto, String urlProyecto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imgProyecto = imgProyecto;
        this.urlProyecto = urlProyecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgProyecto() {
        return imgProyecto;
    }

    public void setImgProyecto(String imgProyecto) {
        this.imgProyecto = imgProyecto;
    }

    public String getUrlProyecto() {
        return urlProyecto;
    }

    public void setUrlProyecto(String urlProyecto) {
        this.urlProyecto = urlProyecto;
    }

    
}
