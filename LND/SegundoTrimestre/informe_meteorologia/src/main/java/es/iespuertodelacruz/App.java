package es.iespuertodelacruz;

import org.apache.pdfbox.pdmodel.font.PDType1Font;

import org.apache.pdfbox.pdmodel.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Stream;


public final class App {
    public static void main(String[] args) throws Exception {

        /*
        GenerarPdf pdf = new GenerarPdf();
        pdf.agregarPagina();
        pdf.leerFichero("src/main/resources/notas.txt", "/calificaciones.jpeg",
            "cals.jpeg", "/home/yared/Documentos/prueba.pdf");
        */

        GenerarPdf pdf = new GenerarPdf();
        pdf.agregarPagina();
        pdf.leerFichero("src/main/resources/temperaturas-abril.txt", "/aemet.png",
            "aemet", "/home/daw/Documentos/prueba.pdf");

    }
}

