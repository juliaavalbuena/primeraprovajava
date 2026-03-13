package poo;

import processing.core.PApplet;

public class MainEstrellaRegular extends PApplet {
    EstrellaRegular e1;
    EstrellaAlt e2;
    EstrellaRHCP e3;
    EstrellaOct e4;
    public static void main(String[] args) {
        PApplet.main("poo.MainEstrellaRegular");
    }
    public void settings(){
        size(2000,800);
    }
    public void setup(){
        e1= new EstrellaRegular(10,new Punt2D('A',1600,600),150,50);
        e2= new EstrellaAlt(30,new Punt2D('A',1200,200),150,50);
        e3= new EstrellaRHCP(28,new Punt2D('a',800,600),150,100);
        e4= new EstrellaOct(24,new Punt2D('a',400,200),150,20);
    }
    public void draw(){
        background(0);
        e1.display(this,255,255,255);
        e2.display(this,40,255,0);
        //background (0);
        e3.display(this,255,255,88);
        e4.display(this,0,255,255);
    }
}
