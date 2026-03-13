package treballs;

public class ProbabilitatDau {
    public static void main(String[] args) {
        float[][] resultats = new float[6][3];
        calculPobabilitat(resultats, 0, 100);
        calculPobabilitat(resultats, 1, 1000);
        calculPobabilitat(resultats, 2, 1000000);
        imprimirArray(resultats,0,100);
        System.out.println();
        imprimirArray(resultats,1,1000);
        System.out.println();
        imprimirArray(resultats,2,1000000);
    }

    public static float[][] calculPobabilitat(float[][] a, int columna, int tirades) {
        int[] picsCadaNum = new int[6];
        for (int i = 0; i < tirades; i++) {
            int tirada = (int) (1 + Math.floor(Math.random() * 6));
            picsCadaNum[tirada - 1]++;
        }
        for (int x = 0; x < 6; x++) {
            a[x][columna] = (float) picsCadaNum[x] / tirades;
        }
        return a;
    }

    public static void imprimirArray(float[][] b, int columna, int tirades) {
        for (int x = 0; x < b.length; x++) {
            System.out.println("El nombre "+(x+1)+" fent "+tirades+ " tirades té una probabilitat de sortir de: "+b[x][columna] + ";");
        }

    }
}

