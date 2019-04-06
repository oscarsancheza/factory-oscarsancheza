package com.mcc.formateadorDatos.framework;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public abstract class Formato {

  private final String path = "./src/main/java/com/mcc/formateadorDatos/archivos/";
  protected String nombreArchivo;

  protected void guardarArchivo(String datos) throws IOException {
    try (final BufferedWriter writer =
        Files.newBufferedWriter(
            Paths.get(path + nombreArchivo),
            StandardCharsets.UTF_8,
            new StandardOpenOption[] {StandardOpenOption.CREATE})) {
      writer.write(datos);
      writer.flush();
    }
  }

  public abstract void generar();

  public String getNombreArchivo() {
    return nombreArchivo;
  }
}
