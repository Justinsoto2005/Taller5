package com.example;

import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    protected PersonalAcademico personalAcademico;
    protected SoporteTecnico soporte;

    public Incidente(int id, LocalDateTime fecha_reportado, String estado, String titulo, String descripcion, List<String> log_actualizaciones, LocalDateTime fecha_cerrado, String tipo, PersonalAcademico personalAcademico, SoporteTecnico soporte) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.personalAcademico = personalAcademico;
        this.soporte = soporte;
    }

}
