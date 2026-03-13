package poo;

import processing.core.PApplet;

public class TestProcessing extends PApplet {

    Punt2D p1,p2,p3;
    Linia2D l1,l2,l3;

    public static void main(String[] args) {
        PApplet.main("poo.TestProcessing");
    }

    public void settings(){
        size(700,700);
    }

    public void setup(){
        p1=new Punt2D('A',width/2,height/2);
        p2=new Punt2D('B',width/2-30,height/2+40);
        p3=new Punt2D('C',width/2+30,height/2+40);

        l1 = new Linia2D(p1,p2);
        l2 = new Linia2D(p2,p3);
        l3 = new Linia2D(p3,p1);

    }

    public void draw(){
        background(255,0,128);

        strokeWeight(2);
        stroke(255);
        l1.display(this);
        l2.display(this);
        l3.display(this);
    }
}
