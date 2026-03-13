package poo;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.PI;
import static processing.core.PConstants.TWO_PI;

public class PoligonReg extends FiguraIrr{
    PoligonReg(int n,Punt2D centre, float radi){
        super(n);
        float angle=(3*PI)/2;
       for(int i=0; i<n; i++) {
           float x = centre.x + radi * cos(angle);
           float y = centre.y + radi * sin(angle);
           char c = Integer.toString(i).charAt(0);
           Punt2D p = new Punt2D(c, x, y);
           this.setPuntAt(i, p);
          angle+=TWO_PI/n;
       }
    }
}
