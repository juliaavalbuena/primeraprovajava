package poo;

public class Jugador {
    enum POS {DELANTER,PORTER,ALA,CENTRE};
    String nomeq;
    int gols;
    POS pos;


    public Jugador(String nomeq, int gols, POS pos) {
        this.nomeq = nomeq;
        this.gols = gols;
        this.pos = pos;
    }

    public String getNomeq() {
        return nomeq;
    }

    public void setNomeq(String nomeq) {
        this.nomeq = nomeq;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public POS getPos() {
        return pos;
    }

    public void setPos(POS pos) {
        this.pos = pos;
    }

    public void print (){
        System.out.printf("el jugador de l'equip %s que juga de %s ha marcat %i gols \n",nomeq, pos, gols);
    }


}
