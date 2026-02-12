package proyectoprogramadibujador;

import processing.core.PApplet;

public class ProyectoProgramaDibujador extends PApplet{
    
    Robot robot;
    
    public static void main(String[] args) {
        PApplet.main(ProyectoProgramaDibujador.class);
    }
    
    @Override
    public void settings() {
        size(600, 400);
    }
    
    @Override
    public void setup(){
        robot = new Robot(100, 200);
    }
    
    @Override
    public void draw(){
        background(100);

        if (keyPressed) {

            if (key == 'a' || key == 'A') robot.mover(-5, 0);
            if (key == 'd' || key == 'D') robot.mover(5, 0);
            if (key == 'w' || key == 'W') robot.mover(0, -5);
            if (key == 's' || key == 'S') robot.mover(0, 5);
        }

        robot.dibujar(this);
    }
}
