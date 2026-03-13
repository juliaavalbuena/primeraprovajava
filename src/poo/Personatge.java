package poo;

import processing.core.PApplet;
import processing.core.PImage;

public class Personatge{
    PImage[] img;
    int numFrame=0;
    int speedImg;
    int speedX;
    float x,y;
    int dire;

    public Personatge(float y, float x,int dire, int speed,int speedX) {
        this.y = y;
        this.x = x;
        this.speedImg = speed;
        this.dire=dire;
    }
    public void loadImatges(PApplet p5,int numImages,String nomp){
        img=new PImage[numImages];
        for (int i=0; i<img.length;i++){
            img[i]=p5.loadImage(nomp+i+".png");
        }
    }
    public void display(PApplet p5){
        p5.pushMatrix();
        p5.translate(x,y);
        p5.scale(dire,1);
        p5.image(img[numFrame], 0, 0);
        p5.popMatrix();
    }
    public void move(int speedX){
        x+=speedX *dire;
        if ((x>=1400-img[numFrame].width)||(x<=img[numFrame].width && dire==-1)){
            dire *=-1;
        }
    }
    public void  updF(PApplet p5){
        if(p5.frameCount% speedImg ==0) {
            numFrame++;
            if (numFrame == 8) {
                numFrame = 0;
            }
        }
    }
}
