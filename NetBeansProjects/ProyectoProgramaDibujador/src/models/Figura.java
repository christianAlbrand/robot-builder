package models;

import processing.core.PApplet;

    
    
public class Figura {
    
    protected Posicion posicion;
    protected Dimension dimension;
    protected int color;
    protected Borde borde;
    protected int direccion = 1;
    
    public Figura(){
        this(new Posicion(), new Dimension(100, 100), new Borde(), 255);
    }
    
    public Figura(Posicion posicion, Dimension dimension, Borde borde, int color){
        this.posicion = posicion;
        this.dimension = dimension;
        this.borde = borde;
        this.color = color;
    }
    public Posicion getPosicion(){
        return this.posicion;
    }
    
    public Dimension getDimension(){
        return this.dimension;
    }
    
    public Borde getBorde(){
        return this.borde;
    }
  
    
    public int getColor(){
        return this.color;
    }
    
    
    public void setPosicion(Posicion nuevaPosicion){
        this.posicion = nuevaPosicion;
    }
    
    public void setDimension (Dimension nuevaDimension){
        this.dimension = nuevaDimension; 
    }
    
    public void setBorde (Borde nuevoBorde){
        this.borde = nuevoBorde;
    }
    
    
    public void setColor(int nuevoValor){
        this.color = nuevoValor;
    }
    
    public void dibujar(PApplet p){
        configuraPropiedades(p);
        p.rect(this.posicion.getX(), this.posicion.getY(), this.dimension.getAncho(), this.dimension.getAlto());
        
    }
    
    public void configuraPropiedades(PApplet p){
        p.stroke(this.borde.getColor());
        p.strokeWeight(this.borde.getAncho());
        p.fill(this.color);
        
        
    }
    
    public void moverHorizontal(){
        float xNueva = this.posicion.getX() + 1;
        this.posicion.setX(xNueva);
    }
    
    public void moverDosDirecciones(){
        float xNueva = this.posicion.getX();
        if(xNueva >= 600){
            direccion = -1;
        }else if(xNueva <=0){
            direccion = 1;
        }
        this.posicion.setX(xNueva + direccion);
    }
    
    public void moverDirecciones(int direccion){
        float xNueva = this.posicion.getX() + direccion;
        this.posicion.setX(xNueva);
    }
    
    public void mover(int dx, int dy){
    posicion.setX(posicion.getX() + dx);
    posicion.setY(posicion.getY() + dy);
}

}
