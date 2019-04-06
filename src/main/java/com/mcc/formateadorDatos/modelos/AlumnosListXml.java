package com.mcc.formateadorDatos.modelos;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Alumnos")
public class AlumnosListXml {

  private List<Alumno> alumnos;

  @XmlElement(name = "Alumno")
  public List<Alumno> getAlumnos() {
    return alumnos;
  }

  public void setAlumnos(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }
}
