package es.iespuertodelacruz.alfonso;

import java.util.Scanner;

class ReadRss {
        public static void main(String[] args) {
                boolean salir = false;
                while (!salir) {
                        System.out.println("Tienes estas opciones para leer tu RSS");
                        System.out.println("1. Mostrar la version de XML y RSS");
                        System.out.println("2. Mostras el Titulo de la RSS");
                        System.out.println("3. Mostrar la Descripcion de la RSS");
                        System.out.println("4. Mostrar el Link de la RSS");
                        System.out.println("5. Mostrar el Item entero de la RSS");
                        System.out.println("6. Salir");
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Elige un opción");
                        int opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
                                case 1:
                                        mostrarVersiones();
                                        break;

                                case 2:
                                        mostrarTitulo();
                                        break;

                                case 3:
                                        mostrarDescripcion();
                                        break;
                                case 4:
                                        mostrarLink();
                                        break;
                                case 5:
                                        mostrarItem();
                                        break;
                                case 6:
                                        salir = true;
                                        break;
                                default:
                                        System.out.println("Debe elegir una opcion de las dadas");
                        }
                }
        }

        static void mostrarTitulo() {
                System.out.println("<title>Alfonso García</title>");
        }

        static void mostrarVersiones() {
                System.out.println(
                                "xml version = 1.0" + "rss version = 2.0");
        }

        static void mostrarDescripcion() {
                System.out.println(
                                " <description>Proyectos realizados en mi repositorio</description>");
        }

        static void mostrarLink() {
                System.out.println("<link>https://github.com/alfonsogj14</link>");
        }

        static void mostrarItem() {
                System.out.println(
                                "<item>" +
                                                "<title>Proyecto PharmaGuardia</title>" + "\n" +
                                                "<link>https://github.com/alfonsogj14/ProyectoETS</link>" + "\n" +
                                                "<description>Nuevo proyecto PharmaGuardia</description>" + "\n" +
                                                "</item>" + "\n");
        }

}
