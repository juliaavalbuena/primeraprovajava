public class provesExamen {
   public static void main (String []args){
       for (int i =0; i<100; i++){
           int tirada = (int) (1 + Math.floor(Math.random() * 6));
           System.out.println(i+" , "+tirada);
       }
   }
}
