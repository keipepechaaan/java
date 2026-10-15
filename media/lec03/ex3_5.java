public class ex3_5 {
    public static void main(String[] args){
        int a,b,c;

        a = 5;
        b = 6;
        c = 5;

        if(a > b && b > c){
            System.out.println("a > b > c");
        }
        if(a < b || a < c){
            System.out.println("a < b または a < c");
        }
        if (c > a && c > b){
            System.out.println("c > a かつ c > b");
        }
        if(c > b && b > a){
            System.out.println("c > b > a");
        }
        if(a == c && a != b){
            System.out.println("a == c かつ a != b");
        }
        if(a > b * 2 && a <= b * 3){
            System.out.println("a > b * 2 かつ a <= b * 3");
        }
      
        }
    }

