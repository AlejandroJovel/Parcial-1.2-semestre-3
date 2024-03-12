package com.dj.parcial.directorios;

import java.io.File;

public class ListarDirectoriosRecursivos {

    public static void main(String[] args) {
        String rutaUsuario = "C:\\";

        if (rutaUsuario != null) {
            ListadorDirectorios listador = new ListadorDirectorios();
            listador.encontrarDirectorios(new File(rutaUsuario));
        } else {
            System.out.println("La ruta proporcionada no es válida.");
        }
    }
}

class ListadorDirectorios {

    public void encontrarDirectorios(File directorio) {
        if (directorio.isDirectory()) {
            System.out.println("Directorio: " + directorio.getAbsolutePath());

            File[] archivos = directorio.listFiles();

            if (archivos != null) {
                for (File archivo : archivos) {
                    encontrarDirectorios(archivo);
                }
            }
        }
    }
}

