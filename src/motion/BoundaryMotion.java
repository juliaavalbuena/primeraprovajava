package motion;

import processing.core.PApplet;

public class BoundaryMotion extends PApplet {

    float x,y;
    float step =10;
    float xdir,ydir;
    int radi= 50;
    public static void main(String[] args) {
        PApplet.main("motion.BoundaryMotion");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        x=width/2;
        y=height/2;
        xdir=random(-1,1);
        ydir=random(-1,1);
    }
    public void draw(){
        background(255,0,128);
        noStroke();
        fill(0);
        circle (x,y,radi*2);
        x = x+step*xdir;
        y = y+step*ydir;

        if(x<=radi||x>=width-radi){
            xdir *= -1;
        }
        if(y<=radi||y>=height-radi){
            ydir *= -1;
        }
    }
    public void mousePressed(){
        x=width/2;
        y=height/2;
        xdir=random(-1,1);
        ydir=random(-1,1);
    }

}
