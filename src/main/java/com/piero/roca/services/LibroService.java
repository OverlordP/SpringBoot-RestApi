package com.piero.roca.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.piero.roca.models.LibrosModel;
import com.piero.roca.repositories.LibrosRepositoryDAO;
import org.springframework.stereotype.Service;

@Service
public class LibroService{

    @Autowired
    LibrosRepositoryDAO librosRepository;

    public ArrayList<LibrosModel> listarLibro(){   
        return (ArrayList<LibrosModel>) librosRepository.findAll();
    }

    public Optional<LibrosModel> obtenerLibrobyId(Long Id){
        return librosRepository.findById(Id);
    }

    public boolean eliminarLibro(Long id){
        
        try {
            librosRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public LibrosModel guardarLibro(LibrosModel model){
        return librosRepository.save(model);
        
    }
}
