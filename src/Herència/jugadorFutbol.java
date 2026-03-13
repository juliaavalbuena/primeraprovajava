package Herència;

import poo.Jugador;

public class jugadorFutbol extends Persona{
    enum POS {DELANTER,PORTER,ALA,CENTRE};
    String nomeq;
    int gols;
    jugadorFutbol.POS pos;

    public jugadorFutbol(String nom, int edat, Persona.SEXE sexe,String nomeq, int gols, POS pos) {
        super(nom, edat, sexe);
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

    public jugadorFutbol.POS getPos() {
        return pos;
    }

    public void setPos(jugadorFutbol.POS pos) {
        this.pos = pos;
    }

    public void print (){
        System.out.printf("%s té %d anys i és %s. És jugador de l'equip %s on juga de %s i ha marcat %d gols \n",nom,edat,sexe,nomeq, pos, gols);
    }

    public void printOverride (boolean b){
        if (b){
            this.print();
        }
        else{
            super.print();
        }
    }
}
