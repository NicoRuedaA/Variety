package es.cide.programacio;

public class Vehicle {
    protected String propietari, numBastidor;

    // ***CONSTRUCTORS***/
    public Vehicle() {

    }

    public Vehicle(String prop, String num) {
        this.propietari = prop;
        this.numBastidor = num;
    }

    // ***GETS***/
    public String getPropietari() {
        return this.propietari;
    }

    public String getNumBastidor() {
        return this.numBastidor;
    }

    // ***SETS***/

    public void setPropietari(String prop) {
        this.propietari = prop;
    }

    public void setNumBastidor(String num) {
        this.numBastidor = num;
    }

}
