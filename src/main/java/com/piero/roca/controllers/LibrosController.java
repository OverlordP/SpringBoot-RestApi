package com.piero.roca.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;


import com.piero.roca.models.LibrosModel;
import com.piero.roca.services.LibroService;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LibrosController {
    @Autowired
    LibroService libroservice;

    @GetMapping(path = "/libros")
    public ArrayList<LibrosModel> listLibros(){
        return (ArrayList<LibrosModel>) libroservice.listarLibro();
    }
    
    @GetMapping(path = "/libros/{id}")
    public Optional<LibrosModel> obtenerUserbyId(@PathVariable("id") Long Id) {
        return libroservice.obtenerLibrobyId(Id);
    }

    @PostMapping(path = "/libros")
    public LibrosModel setLibros(@RequestBody LibrosModel modelo) {
        return libroservice.guardarLibro(modelo);
    }
    
    
    @DeleteMapping(path = "/libros/{id}")
    public String eliminarLibro(@PathVariable("id") Long id) {
        boolean ok = libroservice.eliminarLibro(id);
        if (ok) {
            return "ok bro , esta eliminado ya";
        }
        else{
            return "algo paso bro , revisemos ps";
        }
    }

}
