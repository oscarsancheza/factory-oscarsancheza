package com.mcc.formateadorDatos.formatosArchivo;

import com.mcc.formateadorDatos.framework.Formato;

public class FormatoTxt extends Formato {

  public FormatoTxt(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".txt";
  }

  @Override
  public void generar() {}
}
