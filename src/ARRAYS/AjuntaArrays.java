package ARRAYS;

public class AjuntaArrays {
    public static void main(String[] args) {
        int[] a = {3, 6, 5, 4, 2};
        int[] b = {5,3,7};
        int []junta=joinArrays(a,b);
        printArray(junta);
    }

   public static int [] joinArrays(int []a, int []b){
        int [] c= new int [a.length+b.length];
        for (int i=0; i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0; i<b.length; i++){
            c[a.length+i]=b[i];
        }
        return c;
    }
    public static void printArray (int[]array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }
}
