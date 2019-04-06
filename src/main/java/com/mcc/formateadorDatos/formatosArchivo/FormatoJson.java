package com.mcc.formateadorDatos.formatosArchivo;

import com.google.gson.Gson;
import com.mcc.formateadorDatos.framework.Formato;
import com.mcc.formateadorDatos.modelos.Alumno;

import java.io.IOException;
import java.util.List;

public class FormatoJson extends Formato {

  private Gson gson;

  public FormatoJson(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".json";
    gson = new Gson();
  }

  @Override
  public void generar() {
    List<Alumno> alumnos = Alumno.getAlumnos();
    String data = gson.toJson(alumnos);
    try {
      this.guardarArchivo(data);
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error al guardar el archivo," + e.toString());
    }
  }
}
