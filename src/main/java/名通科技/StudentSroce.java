package 名通科技;

import java.io.*;
import java.util.ArrayList;

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
//        int a = 1;
//        int b = 2;
//        int d[] = {a,b};
//        StudentSroce.swap(d,0,1);
//        System.out.println(d[0]+" "+d[1]);
        String path = "G:\\test\\test1.txt";
        String text = "测试项目test";
//        StudentSroce.writeFile(path,text);
//        StudentSroce.readFile2(path);
//        StudentSroce.writeFile3(path,text);
//        int num[] ={1,2,3,4,5,6,7};
//        StudentSroce.findTargetBynum(num,8);
        System.out.println(StudentSroce.updateStar(4));
    }

//    public static void readFile(String path) {
//        File file = new File(path);
//        if (!file.exists()) {
//            System.out.println("读取的文件为空，请重新输入");
//        }
//        try {
//            FileReader fileReader = new FileReader (file);
//            char [] buf = new char[1024];
//            int num = 0;
//            while((num = fileReader.read(buf))!=-1) {
//                System.out.println(new String(buf,0,num));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//
//        }
//    }
//
//    public static void writeFile(String path,String text){
//        File file = new File(path);
//
//        if(file.exists()){
//            System.out.println("文件已存在，请重新输入");
//        }else{
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            FileWriter writer = new FileWriter(file);
//            writer.write(text);
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void readFile(String path){
        File file = new File(path);
        if(!file.exists()){
            System.out.println("文件不存在，请重新输入文件名");
        }
        try {
            FileReader reader = new FileReader(file);
            char c[] = new char[1024];
            int num = 0;
            while((num = reader.read(c))!= - 1){
                System.out.println(new String(c,0,num));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void readFile2(String path){
        File file = new File(path);
        if(!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte b[] = new byte[1024];
            int num =0;
            while((num = inputStream.read(b))!=-1){
                System.out.println(new String(b,0,num));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile2(String path,String text){
        File file = new File(path);
        if (file.exists()){
            System.out.println("文件已存在，请重新输入文件夹");
            return;
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
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

    public static void writeFile3(String path,String text){
        File file = new File(path);
        try {
            file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            byte b[] = text.getBytes();
            outputStream.write(b);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<ArrayList> findTargetBynum(int []num,int demo){

        ArrayList<ArrayList> result = new ArrayList<>();
        int i = 0;
        int j = num.length-1;
        int sum = 0;
        while(i<j){
            sum = num[i]+num[j];
            if(sum>demo){
                j--;
            }else if(sum<demo){
                i++;
            }else {
                ArrayList list = new ArrayList();
                list.add(num[i]);
                list.add(num[j]);
                result.add(list);
                i++;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int updateStar(int num){
        if(num==1||num ==2){
            return num;
        }
        return updateStar(num-1)+updateStar(num-2);
    }

}