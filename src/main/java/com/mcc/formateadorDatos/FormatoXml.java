package com.mcc.formateadorDatos;

public class FormatoXml extends Formato {

  public FormatoXml(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".xml";
  }

  @Override
  public void crear() {}
}
