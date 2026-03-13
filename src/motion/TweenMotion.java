package motion;

import processing.core.PApplet;

public class TweenMotion extends PApplet {

    float x,y;
    float x1,x2,y1,y2;
    float t;
    int radi= 50;
    public static void main(String[] args) {
        PApplet.main("motion.TweenMotion");
    }
    public void settings(){
        size(800,800);
    }

    public void setup(){
        x=width/2;
        y=height/2;
       x1=100;
       y1=50;
       x2=600;
       y2=400;
       t=0;
    }
    public void draw(){
        background(255,0,128);
        stroke(255)  ;
        line(x1,y1,x2,y2);
        x=x1 + (x2-x1)*t;
        y=y1 + (y2-y1)*t;
        if(t<1){
            t +=0.01;
        }

        noStroke();
        fill(0);

        circle (x1,y1,radi*2);
        circle (x2,y2,radi*2);

       fill(255);

        circle(x,y,radi*2-30);
    }


}
