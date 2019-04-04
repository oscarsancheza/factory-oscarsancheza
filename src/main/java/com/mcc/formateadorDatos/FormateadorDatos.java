package com.mcc.formateadorDatos;

public abstract class FormateadorDatos {

  abstract Formato crearFormato(TipoFormato tipoFormato, String nombreArchivo);

  public Formato formatearDatos(TipoFormato tipoFormato, String nombreArchivo) {
    Formato formato = null;

    return formato;
  }
}
