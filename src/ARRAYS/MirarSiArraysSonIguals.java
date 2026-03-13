package ARRAYS;

public class MirarSiArraysSonIguals {
    public static void main(String []args){
        int [] a = {3,6,5,4,2};
        int [] b= {3,6,5,4,2};
        System.out.println(sameArray(a,b));
    }
    public static boolean sameArray(int []a,int[]b){
        if (a.length != b.length){
            return false;
        }
        else{
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                return false;
                }
            }
            return true;
        }
    }
}
