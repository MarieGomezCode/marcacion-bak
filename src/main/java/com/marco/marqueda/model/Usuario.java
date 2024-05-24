package com.marco.marqueda.model;

import jakarta.persistence.*;


//Esta entidad almacena la información básica sobre un usuario

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
// Importa LocalDate en lugar de LocalDateTime

@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String correo;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private LocalDate fechaNacimiento; // Cambia el tipo de dato a LocalDate

    @Column(nullable = false, updatable = false)
    private LocalDateTime creadoEn;

    @PrePersist
    protected void alCrear() {
        creadoEn = LocalDateTime.now();
    }
    @Column(nullable = false)
    private String contrasena;

    // Getters y Setters


    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() { // Cambia el tipo de retorno a LocalDate
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) { // Cambia el tipo de parámetro a LocalDate
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }
}
