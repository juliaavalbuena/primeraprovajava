public class If {
    public static void main(String[] args) {
        int v = 100;
       if(v<=40){
           System.out.println("Velocitat insuficient.");
       }
        else if (v<=90) {
            System.out.println("Velocitat adequada.");
        }
       else if (v<=120) {
           System.out.println("Vigila.");
       }
        else{
            System.out.println("Velocitat excessiva.");
        }
    }
}
