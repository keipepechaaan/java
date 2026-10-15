public class Score2 {
    public static void main(String argv[]){
       int score = 3;
       switch(score){
           case 1: //もう少し頑張りましょう
           case 2:
                System.out.println("もう少し頑張りましょう");
                break;
           case 3: //合格
           case 4: //合格
           case 5:
                System.out.println("合格です");
                break;
           default:
                System.out.println("1～5の範囲で入力してください");

        }
        System.out.println("switch文の外に出ました");
    }
}
