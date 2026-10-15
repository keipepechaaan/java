public class Score {
    public static void main(String args[]){
        int i,a;
        for(i = 0;i < 10; i++){
            a = (int)(Math.random() * (100 + 1));
          if(a >= 80)  
            System.out.println(a + " A");

          else if(a >= 60)
            System.out.println(a + " B");

          else if(a >= 40)
            System.out.println(a + " C");

          else
            System.out.println(a + " D");

        }
    }
}