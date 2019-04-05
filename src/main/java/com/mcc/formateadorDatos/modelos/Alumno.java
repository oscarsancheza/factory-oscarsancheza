package com.mcc.formateadorDatos.modelos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

  private String noDeControl;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private int edad;
  private String sexo;
  private String carrera;
  private int semestre;

  public static List<Alumno> getAlumnos() {
    List<Alumno> alumnos = new ArrayList<>();

    Alumno alumnoOscar = new Alumno();
    alumnoOscar.setNoDeControl("M18170813");
    alumnoOscar.setNombre("OSCAR OMAR");
    alumnoOscar.setApellidoPaterno("SANCHEZ");
    alumnoOscar.setApellidoMaterno("ALVARADO");
    alumnoOscar.setEdad(25);
    alumnoOscar.setSexo("M");
    alumnoOscar.setCarrera("MCC");
    alumnoOscar.setSemestre(2);

    Alumno alumnoMario = new Alumno();
    alumnoMario.setNoDeControl("M13170367");
    alumnoMario.setNombre("MARIO");
    alumnoMario.setApellidoPaterno("VALENZUELA");
    alumnoMario.setApellidoMaterno("PARTIDA");
    alumnoMario.setEdad(23);
    alumnoMario.setSexo("M");
    alumnoMario.setCarrera("MCC");
    alumnoMario.setSemestre(2);

    Alumno alumnoEfrain = new Alumno();
    alumnoEfrain.setNoDeControl("M08170327");
    alumnoEfrain.setNombre("EFRAIN");
    alumnoEfrain.setApellidoPaterno("CUADRAS");
    alumnoEfrain.setApellidoMaterno("GONZALEZ");
    alumnoEfrain.setEdad(28);
    alumnoEfrain.setSexo("M");
    alumnoEfrain.setCarrera("MCC");
    alumnoEfrain.setSemestre(2);

    Alumno alumnoJose = new Alumno();
    alumnoJose.setNoDeControl("M018170808");
    alumnoJose.setNombre("JOSE ALFREDO");
    alumnoJose.setApellidoPaterno("VALENZUELA");
    alumnoJose.setApellidoMaterno("BELTRAN");
    alumnoJose.setEdad(24);
    alumnoJose.setSexo("M");
    alumnoJose.setCarrera("MCC");
    alumnoJose.setSemestre(2);

    Alumno alumnoUlises = new Alumno();
    alumnoUlises.setNoDeControl("M09170930");
    alumnoUlises.setNombre("ULISES URIEL");
    alumnoUlises.setApellidoPaterno("CABRERA");
    alumnoUlises.setApellidoMaterno("RUBIO");
    alumnoUlises.setEdad(27);
    alumnoUlises.setSexo("M");
    alumnoUlises.setCarrera("MCC");
    alumnoUlises.setSemestre(2);

    Alumno alumnoNancy = new Alumno();
    alumnoNancy.setNoDeControl("M010170914");
    alumnoNancy.setNombre("NANCY AHIDE");
    alumnoNancy.setApellidoPaterno("CRUZ");
    alumnoNancy.setApellidoMaterno("GASTELUM");
    alumnoNancy.setEdad(27);
    alumnoNancy.setSexo("F");
    alumnoNancy.setCarrera("MCC");
    alumnoNancy.setSemestre(2);

    alumnos.add(alumnoOscar);
    alumnos.add(alumnoEfrain);
    alumnos.add(alumnoJose);
    alumnos.add(alumnoMario);
    alumnos.add(alumnoUlises);
    alumnos.add(alumnoNancy);

    return alumnos;
  }

  public String getNoDeControl() {
    return noDeControl;
  }

  public void setNoDeControl(String noDeControl) {
    this.noDeControl = noDeControl;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getCarrera() {
    return carrera;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public int getSemestre() {
    return semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }
}
