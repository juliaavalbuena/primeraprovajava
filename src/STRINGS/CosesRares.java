package STRINGS;

public class CosesRares {
    static void main(String[] args) {
        String x = "Hello";

        //LLAGÀRIA STRING
        int numChars = x.length();
        System.out.printf("LA LLARGADA DE %s ÉS %d.\n", x, numChars);
        System.out.println("\n");


        //CARÀCTER A UNA POSICIÓ
        int p = 2;
        int c1 = x.charAt(p);
        System.out.printf("LA LLETRA %d DE %s és %c.\n", p, x, c1);
        System.out.println("\n");


        //IMPRIMIR STRING LLETRA X LLETRA
        for (int i = 0; i < x.length(); i++) {
            System.out.printf("%d : %c.\n", i, x.charAt(i));
        }
        System.out.println("\n");

        //IMPRIMIR STRING LLETRA X LLETRA CAP A ENRERE
        int j = x.length() - 1;
        while (j >= 0) {
            System.out.printf("%d : %c.\n", j, x.charAt(j));
            j--;
        }
        System.out.println("\n");


        //COMPTAR NOMBRE DE "L" A STRING
        int total = 0;
        for (int f = 0; f < x.length(); f++) {
            if (x.charAt(f) == 'l') {
                total++;
            }
        }
        System.out.println("AQUEST STRING TÉ " + total + " VEGADES LA LLETRA L");
        System.out.println("\n");

        //SABER SI COMENÇA PER VOCAL
        boolean vocal=x.charAt(0) == 'a'|| x.charAt(0) == 'e'||x.charAt(0) == 'i'||x.charAt(0) == 'o'||x.charAt(0) == 'u';
        System.out.println("ÉS "+vocal+" QUE AQUEST ARRAY COMENÇA EN VOCAL");
        System.out.println("\n");

        //PARAULA CAPICUA
       String z = "dabalearrozalazorraelabad";
        boolean capicua= true;
        for (int w=0; w<z.length()/2; w++){
            if (z.charAt(w)!=z.charAt(z.length()-w-1)){
                capicua=false;
                break;
            }
        }
        System.out.printf("%s és capicua: %b",z,capicua);
        System.out.println("\n");

        //CANVIA A PER E
        String canc = "UNA MOSCA VOLAVA PER LA LLUM";
        String canc2="";
        for (int q=0; q<canc.length();q++){
            if (canc.charAt(q)=='A' ||canc.charAt(q)=='U'||canc.charAt(q)=='O' ){
                canc2 += 'E';
            }
            else{
                canc2 += canc.charAt(q);
            }
        }
        System.out.println(canc2);
        System.out.println("\n");


        //PASSAR A MAJÚSCULES UN STRING
        String maj=x.toUpperCase();
        System.out.println(x+ " EN MAJÚSCULES ÉS: "+maj);
        System.out.println("\n");

        //PASSAR A MINÚSCULES UN STRING
        String o= "LOLAZO";
        String min=o.toLowerCase();
        System.out.println(o+ " EN MINÚSCULES ÉS: "+min);
        System.out.println("\n");

        //PRIMERA OCURRÈNCIA D'UN TEXT
        String m="analfabet";
        int p1 = m.indexOf("fa");
        System.out.println("LES LLETRES FA A ES TROBEN A LA POSICIÓ "+p1+" DE "+m);
        System.out.println("\n");

        //DARRERA OCURRÈNCIA D'UN TEXT
        int p2 = m.lastIndexOf('a');
        System.out.println("LA DARRERA A ES TROBA A LA POSICIÓ "+p2+" DE "+m);
        System.out.println("\n");

        //TROS STRING A PARTIR D'UNA POSICIÓ
        String tros1 = m.substring(2);
        System.out.println(tros1);
        System.out.println("\n");

        //TROS STRING ENTRE 2 POSICIONS, DARRERA NO INCLOSA
        String tros2 = m.substring(4,6);
        System.out.println(tros2);
        System.out.println("\n");

        //AGAFAR TROSSOS ENTRE ESPAIS EN BLANC
        String nomComplet= "Júlia Valbuena Villalonga";
        String nom = " ";
        String llinatge1 = " ";
        String llinatge2 = " ";
        int e1= nomComplet.indexOf(" ");
        int e2= nomComplet.lastIndexOf(" ");
        nom = nomComplet.substring(0,e1);
        llinatge1 = nomComplet.substring(e1+1,e2);
        llinatge2 = nomComplet.substring(e2+1);
        System.out.println(llinatge1+" "+llinatge2+", "+nom);
        System.out.println("\n");

        //COMPTAR PARAULES
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris imperdiet rutrum dolor. Sed nulla massa, tincidunt et vehicula a, dictum vehicula velit. Ut id est molestie, venenatis neque eu, imperdiet elit. Mauris nec quam non purus feugiat finibus. Integer et libero ipsum. Vivamus sed nisl nec velit finibus sagittis eu.";
        int nump = 1;
        while(text.indexOf(" ")!=-1){
            nump++;
            text=text.substring(text.indexOf(" ")+1);
        }
        System.out.println("AQUEST TEXT TÉ "+nump+" PARAULES");
        System.out.println("\n");

        //INTERCANVIA LLETRES O CHAR D'UN TEXT PER ALTERS
        String lol = "SIIIIIIIX SEVEEEEENNNNNN";
        String lolazo = lol.replace('E','I');
        System.out.println(lolazo);
        System.out.println("\n");


        //CONCATANA STRINGS
        String sis = "SIIIIIIIX";
        String set = "SEEEEVEEEEENNN";
        String sisset = sis.concat(set);
        System.out.println(sisset);
        System.out.println("\n");

    }
}
