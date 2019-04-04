package com.mcc.formateadorDatos;

public abstract class Formato {

  protected String nombreArchivo;

  public abstract void crear();

  public String getNombreArchivo() {
    return nombreArchivo;
  }
}
