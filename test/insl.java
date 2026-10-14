public class insl {
    public static void main(String[] args) {
        Minmax m = new Minmax(); // インスタンスを生成
        int a = 4,b = 2,c = 5;
        System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + m.max(a,b,c));
        System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + m.min(a,b,c));
    }
}

class Minmax {
    public int max(int n1,int n2,int n3){ // メゾット (関数)
        if (n1 > n2 && n1 > n3){
            return n1;
        }
        else if (n2 > n1 && n2 > n3){
            return n2;
        }
        return n3;
    }
    public int min(int n1,int n2,int n3){
        if (n1 < n2 && n1 < n3){
            return n1;
        }
        else if (n2 < n1 && n2 < n3){
            return n2;
        }
        return n3;
    }
}

