package com.mcc.formateadorDatos.formatosArchivo;

import com.mcc.formateadorDatos.framework.Formato;
import com.mcc.formateadorDatos.modelos.Alumno;
import com.mcc.formateadorDatos.modelos.AlumnosListXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

public class FormatoXml extends Formato {

  public FormatoXml(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo + ".xml";
  }

  @Override
  public void generar() {

    AlumnosListXml alumnosListXmls = new AlumnosListXml();
    alumnosListXmls.setAlumnos(Alumno.getAlumnos());

    try {
      JAXBContext context = JAXBContext.newInstance(AlumnosListXml.class);
      Marshaller m = context.createMarshaller();

      m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      StringWriter writer = new StringWriter();

      m.marshal(alumnosListXmls, writer);
      this.guardarArchivo(writer.toString());
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error al guardar el archivo," + e.toString());
    } catch (JAXBException e) {
      System.out.println("Ha ocurrido un error al generar el XML," + e.toString());
    }
  }
}
