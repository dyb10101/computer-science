package list.impl;

public class JieCheng {
    public static void main(String[] args) {
        try {
            int result = jc(0);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int jc(int i) throws Exception {
        if (i <= 0)
            throw new Exception("计算的数字不能小于或者等于0");
        if (i == 1)
            return 1;
        return i*(i-1);
    }
}
