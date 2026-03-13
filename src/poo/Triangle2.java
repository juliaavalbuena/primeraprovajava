package poo;

import processing.core.PApplet;

public class Triangle2 extends PApplet {

    Punt2D [] punts;
    Linia2D l1,l2,l3;

    public static void main(String[] args) {
        PApplet.main("poo.TestProcessing");
    }

    public void settings(){
        size(700,700);
    }

    public void setup(){
        this.punts=new Punt2D[3];
        this.punts[0]=new Punt2D('A',width/2,height/2);
        this.punts[1]=new Punt2D('B',width/2-100,height/2+90);
        this.punts[2]=new Punt2D('C',width/2+100,height/2+90);

        l1 = new Linia2D( this.punts[0], this.punts[1]);
        l2 = new Linia2D(this.punts[1],this.punts[2]);
        l3 = new Linia2D(this.punts[2],this.punts[0]);

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
