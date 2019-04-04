package com.mcc.formateadorDatos;

public class FormatoCsv extends Formato {

  public FormatoCsv(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".csv";
  }

  @Override
  public void crear() {

  }
}
