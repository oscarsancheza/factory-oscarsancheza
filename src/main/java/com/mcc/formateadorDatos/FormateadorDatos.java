package com.mcc.formateadorDatos;

public abstract class FormateadorDatos {

  public abstract Formato crearFormato(TipoFormato tipoFormato, String nombreArchivo);

  public Formato formatearDatos(TipoFormato tipoFormato, String nombreArchivo) {
    Formato formato;

    formato = crearFormato(tipoFormato, nombreArchivo);
    formato.crear();

    return formato;
  }
}
