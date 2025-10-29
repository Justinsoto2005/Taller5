package com.example;

import java.util.List;

public class Profesor extends PersonalAcademico {
    protected List<Curso> cursos;
    public Profesor(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {

    }
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {

    }
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {

    }
    public void crearNuevoForo(Foro foro) {

    }
}
