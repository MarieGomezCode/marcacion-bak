package com.marco.marqueda.controller;


import com.marco.marqueda.model.Usuario;
import com.marco.marqueda.service.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
//@CrossOrigin(origins = "http://localhost:4200")
public class ControladorUsuario {

    @Autowired
    private ServicioUsuario servicioUsuario;

    @PostMapping("/registro")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return servicioUsuario.guardarUsuario(usuario);
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioEncontrado = servicioUsuario.login(usuario.getCorreo(), usuario.getContrasena());
        if (usuarioEncontrado != null) {
            return ResponseEntity.ok().body(usuarioEncontrado);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }


}

