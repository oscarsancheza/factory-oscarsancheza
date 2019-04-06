package com.mcc.formateadorDatos.formatosArchivo;

import com.mcc.formateadorDatos.framework.Formato;
import com.mcc.formateadorDatos.modelos.Alumno;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class FormatoCsv extends Formato {

  public FormatoCsv(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".csv";
  }

  @Override
  public void generar() {

    List<Alumno> alumnos = Alumno.getAlumnos();
    StringBuilder datos = new StringBuilder();

    if (!alumnos.isEmpty()) {

      Field[] fields = alumnos.get(0).getClass().getDeclaredFields();

      for (int i = 0; i < fields.length; i++) {
        datos.append(fields[i].getName());
        if (i != fields.length - 1) {
          datos.append(",");
        }
      }

      for (Alumno alumno : alumnos) {
        datos.append("\n");
        datos.append(alumno.getNoDeControl());
        datos.append(",");
        datos.append(alumno.getNombre());
        datos.append(",");
        datos.append(alumno.getApellidoPaterno());
        datos.append(",");
        datos.append(alumno.getApellidoMaterno());
        datos.append(",");
        datos.append(alumno.getEdad());
        datos.append(",");
        datos.append(alumno.getSexo());
        datos.append(",");
        datos.append(alumno.getCarrera());
        datos.append(",");
        datos.append(alumno.getSemestre());
      }
    }

    try {
      this.guardarArchivo(datos.toString());
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error al guardar el archivo," + e.toString());
    }
  }
}