package motion;

import processing.core.PApplet;

public class HorizontalMotion extends PApplet {

    float x,y;
    float xStep =7;
    int dire = 1;
    int radi= 50;
    public static void main(String[] args) {
        PApplet.main("motion.HorizontalMotion");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        x=width/2;
        y=height/2;
    }
    public void draw(){
        background(255,0,128);
        noStroke();
        fill(0);
        circle (x,y,radi*2);
        x = x+xStep*dire;
        if(dire==1 && x>=width-radi || dire==-1 && x<=radi){
            dire *= -1;
        }

    }

}
