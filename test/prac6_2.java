public class prac6_2 {
    static void main(String[] args){
        Calc c = new Calc();
        double r = 5.0;
        System.out.println(c.circle(r));
    }    
}


class Calc {
   double circle(double r){
    return (3.14 * r * r);
   }
}