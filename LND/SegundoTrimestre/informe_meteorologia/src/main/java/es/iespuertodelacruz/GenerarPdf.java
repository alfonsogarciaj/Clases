package es.iespuertodelacruz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *  Clase para generar los pdf
 */
public class GenerarPdf {

    PDDocument document;
    PDPage page;
    PDPageContentStream contentStream;
    PDImageXObject image;
    float altura = 17;

    /**
     * Constructor de la clase sin parametros
     */
    public GenerarPdf() {

        this.document = new PDDocument();
        this.page = new PDPage(PDRectangle.A6);
        this.contentStream = null;
        this.image = null;

    }

    /**
     * Metodo para agregar una pagina al pdf
     * @return retorna true si se ha podido agregar la pagina correctamente
     * @throws IOException Excepcion que se manda al main
     */
    public boolean agregarPagina() throws Exception {


            try {
                document.addPage(page);
                this.contentStream = new PDPageContentStream(document, page);
                return true;
            }catch (Exception e){

                throw new Exception("No se ha podido agregar la pagina al documento" , e);
            }

    }

    /**
     * Metodo para agregar un titulo al documento pdf
     * @param texto titulo que se va a agregar
     * @return retorna true si se ha podido agregar el titulo
     * @throws IOException Excepcion que se manda al main
     */
    public boolean agregarTitulo(String texto) throws Exception {

        try {

            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 13);
            contentStream.newLineAtOffset(80, page.getMediaBox().getHeight() - this.altura);
            contentStream.showText(texto);
            contentStream.endText();
            this.altura += 14;
            return true;

        }catch (Exception e){

            throw new Exception("No se ha podido agregar el titulo al documento", e);

        }
    }

    /**
     * Metodo para agregar texto al documento pdf
     * @param texto texto que se va a añadir al documento
     * @return retorna true si se ha podido agregar el texto
     * @throws IOException Excepcion que se manda al main
     */
    public boolean agregarTexto(String texto) throws Exception {



        try {
            if (texto.length() > 150) {

                String textoCortado1 = texto.substring(0, 65);
                String textoCortado2 = texto.substring(65, texto.length());
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA, 6);
                contentStream.newLineAtOffset(5, page.getMediaBox().getHeight() - this.altura);
                contentStream.showText(textoCortado1);
                contentStream.endText();
                this.altura += 12;

                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA, 6);
                contentStream.newLineAtOffset(5, page.getMediaBox().getHeight() - this.altura);
                contentStream.showText(textoCortado2);
                contentStream.endText();
                this.altura += 12;

                return true;

            } else {

                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA, 6);
                contentStream.newLineAtOffset(5, page.getMediaBox().getHeight() - this.altura);
                contentStream.showText(texto);
                contentStream.endText();
                this.altura += 12;

                return true;

            }
        }catch (Exception e){

            throw new Exception("Error al añadir texto al archivo", e);
        }



    }

    /**
     * Metodo para incluir una imagen en el pdf
     * @param direccionImagen ruta a la imagen
     * @param nombreImagen nombre que se le quiere dar a la imagen
     * @throws IOException Excepcion que controlara el main
     * @return retorna true si todo ha salido bien
     */
    public boolean agregarImagen(String direccionImagen, String nombreImagen) throws Exception {



        try {
            this.image = PDImageXObject.createFromByteArray(document, App.class.getResourceAsStream(direccionImagen).readAllBytes(), nombreImagen);
            contentStream.drawImage(image, page.getMediaBox().getWidth() / 2 - (image.getWidth() / 3) / 2, page.getMediaBox().getHeight() - 4 - image.getHeight() / 3,
                image.getWidth() / 3, image.getHeight() / 3);
            this.altura += image.getHeight() / 3;

            return true;

        }catch (Exception e){

            throw new Exception("No se ha encontrado la imagen en la ruta especificada", e);

        }


    }

    /**
     * Metodo para guardar el pdf en la ruta pasada como parametro
     * @param direccion ruta donde se quiere guardar el pdf
     * @return devuelve la ruta donde se ha guardado el archivo
     * @throws IOException Excepcion que controlara el main
     */
    public String guardarPdf(String direccion) throws Exception {

        try {
            document.save(direccion);
            return "Archivo guardado en: " + direccion;
        }catch (Exception e){

            throw new Exception("No se ha podido guardar el pdf en la ruta seleccionada", e);

        }
    }

    /**
     * Metodo para cerrar la modificacion del documento
     * @throws IOException Excepcion que salta si hay un error al cerrar el contentStream
     * @return devuelve true si se ha cerrado correctamente el contentStream
     */
    public boolean closeContentStream() throws Exception {


        try {

            this.contentStream.close();

            return true;

        }catch (Exception e){

            throw new Exception("No se ha podido cerrar el contentStream correctamente", e);

        }


    }

    /**
     * Metodo para leer el archivo y calcular las medias de los distintos datos meteorologicos
     * @param rutaArchivo ruta del archivo que se va a leer
     * @param rutaImagen ruta de la imagen que se va a insertar en el pdf
     * @param nombreImagen nombre que la imagen tendra al insertarse en el pdf
     * @param rutaGuardar ruta donde se quiere guardar el pdf resultante
     * @return retorna true si se ha leido el fichero correctamente
     * @throws Exception excepcion que surge si existe algun error al leer o guardar algun archivo
     */
    public boolean leerFichero(String rutaArchivo, String rutaImagen, String nombreImagen,
                            String rutaGuardar) throws Exception {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        double datos[] = null;
        int cantidadDatos = 0;
        String titulosTabla = "";

        agregarImagen(rutaImagen, nombreImagen);


        try {

            archivo = new File(rutaArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            titulosTabla = br.readLine();
            String[] campos = titulosTabla.split("\\s+");
            datos = new double[campos.length];

            agregarTexto(titulosTabla);

            String linea;
            while ((linea = br.readLine()) != null) {

                agregarTexto(linea);
                String[] split = linea.split("\\s+");
                for (int i = 1; i < split.length; i++) {
                    datos[i] += Double.parseDouble(split[i]);

                }
                cantidadDatos += 1;

            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }


        }
        try {


            String medias = "Medias:" + "                     ";
            for (int i = 1; i < datos.length; i++) {
                datos[i] /= cantidadDatos;
                medias += Math.round(datos[i]*100.0)/100.0 + "                ";

            }

            agregarTexto(medias);
            closeContentStream();
            guardarPdf(rutaGuardar);

            return true;

        }catch (Exception e){

            throw new Exception("Error al añadir texto al pdf", e);


        }


    }


}
