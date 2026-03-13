package poo;

import processing.core.PApplet;

public class FiguraIrr {

    Punt2D[]punts;
    public FiguraIrr(Punt2D [] punts){
        this.punts = punts;
    }
    public FiguraIrr (int n){
        this.punts = new Punt2D [n];
    }

    public Punt2D getPuntAt(int n){return this.punts[n];};

    public void setPuntAt(int n, Punt2D p){this.punts[n]=p;}

    public void print(){
        System.out.println("Polígon format per: ");
        for (int i=0; i<punts.length;i++){
            this.punts[i].print();
        }
    }

    public void display(PApplet p5,int red,int green, int blue){
        p5.strokeWeight(3); p5.stroke(red,green,blue);
        for (int i=0; i<punts.length;i++){
            int j=(i+1)% punts.length;
            this.punts[i].display(p5);
            p5.line(this.punts[i].x, this.punts[i].y,this.punts[j].x,this.punts[j].y);
        }
    }
}
