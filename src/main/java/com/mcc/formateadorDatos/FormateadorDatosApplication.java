package com.mcc.formateadorDatos;

import com.mcc.formateadorDatos.formatosArchivo.FormatoArchivo;
import com.mcc.formateadorDatos.formatosArchivo.TipoFormato;
import com.mcc.formateadorDatos.framework.FormateadorDatos;
import com.mcc.formateadorDatos.framework.Formato;

public class FormateadorDatosApplication {

  public static void main(String[] args) {
    FormateadorDatos formateadorDatos = new FormatoArchivo();
    Formato formato = formateadorDatos.formatearDatos(TipoFormato.TXT, "alumnos");
    System.out.println("Nombre archivo con formato:" + formato.getNombreArchivo());
  }
}
