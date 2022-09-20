/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.piero.roca.repositories;

import com.piero.roca.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Piero
 */
@Repository
public interface UsuarioRepositoryDAO extends CrudRepository<UsuarioModel,Long> {
    
}
