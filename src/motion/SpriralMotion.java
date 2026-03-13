package motion;

import processing.core.PApplet;

public class SpriralMotion extends PApplet {
    float x,y;
    int r=50;
    float xc,yc,angle,angleStep;
    int radi=1;
    int dire=1;
    public static void main(String[] args) {
        PApplet.main("motion.SpriralMotion");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        xc=width/2;
        yc=height/2;
        angle =0;
        angleStep=2;
    }
    public void draw(){
        background(255,0,128);
        x=xc+radi*cos(radians(angle));
        y=yc+radi*sin(radians(angle));
        angle+=angleStep;
        noStroke();
        fill(0);
        circle(x,y,r);
        radi+=dire;
        if((dire==1 && radi>=width/2+100)|| (dire==-1 && radi<=0)){
            dire*=-1;
        }
    }


}
