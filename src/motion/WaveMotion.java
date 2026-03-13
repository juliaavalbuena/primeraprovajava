package motion;

import processing.core.PApplet;

public class WaveMotion extends PApplet {
    float x,y,d;
    float xStep;
    int dire;
    float yb,ampli,angle,angleStep;
    public static void main(String[] args) {
        PApplet.main("motion.WaveMotion");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        background(255,0,128);

        x=0;
        y=height/2;
        d=50;
        xStep=0.5f;
        dire=1;
        yb=height/2;
        ampli=200;
        angle=0;
        angleStep=1;
    }
    public void draw(){
        stroke(255);
        fill(0);
        circle(x,y,d);
        x+= xStep*dire;
        if((x> width - d/2 && dire ==1)||(x<d/2 && dire==-1)){
            dire*=-1;
            background(255,0,128);
        }
        y= yb+ampli*sin(radians(angle));
        angle+=angleStep;
    }

}
