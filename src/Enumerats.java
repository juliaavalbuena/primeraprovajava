public class Enumerats {
        static enum Sexe {HOME,DONA};
        static enum EstatCivil {SOLTER, CASAT, DIVORCIAT};
        static enum EstatLaboral {ESTUDIA, TREBALLA, ATUR};
        static enum Estudis {CAP, ESO, BATXILLER, FP, PRIMÀRA};

        public static void main(String[] args){
            Sexe a = Sexe.HOME;
            Sexe b = Sexe.DONA;
            EstatCivil c = EstatCivil.SOLTER;
            EstatLaboral d = EstatLaboral.ATUR;
            Estudis e = Estudis.FP;
            System.out.println(a+","+b+","+c+","+d+","+e);
        }
}
