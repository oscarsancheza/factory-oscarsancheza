package com.mcc.formateadorDatos.formatosArchivo;

import com.mcc.formateadorDatos.framework.Formato;

public class FormatoCsv extends Formato {

  public FormatoCsv(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".csv";
  }

  @Override
  public void generar() {

  }
}
