package ARRAYS;

public class ZippearArrays {
    public static void main(String[] args) {
        int[] a = {6,6,6,6,6,6};
        int[] b = {7,7,7,7,7,7};
        int [] total=zipArray(a,b);
        printArray(total);
    }

    public static int[] zipArray(int[] aa, int[] bb) {
        int[] c = new int[aa.length+bb.length];
        int x = 0;
        int y=0;
        for (int i = 0; i < c.length; i++) {
            if (i%2==0){
               c[i]=aa[x];
               x++;
            }
           else{
               c[i]=bb[y];
               y++;
            }
        }
        return c;
    }
    public static void printArray (int[]array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }
}
