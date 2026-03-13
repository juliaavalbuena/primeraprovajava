package poo;

import processing.core.PApplet;

public class Quadrat extends FiguraIrr {
    Quadrat(){
        super(4);
    }
    Quadrat(Punt2D[]punts){
        super(punts);
    }


    public void print(){
        System.out.println("Quadrat format per: ");
        for (int i=0; i<punts.length;i++){
            this.punts[i].print();
        }
    }

}
