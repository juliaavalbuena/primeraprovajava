package poo;

import processing.core.PApplet;


public class MainCercle extends PApplet {

    Cercle c1,c2,c3;

    public static void main(String[] args) {
        PApplet.main("poo.MainCercle");
    }
    public void settings(){
        size(800,800);
    }

    public void setup(){
        Punt2D p1 = new Punt2D('A',width/2, height/2);
        c1=new Cercle(p1,200);
        c2 = new Cercle(new Punt2D ('B', width/4, height/3), 250);


    }
    public void draw(){
        background(255,255,0);
        c1.display(this);
        c2.display(this);
        if (c3!=null){
            c3.display(this);
        }
    }

    public void mousePressed(){

        Punt2D pMouse = new Punt2D ('M',mouseX,mouseY);
        if (c3==null) {
            c3 = new Cercle(pMouse, 100);
        }
        else {
            c3.setCentre(pMouse);
            c3.setD(random(50,300));
        }
        if (c3.tocar(c2,c1)){
            println("SE TOQUEN!!");
        }
        else{
            println("NO SE TOQUEN!!");

        }
    }
}