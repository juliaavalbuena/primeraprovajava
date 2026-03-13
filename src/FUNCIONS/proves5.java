package FUNCIONS;

public class proves5 {
    static void main(String[] args) {
        float preu1= afegirIVA(5.75f);
        float preu2= afegirIVA(100f);
        System.out.println(preu1+" , "+preu2);
    }
    public static float afegirIVA(float preu){
        float pvp = preu*1.21f;
        return pvp;
    }
}
