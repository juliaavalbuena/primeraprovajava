package motion;

import processing.core.PApplet;

public class VerticalMotion extends PApplet {
    float x,y;
    int dire=1;
    int yStep=7;
    int radi =25;
    public static void main(String[] args) {
        PApplet.main("motion.VerticalMotion");
    }
    public void settings(){
        size(800,800);
    }
    public void setup(){
        y=height/2;
        x=width/2;
    }
    public void draw(){
        background(255,0,128);
        noStroke();
        fill(0);
        circle(x,y,radi*2);
        y += yStep*dire;
        if ((dire==1 && y>= height-radi)||(dire==-1 && y<=radi)) {
            dire *=-1;
        }
    }

}
