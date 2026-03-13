public class NomEdatAlturaGrupSanguiniSexe {
    static enum Sexe {HOME,DONA};
    public static void main(String[] args){
        String nom = "Júlia";
        int edat = 16;
        float altura = 1.80f;
        char sang = 'A';
        Sexe sexe = Sexe.DONA;
        System.out.println(nom+ "\n" +edat+"\n"+altura+"m"+"\n"+sang+"\n"+sexe );
    }
}

