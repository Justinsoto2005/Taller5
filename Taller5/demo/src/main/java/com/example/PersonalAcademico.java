package com.example;

import java.util.ArrayList;
import java.util.List;

public class PersonalAcademico extends Usuario {
    protected  List<Incidente> incidentesUsuario;

    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        incidentesUsuario = new ArrayList<>();
    }

    public void reportarError(String email, String contenido) {

    }
    public void solicitarAsesoramientoDelSistema(String email, String contenido) {

    }
    public void comentarEnForo(Foro foro, String comentario) {
        
    }
}
