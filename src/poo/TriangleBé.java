package poo;

import processing.core.PApplet;

public class TriangleBé {

    Punt2D[]punts;
    public TriangleBé(Punt2D a, Punt2D b, Punt2D c){
        this.punts = new Punt2D[3];
        this.punts[0] = a;
        this.punts[1] = b;
        this.punts[2] =c;
    }

    public Punt2D getPuntAt(int n){return this.punts[n];};

    public void setPuntAt(int n, Punt2D p){this.punts[n]=p;}

    public void print(){
        System.out.println("Triangle format per: ");
        for (int i=0; i<punts.length;i++){
            this.punts[i].print();
        }
    }

    public void display(PApplet p5){
        p5.strokeWeight(3); p5.stroke(255);
        for (int i=0; i<punts.length;i++){
            int j=(i+1)% punts.length;
            this.punts[i].display(p5);
            p5.line(this.punts[i].x, this.punts[i].y,this.punts[j].x,this.punts[j].y);
        }
    }
}
