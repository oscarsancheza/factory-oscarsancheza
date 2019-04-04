package com.mcc.formateadorDatos;

public class FormatoArchivo extends FormateadorDatos {
  @Override
  public Formato crearFormato(TipoFormato tipoFormato, String nombreArchivo) {
    Formato formato = null;

    switch (tipoFormato) {
      case CSV:
        formato = new FormatoCsv(nombreArchivo);
        break;
      case TXT:
        formato = new FormatoTxt(nombreArchivo);
        break;
      case XML:
        formato = new FormatoXml(nombreArchivo);
        break;
      case JSON:
        formato = new FormatoJson(nombreArchivo);
        break;
    }
    return formato;
  }
}
