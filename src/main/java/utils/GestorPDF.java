package utils;
//import basicos
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.util.Date;

import modelo.Prestamo;
public class GestorPDF {
    public void generarPrestamo(Prestamo prestamo) throws IOException {
        //creacion de documento
        PDDocument documento = new PDDocument();
        //creacion de pagina
        PDPage pagina = new PDPage(PDRectangle.A4);
        //agregar pagina al documento
        documento.addPage(pagina);
        //Se genera un arreglo de líneas que va a tener el archivo PDF
        String[] lineasPdf = this.obtenerLíneasPdf(prestamo);
        this.rellenarPDF(documento, pagina, lineasPdf);
        //Se guarda el documento en la ubicación descrita
        documento.save(this.generarNombrePdf(prestamo.getFechaInicio()));
        documento.close();
    }

    private void rellenarPDF(PDDocument documento, PDPage pagina, String[] lineasPrestamoPdf) {
        //Por cada linea del arreglo, se irá agregando texto
        try (PDPageContentStream contenidoPagina = new PDPageContentStream(documento, pagina)) {
            for(int linea=0; linea<lineasPrestamoPdf.length; linea++) {
                contenidoPagina.beginText();
                //Se define en que posición del documento estará el texto
                contenidoPagina.newLineAtOffset(10, pagina.getMediaBox().getHeight()-(10*linea));
                contenidoPagina.setFont(PDType1Font.HELVETICA_BOLD, 8f);
                //Agrega el texto al documento
                contenidoPagina.showText(lineasPrestamoPdf[linea]);
                contenidoPagina.endText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] obtenerLíneasPdf(Prestamo prestamo) {
        //Se crea un arreglo de String con el tamaño de las líneas que tendrá el documento
        String[] lineasPdf = new String[10];
        //Se agregan las líneas al arreglo
        lineasPdf[0] = "Biblioteca";
        lineasPdf[1] = "Fecha de inicio: " + prestamo.getFechaInicio();
        lineasPdf[2] = "Fecha de término: " + prestamo.getFechaTermino();
        lineasPdf[3] = "Libro: " + prestamo.getLibro().getNombreLibro();
        lineasPdf[4] = "Autor: " + prestamo.getLibro().getAutor();
        lineasPdf[5] = "Editorial: " + prestamo.getLibro().getEditorial();
        lineasPdf[6] = "ISBN: " + prestamo.getLibro().getISBN();
        lineasPdf[7] = "Usuario: " + prestamo.getUsuario().getNombre();
        lineasPdf[8] = "Rut: " + prestamo.getUsuario().getRut();
        lineasPdf[9] = "Número telefónico: " + prestamo.getUsuario().getNumeroTelefonico();
        return lineasPdf;
    }

    private String generarNombrePdf(Date fecha){
        System.out.println(fecha.toString());
        String fechaArchivo= fecha.toString();
        fechaArchivo=fechaArchivo.replace(" ","").replace(":","");
        String nombrePdf="target/"+"prestamo"+fechaArchivo+".pdf";
        return nombrePdf;
    }
}