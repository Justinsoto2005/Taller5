package com.example;

import java.util.List;

public class Estudiante extends PersonalAcademico {
    protected List<Curso> cursos;
    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void solicitarInscripcion(Curso curso) {

    }
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {

    }
}
