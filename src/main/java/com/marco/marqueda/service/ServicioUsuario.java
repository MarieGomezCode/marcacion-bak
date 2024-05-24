package com.marco.marqueda.service;

import com.marco.marqueda.model.Usuario;
import com.marco.marqueda.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//es la clase de servicio que maneja las
// operaciones relacionadas con el usuario.

@Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }
    public Usuario login(String correo, String contrasena) {
        return repositorioUsuario.findByCorreoAndContrasena(correo, contrasena);
    }

}