
public class JSample8_1_1 {

    public static void main(String[] args) {
        int eigo=78;
        int suugaku=90;
        int kokugo=68;

        check("英语",eigo);
        check("数学",suugaku);
        check("国语",kokugo);
    }
    private static void check(String kyoka,int seiseki) {
        System.out.print(kyoka +"实验结果");
        if(seiseki>80) {
            System.out.println("合格");
        }else {
            System.out.println("不合格");

        }
    }

}
