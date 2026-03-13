package poo;

import processing.core.PApplet;

public class MainTriangleBé extends PApplet {

    TriangleBé t1;
    public static void main(String[] args) {
        PApplet.main("poo.MainTriangleBé");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        t1= new TriangleBé(new Punt2D('A',400,100), new Punt2D('B',500,300),new Punt2D('C',200,700));
    }
    public void draw(){
        background(255,0,128);
        t1.display(this);
    }
}
