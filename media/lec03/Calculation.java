public class Calculation {
    public static void main(String[] args){
        int ans1 = 0, ans2 = 0, ans3 = 0;

        for(int i = 1;i <=100; i++){
            if(i % 2 ==0)
                ans1 += i;

            if((i % 2 == 0 || i % 3 == 0) && i % 12 !=0){
                ans2 += i;
            } 
        }

        System.out.println("ans1 = " +ans1);
        System.out.println("ans2 = " +ans2);
        
        for (int x = -10; x <= 10; x ++){
            ans3 = x*x - 2 * x + 1;
            System.out.println("x = " + x + ", ans3 = " + ans3);
        }
    
        
    }
    
}
