public class ins1{
    //フィールド
    int n = 10;
    String s = "field";
    //メソッド
    int add ( int a,int b){  // 引数 a , b を受け取ったら a + bを返す
        return a + b;
    }
    String add(String s){ // 引数 s を受け取ったらフィールドのsと結合して返す
        return this.s + s; // this.s は引数 s でなくフィールドのsを指す
    }
    void shouNum(){
        System.out.println("n = " + n);
    }
}

public class ins2{
    public static void main(String[] args){
        ins1 s = new ins1(); // ins1クラスのインスタンスを作る
        s.n = 100; // フィールド n に100を代入
        s.s = "Hello"; // フィールド s に Hello を代入
        int ans = s.add(1,2); // 引数 1 , 2 を addメソッドに渡して返り値を ans に代入
        String str = s.add(" World"); 
        System.out.println(ans);
        System.out.println(str);
        s.shouNum();
    }
}