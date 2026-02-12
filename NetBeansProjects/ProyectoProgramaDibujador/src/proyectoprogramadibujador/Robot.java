package proyectoprogramadibujador;

import models.Caja;
import models.Circulo;
import models.Figura;
import processing.core.PApplet;

public class Robot extends Figura{

    private Caja cabeza;
    private Caja cuerpo;
    private Caja brazoIzq;
    private Caja brazoDer;
    private Caja piernaIzq;
    private Caja piernaDer;

    private Circulo ojoIzq;
    private Circulo ojoDer;

    private float x;
    private float y;

    public Robot(float x, float y) {
        this.x = x;
        this.y = y;

        // Cabeza
        cabeza = new Caja();
        cabeza.getDimension().setDimension(60, 60);
        cabeza.setColor(150);
        cabeza.getBorde().setAncho(2);

        // Cuerpo
        cuerpo = new Caja();
        cuerpo.getDimension().setDimension(80, 100);
        cuerpo.setColor(120);

        // Brazos
        brazoIzq = new Caja();
        brazoIzq.getDimension().setDimension(20, 80);
        brazoIzq.setColor(120);

        brazoDer = new Caja();
        brazoDer.getDimension().setDimension(20, 80);
        brazoDer.setColor(120);

        // Piernas
        piernaIzq = new Caja();
        piernaIzq.getDimension().setDimension(25, 80);
        piernaIzq.setColor(100);

        piernaDer = new Caja();
        piernaDer.getDimension().setDimension(25, 80);
        piernaDer.setColor(100);

        // Ojos
        ojoIzq = new Circulo();
        ojoIzq.getDimension().setDimension(10, 10);
        ojoIzq.setColor(0);

        ojoDer = new Circulo();
        ojoDer.getDimension().setDimension(10, 10);
        ojoDer.setColor(0);
    }

    public void dibujar(PApplet p) {

        cabeza.getPosicion().setPosicion(x, y);
        cuerpo.getPosicion().setPosicion(x - 10, y + 60);

        brazoIzq.getPosicion().setPosicion(x - 30, y + 70);
        brazoDer.getPosicion().setPosicion(x + 70, y + 70);

        piernaIzq.getPosicion().setPosicion(x + 5, y + 160);
        piernaDer.getPosicion().setPosicion(x + 40, y + 160);

        ojoIzq.getPosicion().setPosicion(x + 15, y + 20);
        ojoDer.getPosicion().setPosicion(x + 35, y + 20);

        // Dibujar todo
        cabeza.dibujar(p);
        cuerpo.dibujar(p);
        brazoIzq.dibujar(p);
        brazoDer.dibujar(p);
        piernaIzq.dibujar(p);
        piernaDer.dibujar(p);
        ojoIzq.dibujar(p);
        ojoDer.dibujar(p);
    }

    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
