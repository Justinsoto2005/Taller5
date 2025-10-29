package com.example;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    public Usuario(String usuario, String contrasena, String nombre, String apellido) {
        this.apellido = apellido;
        this.usuario = usuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    protected boolean logIn() {
        return true;
    }

    protected boolean logOut() {
        return false;
    }
}