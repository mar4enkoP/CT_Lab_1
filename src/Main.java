import classes.File;

/**
 Основание исходной
 системы счисления, P1
 10
 Основание целевой системы
 счисления, P2
 2
 Разрядность в исходной
 системе счисления
 5
 */

public class Main {
    public static void main(String[] args) {
        new File();
        File.ReadNum();
        File num = new File();
        String number = num.getNum();
        int number_10 = Integer.parseInt(number);
        System.out.println("you have(10): " + number_10);
        String  number_2 = binar(number_10);
        System.out.println("convert to(2): " + number_2);
        num.setNum(number_2);
        File.WriteNum();

    }
    /**
     b(10) = 8
     b = 8 % 2 = 0
     b = 4 % 2 = 0
     b = 2 % 2 = 0
     b = 1 % 2 = 1
     b(2) = 1000
     */
    public static String binar(int n) {
        String res = "";
        int i = bitsInNumber(n);
        if(i++<5){
        int bit;
        while ( --i >= 0 ){
            bit = (n & (1 << i)) == 0 ? 0 : 1;
            res += bit;
        }}
        else res="bit depth>5";
        return res;
    }

    public static int bitsInNumber(int n) {
        int res = 0;
        while (n > 0) {
            n >>= 1;
            res++;
        }
        return res;
    }
}