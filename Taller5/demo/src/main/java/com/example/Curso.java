package com.example;

import java.util.ArrayList;

public class Curso {
  private String id;
  private String nombre;
  private boolean estadoDisponible;
  private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;
  private ArrayList<Estudiante> estudiantesInscritos;
  private Profesor responsable;
  private ArrayList<Foro> foros;
  private ArrayList<ActividadSumativa> actividadesSumativas;

  public Curso() {
  }

  public void crear(String i, String n, boolean e, ArrayList<Estudiante> eeeI, ArrayList<Estudiante> eI, Profesor r) {
    id = i;
    nombre = n;
    estadoDisponible = e;
    estudiantesEnEsperaDeInscripcion = eeeI;
    estudiantesInscritos = eI;
    responsable = r;
  }
}
