package com.mcc.formateadorDatos.formatosArchivo;

import com.mcc.formateadorDatos.framework.Formato;
import com.mcc.formateadorDatos.modelos.Alumno;

import java.io.IOException;
import java.util.List;

public class FormatoTxt extends Formato {

  public FormatoTxt(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".txt";
  }

  @Override
  public void generar() throws IOException {
    List<Alumno> alumnos = Alumno.getAlumnos();
    StringBuilder datos = new StringBuilder();

    if (!alumnos.isEmpty()) {
      for (Alumno alumno : alumnos) {
        datos.append(alumno.getNoDeControl());
        datos.append("\t");
        datos.append(alumno.getNombre());
        datos.append("\t");
        datos.append(alumno.getApellidoPaterno());
        datos.append("\t");
        datos.append(alumno.getApellidoMaterno());
        datos.append("\t");
        datos.append(alumno.getEdad());
        datos.append("\t");
        datos.append(alumno.getSexo());
        datos.append("\t");
        datos.append(alumno.getCarrera());
        datos.append("\t");
        datos.append(alumno.getSemestre());
        datos.append("\n");
      }
    }

    this.guardarArchivo(datos.toString());
  }
}
