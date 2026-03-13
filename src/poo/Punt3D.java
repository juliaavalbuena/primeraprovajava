package poo;

import processing.core.PApplet;

public class Punt3D {

    char nom;
    float x,y,z;

    Punt3D(char nom){
        this.nom=nom;
        this.x =0;
        this.y =0;
        this.z =0;
    }
    Punt3D(char nom, float x, float y){
        this.nom=nom;
        this.x =x;
        this.y =y;
        this.z =z;
    }

    public char getNom(){return this.nom;}
    public float getX(){return this.x;}
    public float getY(){return this.y;}
    public float getZ(){return this.z;}

    public void setNom(char nom){this.nom = nom;}
    public void setX(float x){this.x = x;}
    public void setY(float y){this.y = y;}
    public void setZ(float z){this.z = z;}
    public void setXYZ(float x, float y, float z){
        this.x=x; this.y=y; this.z=z;
    }

    public void print(){
        System.out.printf("Punt %c : ( %f , %f , %f).\n",nom,x,y,z);
    }

    public void display (PApplet p5){
        p5.fill(0);
        p5.circle(this.x,this.y,20);
        p5.textSize(14);
        p5.textAlign (p5.CENTER);
        String info= nom + " :( "+x+" ,  "+y+" )";
        p5.text(info,this.x,this.y-20);
    }
}
