package poo;

import processing.core.PApplet;

public class MainPoligonReg extends PApplet {

    PoligonReg pr1,pr2;
    Pentagon pp;
    public static void main(String[] args) {
        PApplet.main("poo.MainPoligonReg");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        pr1= new PoligonReg(7,new Punt2D('A',400,400),300);
        pp= new Pentagon(new Punt2D('1',300,300),100 );
    }
    public void draw(){
        background(255,0,128);
        pr1.display(this,0,0,0);
        pp.display(this,0,0,0);
    }
}
