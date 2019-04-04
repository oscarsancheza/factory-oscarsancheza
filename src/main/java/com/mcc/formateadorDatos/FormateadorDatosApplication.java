package com.mcc.formateadorDatos;

public class FormateadorDatosApplication {

  public static void main(String[] args) {
    FormateadorDatos formateadorDatos = new FormatoArchivo();
    Formato formato = formateadorDatos.formatearDatos(TipoFormato.JSON, "Alumnos");
    System.out.println("Nombre con formato:" + formato.getNombreArchivo());
  }
}
