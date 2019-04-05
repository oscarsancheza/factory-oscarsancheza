package com.mcc.formateadorDatos.formatosArchivo;

import com.mcc.formateadorDatos.framework.Formato;

public class FormatoXml extends Formato {

  public FormatoXml(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".xml";
  }

  @Override
  public void generar() {}
}
