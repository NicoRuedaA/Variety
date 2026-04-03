package es.cide.programacio;

public class Rectangle implements Collider {

    // -----Variables------
    private double xPos;
    private double yPos;
    private double xSize;
    private double ySize;
    private double xVel;
    private double yVel;

    // -----Constructor------
    public Rectangle(double initialPosX, double initialPosY, double initialSizeX, double initialSizeY,
            double initialXvel, double initialYvel) {
        this.xPos = initialPosX;
        this.yPos = initialPosY;
        this.xSize = initialSizeX;
        this.ySize = initialSizeY;
        this.xVel = initialXvel;
        this.yVel = initialYvel;
    }

    public Rectangle() {

    }

    // -----Metodos publicos-----
    @Override
    public String getType() {
        // metodo para devolver que tipo de objeto es (lo usaremos en la colision)
        return "rectangle";
    }

    // -----Setters------
    public void setPosX(double newX) {
        this.xPos = newX;
    }

    public void setPosY(double newY) {
        this.yPos = newY;
    }

    public void setPos(double newX, double newY) {
        setPosX(newX);
        setPosY(newY);
    }

    public void setXvel(double newXvel) {
        this.xVel = newXvel;
    }

    public void setYvel(double newYvel) {
        this.yVel = newYvel;
    }

    public void setVel(double newXvel, double newYvel) {
        setXvel(newXvel);
        setYvel(newYvel);
    }

    // -----Getters------
    public double getPosX() {
        return this.xPos;
    }

    public double getPosY() {
        return this.yPos;
    }

    public double getSizeX() {
        return this.xSize;
    }

    public double getSizeY() {
        return this.ySize;
    }

    public double getVelX() {
        return this.xVel;
    }

    public double getVelY() {
        return this.yVel;
    }

}
