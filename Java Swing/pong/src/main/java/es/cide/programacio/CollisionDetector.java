package es.cide.programacio;

public class CollisionDetector {

    public static boolean collides(Collider a, Collider b) {
        // tipo de geometria en variables
        String typeA = a.getType();
        String typeB = b.getType();

        // Si ambos son rectángulos...
        if (typeA.equals("rectangle") && typeB.equals("rectangle"))
            return rectRect((Rectangle) a, (Rectangle) b);

        // Si ambos son círculos...
        if (typeA.equals("cercle") && typeB.equals("cercle"))
            return circleCircle((Cercle) a, (Cercle) b);

        // Si A es rectángulo y B es círculo...
        if (typeA.equals("rectangle") && typeB.equals("cercle"))
            return rectCircle((Rectangle) a, (Cercle) b);

        // Si están al revés...
        if (typeA.equals("cercle") && typeB.equals("rectangle"))
            return rectCircle((Rectangle) b, (Cercle) a);

        // si no coincide con alguna combinación anterior, no hacemos nada
        return false;
    }

    // ------ Rectangulo - Rectangulo ------
    private static boolean rectRect(Rectangle r1, Rectangle r2) {
        // Devuelve true si se cumple todo esto (hay colision)
        // el lado izquierdo de r1 es menor que el derecho de r2
        return r1.getPosX() < r2.getPosX() + r2.getSizeX()
                // el derecho de r1 es mayor que el izquierdo de r2
                && r1.getPosX() + r1.getSizeX() > r2.getPosX()
                // la parte superior de r1 está más arriba que la parte inferior de r2
                && r1.getPosY() < r2.getPosY() + r2.getSizeY()
                // la parte inferior de r1 está más abajo que la parte superior de r2
                && r1.getPosY() + r1.getSizeY() > r2.getPosY();
    }

    // ------ Circulo - Circulo ------
    private static boolean circleCircle(Cercle c1, Cercle c2) {
        // distancia horizontal entre los dos círculos
        double dx = c1.getPosX() - c2.getPosX();
        // distancia vertical entre los dos círculos
        double dy = c1.getPosY() - c2.getPosY();

        // suma de radios: distancia mínima para que no se toquen
        double sumaRadios = c1.getRadi() + c2.getRadi();

        // si se cumple, hay colision
        return (dx * dx + dy * dy) < (sumaRadios * sumaRadios);
    }

    // ------ Rectangulo - Circulo ------
    private static boolean rectCircle(Rectangle r, Cercle c) {
        // centro del círculo
        double circleCenterX = c.getPosX() + c.getRadi();
        double circleCenterY = c.getPosY() + c.getRadi();

        // punto X del rectángulo más cercano al centro del círculo
        double nearestX = Math.max(r.getPosX(), Math.min(circleCenterX, r.getPosX() + r.getSizeX()));

        // punto Y del rectángulo más cercano al centro del círculo
        double nearestY = Math.max(r.getPosY(), Math.min(circleCenterY, r.getPosY() + r.getSizeY()));

        // calculamos la distancia entre lo anteriro y el centro del circulo
        double dx = circleCenterX - nearestX;
        double dy = circleCenterY - nearestY;

        // si la distancia al cuadrado es menor que el radio al cuadrado hay colision
        return (dx * dx + dy * dy) < (c.getRadi() * c.getRadi());
    }
}