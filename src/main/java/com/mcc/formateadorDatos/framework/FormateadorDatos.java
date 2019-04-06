package com.mcc.formateadorDatos.framework;

import com.mcc.formateadorDatos.formatosArchivo.TipoFormato;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public abstract class FormateadorDatos {

  protected abstract Formato crearFormato(TipoFormato tipoFormato, String nombreArchivo);

  public Formato formatearDatos(TipoFormato tipoFormato, String nombreArchivo) {
    Formato formato;

    formato = crearFormato(tipoFormato, nombreArchivo);
    formato.generar();

    return formato;
  }
}
