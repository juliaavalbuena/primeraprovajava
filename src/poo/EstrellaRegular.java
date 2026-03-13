package poo;

import static java.lang.Math.PI;
import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.TWO_PI;

public class EstrellaRegular extends FiguraIrr{
    EstrellaRegular(int n, Punt2D centre, float radi1, float radi2){
        super(n);
        float angle = (float)(3*PI)/2;
        for (int i=0; i<n;i++){
            char c = Integer.toString(i).charAt(0);

            if (i%2==0){
                float x = centre.x + radi1 * cos(angle);
                float y = centre.y + radi1 * sin(angle);
                Punt2D p = new Punt2D(c, x, y);
                this.setPuntAt(i,p);
            }
            else{
                float x = centre.x + radi2 * cos(angle);
                float y = centre.y + radi2 * sin(angle);
                Punt2D p = new Punt2D(c, x, y);
                this.setPuntAt(i,p);
            }
            angle+=TWO_PI/n;
        }
    }
}
