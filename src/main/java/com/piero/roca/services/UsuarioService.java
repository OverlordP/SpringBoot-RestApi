package com.piero.roca.services;

import com.piero.roca.models.UsuarioModel;
import com.piero.roca.repositories.UsuarioRepositoryDAO;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Piero
 */
@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepositoryDAO usuarioRepository;
    
    public ArrayList<UsuarioModel> obtenerUsers(){
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
    }
    
    public Optional<UsuarioModel> obtenerUserbyId(Long Id){
        return usuarioRepository.findById(Id);
    }
    
    public boolean eliminarUser(Long id){
        
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public UsuarioModel guardarUser(UsuarioModel modelo){
        
        return usuarioRepository.save(modelo);
    }
}
