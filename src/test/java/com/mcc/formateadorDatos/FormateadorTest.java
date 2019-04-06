package com.mcc.formateadorDatos;

import com.mcc.formateadorDatos.formatosArchivo.FormatoArchivo;
import com.mcc.formateadorDatos.formatosArchivo.TipoFormato;
import com.mcc.formateadorDatos.framework.FormateadorDatos;
import com.mcc.formateadorDatos.framework.Formato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class FormateadorTest {

  private final String path = "./src/main/java/com/mcc/formateadorDatos/archivos/";
  private final String nombreArchivo = "alumnos";
  private FormateadorDatos formateadorDatos;

  @Before
  public void setUp() {
    this.formateadorDatos = new FormatoArchivo();
  }

  @Test
  public void seGeneroArchivoXml() {
    Formato formatoXml = formateadorDatos.formatearDatos(TipoFormato.XML, nombreArchivo);
    Assert.assertTrue(new File(path + formatoXml.getNombreArchivo()).exists());
  }

  @Test
  public void seGeneroArchivoJson() {
    Formato formato = formateadorDatos.formatearDatos(TipoFormato.JSON, nombreArchivo);
    Assert.assertTrue(new File(path + formato.getNombreArchivo()).exists());
  }

  @Test
  public void seGeneroArchivoTxt() {
    Formato formato = formateadorDatos.formatearDatos(TipoFormato.TXT, nombreArchivo);
    Assert.assertTrue(new File(path + formato.getNombreArchivo()).exists());
  }

  @Test
  public void seGeneroArchivoCsv() {
    Formato formato = formateadorDatos.formatearDatos(TipoFormato.CSV, nombreArchivo);
    Assert.assertTrue(new File(path + formato.getNombreArchivo()).exists());
  }
}
