package com.mcc.formateadorDatos;

public class FormatoTxt extends Formato {

  public FormatoTxt(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".txt";
  }

  @Override
  public void crear() {}
}
