package es.cide.programacio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Sound {

    private Clip clip;

    public void reproducirEnBucle(String rutaArchivo) {
        // Método para cargar y reproducir en bucle
        try {
            File archivo = new File(rutaArchivo);

            if (archivo.exists()) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);

                // Configuración para bucle infinito
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
            } else {
                System.out.println("Error: No se encuentra el archivo de audio en: " + rutaArchivo);
            }

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void reproducirUnaVez(String rutaArchivo) {
        // Método para cargar y reproducir una vez
        try {
            File archivo = new File(rutaArchivo);

            if (archivo.exists()) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);

                // Si ya había un clip sonando o cargado, es buena práctica cerrarlo antes de
                // abrir uno nuevo
                if (clip != null && clip.isOpen()) {
                    clip.close();
                }

                clip = AudioSystem.getClip();
                clip.open(audioInputStream);

                clip.start();

            } else {
                System.out.println("Error: No se encuentra el archivo de audio en: " + rutaArchivo);
            }

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    public void detener() {
        // Método para detener y limpiar memoria
        if (clip != null) {
            if (clip.isRunning()) {
                clip.stop();
            }
            clip.close(); // Importante para liberar recursos
        }
    }
}