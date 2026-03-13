package motion;

import processing.core.PApplet;

public class TweenTriangleMotion extends PApplet {

    float x,y;
    int radi= 50;
    int numTrajecte;
    float[] xs;
    float[] ys;
    float t;
    public static void main(String[] args) {
        PApplet.main("motion.TweenTriangleMotion");
    }
    public void settings(){
        size(800,800);
    }

    public void setup(){
        x=width/2;
        y=height/2;
        xs=new float[3];
        ys=new float[3];
        xs[0]=100; ys[0]=50;
        xs[1]=600; ys[1]=250;
        xs[2]=350; ys[2]=40;
        numTrajecte=0;
        t=0;
    }
    public void draw(){
        background(255,0,128);
        stroke(255);
        x=xs[numTrajecte] + (xs[(numTrajecte+1)%xs.length]-xs[(numTrajecte)%xs.length])*t;
        y=ys[numTrajecte] + (ys[(numTrajecte+1)%ys.length]-ys[(numTrajecte)%ys.length])*t;

        if(t<1){
            t +=0.01;
        }
        else{
            numTrajecte++;
            t=0;
            numTrajecte=numTrajecte%xs.length;
        }
        for(int i=0; i<xs.length; i++){
            stroke(0);

            line(xs[i], ys[i], xs[(i + 1) % xs.length], ys[(i + 1) % ys.length]);
                fill(0);
                circle(xs[i], ys[i], radi);
        }


        circle(x,y,radi*2);
    }


}
