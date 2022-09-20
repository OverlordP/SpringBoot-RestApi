/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.piero.roca.controllers;

import com.piero.roca.models.UsuarioModel;
import com.piero.roca.services.UsuarioService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Piero
 */
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(path = "/user")
    public ArrayList<UsuarioModel> listUsers() {
        return (ArrayList<UsuarioModel>) usuarioService.obtenerUsers();
    }

    @GetMapping(path = "/user/{id}")
    public Optional<UsuarioModel> obtenerUserbyId(@PathVariable("id") Long Id) {
        return usuarioService.obtenerUserbyId(Id);
    }

    @PostMapping(path = "/user")
    public UsuarioModel setUsers(@RequestBody UsuarioModel modelo) {
        return usuarioService.guardarUser(modelo);
    }

    @DeleteMapping(path = "/user/{id}")
    public String eliminarUser(@PathVariable("id") Long id) {
        boolean ok = usuarioService.eliminarUser(id);
        if (ok) {
            return "ok bro , esta eliminado ya";
        }
        else{
            return "algo paso bro , revisemos ps";
        }
    }

}
