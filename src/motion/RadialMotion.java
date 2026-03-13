package motion;

import processing.core.PApplet;

public class RadialMotion extends PApplet {
    float x,y;
    int r=50;
    float xc,yc,angle,angleStep;
    int radi=200;
    public static void main(String[] args) {
        PApplet.main("motion.RadialMotion");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        xc=width/2;
        yc=height/2;
        angle =0;
        angleStep=3;
    }
    public void draw(){
        background(255,0,128);
        x=xc+radi*cos(radians(angle));
        y=yc+radi*sin(radians(angle));
        angle+=angleStep;
        noStroke();
        fill(0);
        circle(x,y,r);
    }

}
