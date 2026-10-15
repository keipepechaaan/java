public class ex3_2 {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        int c = (a > b) ? a : b;
        System.out.println(c);

        int d = (a > b * 2) ? a + 1 : b - 3;
        System.out.println(d);

        int x = -5;
        int y = (x > 0) ? x : -x;
        System.out.println(y);
    }
    
}
