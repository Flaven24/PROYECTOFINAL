package trabajo_final.controladorArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author TI_PROMEFAR
 */
public class LectorArchivos {

    // CONTROLADORES
    public StringBuilder LeerArchivo(String ruta) {
        BufferedReader archivoEntrada = null;
        try {
            StringBuilder lector = new StringBuilder();
            existeArchivo(ruta);
            archivoEntrada = new BufferedReader(new FileReader(new File(ruta)));

            String linea = null;
            while ((linea = archivoEntrada.readLine()) != null) {
                lector.append(linea + "\n");
            }
            archivoEntrada.close();
            return lector;
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
            return null;
        } finally {
            try {
                if (archivoEntrada != null) {
                    archivoEntrada.close();
                }
            } catch (Exception ex2) {
                ex2.printStackTrace();
                System.out.println("Error " + ex2.getMessage());
            }
        }
    }

    public void EscribirArchivo(StringBuilder texto, String ruta) {
        BufferedWriter archivoSalida = null;
        try {
            archivoSalida = new BufferedWriter(new FileWriter(new File(ruta)));
            archivoSalida.append(texto.toString());
            archivoSalida.close();
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        } finally {
            try {
                if (archivoSalida != null) {
                    archivoSalida.close();
                }
            } catch (Exception ex2) {
                ex2.printStackTrace();
                System.out.println("Error " + ex2.getMessage());
            }
        }
    }

    public void existeArchivo(String ruta) {
        try {
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
