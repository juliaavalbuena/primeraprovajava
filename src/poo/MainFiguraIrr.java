package poo;

import processing.core.PApplet;

public class MainFiguraIrr extends PApplet {

    FiguraIrr p1;

    public static void main(String[] args) {
        PApplet.main("poo.MainFiguraIrr");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        p1= new FiguraIrr(3);
        p1.setPuntAt(0,new Punt2D('1',200,200));
        p1.setPuntAt(1,new Punt2D('2',350,400));
        p1.setPuntAt(2,new Punt2D('3',700,650));

    }
    public void draw(){
        background(255,0,128);
        p1.display(this,0,0,0);
    }
}
