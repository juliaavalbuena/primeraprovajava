package FUNCIONS;

public class proves6 {
    static void main(String[] args) {
        float preu1= afegirIVA(5.75f,21);
        float preu2= afegirIVA(100f,10);
        System.out.println(preu1+"$, "+preu2+"$");
    }
    public static float afegirIVA(float preu,float iva){
        float pvp = preu*(1+iva/100);
        return pvp;
    }
}
