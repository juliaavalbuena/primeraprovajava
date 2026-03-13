package poo;

import processing.core.PApplet;
import processing.core.PImage;

public class AnimacioCaminar extends PApplet {

    PImage[] img;
    int numFrame=0;
    int speed = 15;
    float x,y;
    int dire=1;
    public static void main(String[] args) {
        PApplet.main("poo.AnimacioCaminar");
    }
    public void settings(){
        size(1400,700);
    }
    public void setup(){
        loadImatges();
    }
    public void draw() {
        background(0, 255, 100);
        display();
        move();
        updF();
    }
    public void display(){
        //tint (150,250,150);
        pushMatrix();
        translate(x,y);
        scale(dire,1);
        image(img[numFrame], 0, 0);
        popMatrix();
    }
    public void move(){
        x+=5*dire;
        if ((x>=width-img[numFrame].width)||(x<=img[numFrame].width && dire==-1)){
            dire *=-1;
        }
    }
    public void  updF(){
        if(frameCount%speed==0) {
            numFrame++;
            if (numFrame == 8) {
                numFrame = 0;
            }
        }
    }
    public void loadImatges(){
        img=new PImage[8];
        for (int i=0; i<img.length;i++){
            img[i]=loadImage("frame"+i+".png");
        }
    }

}
