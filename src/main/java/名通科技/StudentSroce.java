package 名通科技;

import java.io.*;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/24
 * Time:9:27
 */
public class StudentSroce {
    private int studentSroce;

    private static final int STUDENT_SROCE =0;
    public StudentSroce(int studentSroce){
        this.studentSroce = studentSroce;
    }
    public int getStudentSroce(int studentSroce){
        return studentSroce;
    }

    public static void swap(int a[],int i ,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;


    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int d[] = {a,b};
        StudentSroce.swap(d,0,1);
        System.out.println(d[0]+" "+d[1]);
    }

    public static void readFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("读取的文件为空，请重新输入");
        }
        try {
            FileReader fileReader = new FileReader (file);
            char [] buf = new char[1024];
            int num = 0;
            while((num = fileReader.read(buf))!=-1) {
                System.out.println(new String(buf,0,num));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void writeFile(String path,String text){
        File file = new File(path);

        if(file.exists()){
            System.out.println("文件已存在，请重新输入");
        }
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}