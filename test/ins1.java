public class ins1{
    //フィールド クラスの中で宣言される変数のこと
    int n = 10;
    String s = "field";
    //メソッド 関数のこと
    int add ( int a,int b){  // 引数 a , b を受け取ったら a + bを返す
        return a + b;
    }
    String add(String s){ // 引数 s を受け取ったらフィールドのsと結合して返す javaでは名前が同じフィールドが複数あって良い
        return this.s + s; // this.s は引数 s でなくフィールドのsを指す
    }
    void shouNum(){
        System.out.println("n = " + n);
    }
}

public class ins2{ // main関数
    public static void main(String[] args){

        ins1 instance = new ins1(); // ins1クラスのインスタンスを作る

        instance.n = 100; // フィールドの n に100を代入
        instance.s = "Hello"; // フィールドの s に Hello を代入

        int ans = instance.add(1,2); // 引数 1 , 2 を addメソッドに渡して返り値を ans に代入
        String str = instance.add(" World"); 
        System.out.println(ans);
        System.out.println(str);
        instance.shouNum();
    }
}