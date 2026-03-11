package es.cide.programacio;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

//Clase únicamente para cargar imagenes y redimensiionarlas
public class Recursos {

    // Lo guardo aqui para usarlo en diferentes clases y no repetirlo
    public final static int HEIGHT = 1080;
    public final static int WIDTH = 1920;

    // ------Constantes------
    // constantes que contienen las imagenes
    public static final Image PLAYER1_IMG = cargarImagen("/a1.png");
    public static final Image PLAYER2_IMG = cargarImagen("/b1.png");
    public static final Image FONDO_MENU = cargarImagen("/menu.png");
    public static final Image BOTO_COMENCAR_IMG = cargarImagen("/b_comenzar.png");
    public static final Image BOTO_INSTRUCCIONS_IMG = cargarImagen("/b_instrucciones.png");
    public static final Image BOTO_PANTALLACOMPLETA_IMG = cargarImagen("/b_pantallaCompleta.png");
    public static final Image BOOT_SALIR_IMG = cargarImagen("/b_salir.png");
    public static final Image BOTO_ATRAS_IMG = escalar(cargarImagen("/b_atras.png"), 300, 60);
    public static final Image BOTO_AJUSTES_IMG = cargarImagen("/b_ajustes.png");

    // ------Metodos Publicos------
    private static Image cargarImagen(String ruta) {
        // intenta cargar la imagen
        try {
            URL url = Recursos.class.getResource(ruta);
            if (url != null)
                // devuelve la imagen
                return ImageIO.read(url);
            // si no puede, error
        } catch (IOException e) {
            e.printStackTrace();
        }
        // devuelve null
        return null;
    }

    public static Image escalar(Image img, int a, int b) {
        // escalamos la imagen
        if (img == null)
            return null;
        return img.getScaledInstance(a, b, Image.SCALE_SMOOTH);
    }
}