/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */
package es.cide.programacio;

//objeto que guarda un insulto
public class Insult {

    // compuesto por un string que contiene el insulto del pirata y su respuesta
    // correcta
    private String textoInsulto;
    private String textoRespuesta;

    // ***CONSTRUCTORES***
    // constructor por defecto
    public Insult() {
        this.textoRespuesta = "";
        this.textoInsulto = "";
    }

    // constructor para un insulto concreto
    public Insult(String textoInsulto, String textoRespuesta) {
        this.textoInsulto = textoInsulto;
        this.textoRespuesta = textoRespuesta;
    }

    // ***GETS***
    // get que devuelve el String del insulto
    public String getTextoInsulto() {
        return this.textoInsulto;
    }

    // get que devuelve le string de la respuesta
    public String getTextoRespuesta() {
        return this.textoRespuesta;
    }

    public void setTextoInsulto(String s) {
        this.textoInsulto = s;
    }

    public void setTextoRespuesta(String s) {
        this.textoRespuesta = s;
    }

}
