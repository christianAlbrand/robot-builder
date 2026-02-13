package proyectoprogramadibujador;

import models.Caja;

import processing.core.PApplet;

public class ProyectoProgramaDibujador extends PApplet{
    
    Robot robot;
    Robot robot1;
    Caja lava;
    
    
    public static void main(String[] args) {
        PApplet.main(ProyectoProgramaDibujador.class);
    }
    
    @Override
    public void settings() {
        size(600, 400);
    }
    
    @Override
    public void setup(){
        robot = new Robot(250, 100);
        lava = new Caja();
        lava.getPosicion().setPosicion(0, 300);
        lava.getDimension().setDimension(600, 130);
        lava.getBorde().setAncho(0);

        lava.setColor(0xFFFF0000);
        
        robot1= new Robot(200,100);
        robot1.cambiarColorCabeza(0xFFa190f3);
        robot.cambiarColorRobotCompleto(0xFFa190f3);
    }
    
    @Override
    public void draw(){
        background(100);

        if (keyPressed) {

            if (key == 'a' || key == 'A') robot.mover(-5, 0);
            if (key == 'd' || key == 'D') robot.mover(5, 0);
            if (key == 'w' || key == 'W') robot.mover(0, -5);
            if (key == 's' || key == 'S') robot.mover(0, 5);
            
            if (keyCode == UP) robot1.mover(0,-5);
            if (keyCode == DOWN) robot1.mover(0,5);
            if (keyCode == LEFT) robot1.mover(-5,0);
            if (keyCode == RIGHT) robot1.mover(5, 0);
        }

        robot.dibujar(this);
        robot1.dibujar(this);
        lava.dibujar(this);
    }
}
