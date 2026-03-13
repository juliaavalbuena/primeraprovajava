package poo;

import processing.core.PApplet;

public class MainQuadrat extends PApplet {
    Quadrat q1, q2;

    public static void main(String[] args) {
        PApplet.main("poo.MainQuadrat");
    }

    public void settings() {
        size(800, 800);
    }

    public void setup(){
        q1= new Quadrat();
        q1.setPuntAt(0,new Punt2D('A',100,100));
        q1.setPuntAt(1,new Punt2D('A',200,100));
        q1.setPuntAt(2,new Punt2D('A',200,200));
        q1.setPuntAt(3,new Punt2D('A',100,200));

    }
    public void draw(){
        background (255,0,128);
        q1.display(this,0,0,0);
    }
}