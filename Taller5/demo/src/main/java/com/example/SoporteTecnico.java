package com.example;

import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico extends Usuario {
    protected  List<Incidente> incidentesManejados;
    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        incidentesManejados = new ArrayList<>();
    }

    public void brindarAsistencia(Usuario usuario) {

    }
    public void resolverProblemaTecnico(Usuario usuario) {

    }
    public void derivarProblemaDeGestion(Administrador administrador) {
        
    }
}
