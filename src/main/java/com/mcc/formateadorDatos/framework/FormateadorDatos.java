package com.mcc.formateadorDatos.framework;

import com.mcc.formateadorDatos.formatosArchivo.TipoFormato;

import java.io.IOException;

public abstract class FormateadorDatos {

  protected abstract Formato crearFormato(TipoFormato tipoFormato, String nombreArchivo);

  public Formato formatearDatos(TipoFormato tipoFormato, String nombreArchivo) {
    Formato formato;

    formato = crearFormato(tipoFormato, nombreArchivo);
    try {
      formato.generar();
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error al guardar el archivo," + e.toString());
    }

    return formato;
  }
}
