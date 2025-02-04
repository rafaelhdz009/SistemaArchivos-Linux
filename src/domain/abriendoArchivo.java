package domain;

import java.awt.*;
import java.io.*;



public class abriendoArchivo {
    public static void main(String[] args) {
        String rutaArchivo = "texto.txt";

        File archivo = new File(rutaArchivo);

        if (archivo.exists()) {
            try {
                Desktop.getDesktop().open(archivo);
            } catch (IOException e) {
                System.out.println("Error al abrir el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
