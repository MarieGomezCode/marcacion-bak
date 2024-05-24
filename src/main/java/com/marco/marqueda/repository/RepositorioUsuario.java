package com.marco.marqueda.repository;

import com.marco.marqueda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//RepositorioUsuario es la interfaz que extiende JpaRepository,
// que proporciona métodos CRUD para la entidad Usuario.
//es el repositorio que proporciona métodos para acceder y
// manipular los datos de los usuarios en la base de datos.

// Repositorio para la entidad Usuario
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

    //Al quitar el método guardar, el repositorio utilizará automáticamente el método save
    // heredado de JpaRepository para guardar entidades Usuario en la base de datos.
    // Método para buscar un usuario por su correo electrónico
    Usuario findByCorreoAndContrasena(String correo, String contrasena);
}