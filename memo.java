class memo{
    public static void main(String[] args){
        // 画面の拡大 : command + shift + +(;れと同じところ)
        // 画面の縮小 : command + -(=ほと同じところ)

        //基本と型
            System.out.print("改行なしは print "); 
            System.out.println("改行ありは println");

            System.out.print("¥だと反応しない。option + ¥キーで\n");
            System.out.println("int : 整数10桁まで(4バイト)  long : 整数20桁まで (8バイト)");
            System.out.println("char : 文字１文字(2バイト)");
            System.out.println("float(4) ,double(8): 小数");
            System.out.println("boolean : true か false");
        // 小さい型から大きい型には変換ができる
            int a = 5;
            double b = (double)a; // b = 5.0
        // 大きい型から小さい型も変換できるが、小数部分が切り捨てられる。
            double c = 9.8;
            int d = (int)c; // b = 9

        // 論理演算
            // AND && はどちらも成立するときのみ
            // OR || はどちらか一つでも成立するとき
            // どちらも true false を返す

        /*  割り算は/ , あまりは %    7 % 3 - 1 */

        //intに文字を代入すると文字コードが表示
             int english = 'A';
            System.out.println(english); 

       /*キーボードからの入力を受け取る

            1.class...の前(一番上)に import java.util.Scanner; と書く
            2.Scanner in = new Scanner(System.in); でスキャナーを立ち上げる
            3.String s = in.next(); のように入力を受け付ける
                int型は int i = in.nextInt();
                doubleは double d = in.nextDouble; のように
                これでSystem.out.println(s);とすると入力した内容が出てくる
            4 入力してほしい回数だけ3を書いたらin.close(); でスキャナーを閉じる */ 


         // 配列
            // 型名 変数名[] = new 型名[配列の数];
            int[] x = new int[3]; //intの値３個分のメモリー領域をnewコマンドで取得、参照（アドレス)をxに代入
            for(int i = 0; i < x.length;i++){ // x.length でxの長さ(今回は3)を取得
            x[i] = i; } // これで x[0] = 0, x[1] = 1; x[2] = 2 となった
            // string も配列一つに21億文字まで入れられるよ

        // 2次元配列
            // 型名 変数名[][] = new 型名[行数][列数];
            int two_d[][] = new int [2][3]; //横２行　縦3行

            // 配列の各要素に行数と列数の合計値を入れるプログラム
            int m,n;
            for(m = 0; m < two_d.length;m++){   // ここでは m < two_d.length (行数2) だが、
                for(n = 0;n < two_d[m].length;n++){  // こっちでは n < two_d[m].length (列数3)
                    two_d[m][n] = m + n;
                    System.out.print(two_d[m][n] + " ");
                }
                System.out.println(); // m(行)が1増えるごとに改行
            }

            // ジャグ配列(各行の列数が不揃いな2次元配列)を作るプログラム
            int huzoroi[][] =  {{0,1},  // huzoroi[0][0] = 0, huzoroi[0][1] = 1
                                {2},    // huzoroi[1][0] = 2 (2行目は要素が一つだけ)
                                {3,4,5,6}}; //huzoroi[2][0] = 3, ...huzoroi[2][3] = 6




        //拡張for文
             for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
            }
            //これを拡張for文に変換

            for (int i :x){
            System.out.println(i); //ループするたびに、int型配列のｘの値を１つずつ変数iに代入
            }
            //配列の読み出しには使えるが、配列の代入には使えない

        // switch 文
            int swi = 1;
            switch(swi){
                case 1: // swi = 1 のとき (コロン)
                    System.out.println("1です");
                    break; // breakでswitch文から抜ける

                case 2: // swi = 2 のとき (コロン)
                    System.out.println("エラー");
                    break; // break抜け

                default: // どのcaseにも当てはまらないとき
                    System.out.println("どのcaseにも当てはまらないとき");
                    break; // break抜け
            }

            
        // while を使った無限ループ
                while(true){  // break しない限り繰り返す
                    int whi = (int)(Math.random() * 3) + 1; // 1~3 の整数
                    System.out.println(whi);
                    if(whi == 3){
                        break;   // whi が 3 だったら無限ループから抜ける
                    }
                }


        //乱数
         // 1 Math.random() を使う
            double ran = Math.random(); // 0.0以上1.0未満の乱数 double型
            int ran_int = (int)Math.random(); // intに型変換する場合 
            int ran_dice = (int)(Math.random()*6) + 1; // 1 から 6までの整数。Math.dandom()*6が0.0~6.0未満

         // 2 java.util.Random を使う
            /*  冒頭に import java.util.Random;
                int ran = random.nexrInt(10)  0 から 9 まで
                double d = random.nextDouble(); 0.0 以上 1.0 未満 */

        // インスタンスの生成 ( インスタンス : クラスからオブジェクトを作ること)
            // クラス名　変数名 = new クラス名();
            // 例　String s = new String("文字列");
    
        // フィールド ( クラスの中で宣言された変数のこと)
            // クラスの中で宣言された変数は、クラス内のどこからでも使える
            // 変数名.フィールド名 = 値;  初期値を代入できる

        // メソッド ( クラスの中で宣言された関数のこと)
            /*戻り値と引数があるメゾット
                戻り値の型 メゾット名(引数の型 引数名){
                処理
                return 戻り値
                }

            戻り値がないメゾット
                void メゾット名(引数の型 引数名){
                処理
                } */

}       

