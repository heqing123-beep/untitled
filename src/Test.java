public class Test {
    float pai = (float) 3.14;

    void yuan(float r) {
        System.out.println("圆的面积:" + r * r * pai);
    }

    void zhengFangXing(float bianChang) {
        System.out.println("正方形的面积:" + bianChang * bianChang);
    }

    void changFangXing(float chang, float kuan) {
        System.out.println("长方形的面积:" + chang * kuan);
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        MianJi mianJi = new MianJi();
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入圆的半径:");
        float r = sc.nextFloat();
        mianJi.yuan(r);

        System.out.print("请输入正方形的边长:");
        mianJi.zhengFangXing(sc.nextFloat());

        System.out.print("请输入长方形的长:");
        float chang = sc.nextFloat();
        System.out.print("请输入长方形的宽:");
        float kuan = sc.nextFloat();
        mianJi.changFangXing(chang, kuan);

    }
}

