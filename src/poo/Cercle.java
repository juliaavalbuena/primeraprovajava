package poo;

import processing.core.PApplet;

import static processing.core.PApplet.dist;

public class Cercle {
    Punt2D centre;
    float d;

    public Cercle(Punt2D centre, float d) {
        this.centre = centre;
        this.d = d;
    }

    public Punt2D getCentre() {
        return centre;
    }

    public void setCentre(Punt2D centre) {
        this.centre = centre;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public void display(PApplet p5){
        p5.strokeWeight(2);
        p5.stroke(0);
        p5.fill(255,0,128);
        p5.circle(centre.x, centre.y, d);
        centre.display(p5);
    }

    public boolean tocar (Cercle altre,Cercle altre2){
        float radi = this.d/2;
        float radiAltre= altre.d/2;
        float radiAltre2= altre2.d/2;
        float dist = dist(this.centre.x, this.centre.y, altre.centre.x, altre.centre.y);
        float dist2 = dist(this.centre.x, this.centre.y, altre2.centre.x, altre2.centre.y);
        return (dist<=radi+radiAltre &&  dist2<= radi+radiAltre2);
    }
}
