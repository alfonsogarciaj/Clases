package es.iespuertodelacruz;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author alfonsogj
 */
public class PDF {
    /**
     * Metodo main para CrearPFf, imagen y leertxt
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        GenerarPdf pdf = new GenerarPdf();
        pdf.addPagina();
        pdf.leerTxt("src/main/resources/temperaturas-abril.txt", "/aemet.png",
            "aemet", "/home/alumno/Escritorio/Prueba/prueba.pdf");
    }

    /**
     * Clase que genera el PDF
     */
    public static class GenerarPdf {
        PDDocument document;
        PDPage page;
        PDPageContentStream contentStream;
        PDImageXObject image;
        float altura = 17;

        /**
         * Constructor de la clase con 4 parametros
         */
        public GenerarPdf() {
            this.document = new PDDocument();
            this.page = new PDPage(PDRectangle.A6);
            this.contentStream = null;
            this.image = null;
        }


        /**
         * Metodo para add una pagina al pdf
         * @return retorna true si se ha podido agregar la pagina correctamente
         * @throws IOException Excepcion que se manda al main
         */
        public boolean addPagina() throws Exception {
            try {
                document.addPage(page);
                this.contentStream = new PDPageContentStream(document, page);
                return true;
            }catch (Exception e){
                throw new Exception("No se ha podido add la pagina" , e);
            }
        }

        /**
         * Metodo que agrega el titulo
         * @param texto
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
                throw new Exception("No se ha podido add el titulo", e);
            }
        }


        /**
         * Metodo que agrega el texto
         * @param texto
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
                throw new Exception("Error al add el texto", e);
            }
        }

        /**
         * Metodo que agrega imagen
         * @param direccionImagen
         * @param nombreImagen
         * @throws IOException Excepcion que controlara el main
         * @return retorna true si todo ha salido bien
         */
        public boolean agregarImagen(String direccionImagen, String nombreImagen) throws Exception {
            try {
                this.image = PDImageXObject.createFromByteArray(document, PDF.class.getResourceAsStream(direccionImagen).readAllBytes(), nombreImagen);
                contentStream.drawImage(image, page.getMediaBox().getWidth() / 2 - (image.getWidth() / 3) / 2, page.getMediaBox().getHeight() - 4 - image.getHeight() / 3,
                    image.getWidth() / 3, image.getHeight() / 3);
                this.altura += image.getHeight() / 3;

                return true;

            }catch (Exception e){

                throw new Exception("No se ha encontrado la imagen en la ruta especificada", e);
            }
        }

        /**
         * Metodo que guarda el pdf
         * @param direccion
         * @return devuelve la ruta donde se ha guardado el archivo
         * @throws IOException Excepcion que controlara el main
         */
        public String guardarPdf(String direccion) throws Exception {

            try {
                document.save(direccion);
                return "Archivo guardado en: " + direccion;
            }catch (Exception e){

                throw new Exception("No se ha podido guardar", e);

            }
        }

        /**
         * Metodo para cerrar
         * @throws IOException Excepcion que salta si hay un error al cerrar
         * @return devuelve true si se ha cerrado correctamente el contentStream
         */
        public boolean closeContentStream() throws Exception {
            try {
                this.contentStream.close();
                return true;
            }catch (Exception e){
                throw new Exception("No se ha podido cerrar", e);
            }
        }

        /**
         * Metodo para leer el archivo y calcular las medias
         * @param rutaArchivo
         * @param rutaImagen
         * @param nombreImagen
         * @param rutaGuardar
         * @return retorna true si se ha leido el fichero correctamente
         * @throws Exception excepcion que surge si existe algun error al leer o guardar algun archivo
         */
        public boolean leerTxt(String rutaArchivo, String rutaImagen, String nombreImagen,
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
                throw new Exception("Error al añadir texto", e);
            }
        }
    }
}
