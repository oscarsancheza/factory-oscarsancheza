package com.mcc.formateadorDatos;

import com.mcc.formateadorDatos.formatosArchivo.FormatoArchivo;
import com.mcc.formateadorDatos.formatosArchivo.TipoFormato;
import com.mcc.formateadorDatos.framework.FormateadorDatos;
import com.mcc.formateadorDatos.framework.Formato;

public class FormateadorDatosApplication {

  public static void main(String[] args) {

    FormateadorDatos formateadorDatos = new FormatoArchivo();
    Formato formatoXml = formateadorDatos.formatearDatos(TipoFormato.XML, "alumnos");
    Formato formatoCsv = formateadorDatos.formatearDatos(TipoFormato.CSV, "alumnos");
    Formato formatoJson = formateadorDatos.formatearDatos(TipoFormato.JSON, "alumnos");
    Formato formatoTxt = formateadorDatos.formatearDatos(TipoFormato.TXT, "alumnos");

    System.out.println("Nombre archivo con formato:" + formatoXml.getNombreArchivo());
    System.out.println("Nombre archivo con formato:" + formatoCsv.getNombreArchivo());
    System.out.println("Nombre archivo con formato:" + formatoTxt.getNombreArchivo());
    System.out.println("Nombre archivo con formato:" + formatoJson.getNombreArchivo());
  }
}
