package com.mcc.formateadorDatos.formatosArchivo;

import com.google.gson.Gson;
import com.mcc.formateadorDatos.modelos.Alumno;
import com.mcc.formateadorDatos.framework.Formato;

import java.io.IOException;
import java.util.List;

public class FormatoJson extends Formato {

  private Gson gson;

  public FormatoJson(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".json";
    gson = new Gson();
  }

  @Override
  public void generar() throws IOException {
    List<Alumno> alumnos = Alumno.getAlumnos();
    String data = gson.toJson(alumnos);
    this.guardarArchivo(data);
  }
}
