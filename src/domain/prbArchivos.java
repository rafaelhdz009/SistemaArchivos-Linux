package domain;

import java.io.*;

public class prbArchivos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rutaArchivo = "texto.txt";

        String s;
        int r, w, x;
        boolean rB, wB, xB;

        File archivo = new File(rutaArchivo);


        if (archivo.exists()) {
            r = archivo.canRead() ? 1 : 0;
            w = archivo.canWrite() ? 1 : 0;
            x = archivo.canExecute() ? 1 : 0;

            System.out.println("Archivo: " + archivo.getName() + " tiene los siguiente permisos: ");
            System.out.println("r\tw\tx");
            System.out.println(r + "\t" + w + "\t" + x);

            System.out.println("¿Desea modificar los permiso? s/cualquier letra");
            s = br.readLine().toUpperCase();

            if (s.equals("S")) {
                System.out.println("");
                System.out.println("Permiso de lectura: ");
                r = Integer.parseInt(br.readLine());
                rB = r == 1 ? archivo.setReadable(true) : archivo.setReadable(false);

                System.out.println("Permiso de escritura: ");
                w = Integer.parseInt(br.readLine());
                wB = w == 1 ? archivo.setWritable(true) : archivo.setWritable(false);

                
                System.out.println("Permiso de ejecutable: ");
                x = Integer.parseInt(br.readLine());
                xB = x == 1 ? archivo.setExecutable(true) : archivo.setExecutable(false);

                System.out.println("Permisos actualizados: ");
                r = archivo.canRead() ? 1 : 0;
                w = archivo.canWrite() ? 1 : 0;
                x = archivo.canExecute() ? 1 : 0;
                System.out.println("r\tw\tx");
                System.out.println(r + "\t" + w + "\t" + x);
            }
            
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
