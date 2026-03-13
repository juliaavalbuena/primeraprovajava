package poo;

import processing.core.PApplet;
import processing.core.PImage;

public class PersonatgeMain extends PApplet {

    Personatge p1, p2, p3;

    public static void main(String[] args) {
        PApplet.main("poo.PersonatgeMain");
    }

    public void settings() {
        size(1400, 700);
    }

    public void setup() {
        p1 = new Personatge(0, 170, 1, 10,16);
        p2 = new Personatge(540, 450, -1, 3,10 );
        p1.loadImatges(this,8,"frame");
        p2.loadImatges(this,10,"Artboard ");
    }

    public void draw() {
        background(255);
        p1.display(this);
        p2.display(this);
        p1.move(5);
        p2.move(9);
        p1.updF(this);
        p2.updF(this);
    }
}