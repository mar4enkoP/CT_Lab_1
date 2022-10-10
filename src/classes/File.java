package classes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class File {
    private static String num = "";
    /**
     *  read input.txt
     */
    public static void ReadNum() {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\march\\OneDrive\\Intellij\\CT_Lab_1\\src\\File\\input.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                num = num + String.valueOf((char) i);
            }
            System.out.println("Done reading!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /** create output.txt
    *   and write
    */
    public static void WriteNum() {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\march\\OneDrive\\Intellij\\CT_Lab_1\\src\\File\\output.txt");
            byte[] b = num.getBytes();

            fout.write(b);
            fout.close();

            System.out.println("Done writing!!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}

