package com.mcc.formateadorDatos;

public class FormatoJson extends Formato {

  public FormatoJson(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".json";
  }

  @Override
  public void crear() {}
}
