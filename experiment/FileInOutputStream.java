import java.io.*;
import java.util.Currency;
import java.util.Scanner;

public class FileInOutputStream {
    public static void copyStream() throws IOException {
        FileInputStream in = new FileInputStream("temp/a.txt");
        FileOutputStream out = new FileOutputStream("temp/b.txt");
        int c;
        int count = 0;
        long start = System.currentTimeMillis();
        while ((c = in.read()) != -1) {
            out.write(c);
            if(c == 'A'){
                count++;
            }
        }
        in.close();
        out.close();
        long end = System.currentTimeMillis();
        System.out.println("共有" + count + "个" + "用时" + (end - start) );
    }

    public static void copyRead() throws IOException {
        FileReader in = new FileReader("temp/a.txt");
        FileWriter out = new FileWriter("temp/b.txt", true);
        int c;
        int count = 0;
        long start = System.currentTimeMillis();
        while ((c = in.read()) != -1) {
            out.write(c);
            if(c == 'A'){
                count++;
            }
        }
        in.close();
        out.close();
        long end = System.currentTimeMillis();
        System.out.println("共有" + count + "个" + "用时" + (end - start) );
    }

    public static void buffCopyStream() throws IOException {
        FileInputStream in = new FileInputStream("temp/a.txt");
        BufferedInputStream bin = new BufferedInputStream(in);
        byte[] bytes = new byte[1024];
        int c;
        int count = 0;
        long start = System.currentTimeMillis();
        while ((c = bin.read(bytes)) != -1) {
            for (int i = 0; i < c; i++) {
                if(bytes[i] == 'A'){
                    count++;
                }
            }
        }
        bin.close();
        long end = System.currentTimeMillis();
        System.out.println("共有" + count + "个" + "用时" + (end - start) );
    }

    public static void buffCopyRead() throws IOException {
        FileReader in = new FileReader("temp/a.txt");
        BufferedReader bin = new BufferedReader(in);
        String s;
        int count = 0;
        long start = System.currentTimeMillis();
        while ((s = bin.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'A'){
                    count++;
                }
            }
        }
        bin.close();
        long end = System.currentTimeMillis();
        System.out.println("共有" + count + "个" + "用时" + (end - start) );
    }

    public static void studnetInformation() throws IOException{
        FileWriter out = new FileWriter("temp/学生信息.txt");
        BufferedWriter bout = new BufferedWriter(out);
        bout.write("ID\t姓名\t性别\t年龄\t计算机成绩\t数学成绩\t英语成绩\n");
        Scanner scanner = new Scanner(System.in);
        String ID, Name, Sex, Age;
        double ComputerScore, MathScore, EngelisScore;
        int flag = 0;
        do {
            System.out.printf("请输入学生ID：");
            ID = scanner.next();
            System.out.printf("请输入学生姓名：");
            Name = scanner.next();
            System.out.printf("请输入学生性别：");
            Sex = scanner.next();
            System.out.printf("请输入学生年龄：");
            Age = scanner.next();
            System.out.printf("请输入学生计算机成绩：");
            ComputerScore = scanner.nextDouble();
            System.out.printf("请输入学生数学参加：");
            MathScore = scanner.nextDouble();
            System.out.printf("请输入学生英语成绩：");
            EngelisScore = scanner.nextDouble();
            if(ID == null){
                break;
            }
            bout.write(ID + "\t");
            bout.write(Name + "\t");
            bout.write(Sex + "\t");
            bout.write(Age + "\t");
            bout.write(ComputerScore + "\t");
            bout.write(MathScore + "\t");
            bout.write(EngelisScore + "\n");
            System.out.printf("是否继续录入（Y/N）：");
            String temp = scanner.next();
            if(temp.equals("Y")){
                flag = 1;
            }else {
                flag = 0;
            }
        } while (flag == 1);
        bout.close();
        FileReader in = new FileReader("temp/学生信息.txt");
        BufferedReader bin = new BufferedReader(in);
        String s;
        while ((s = bin.readLine()) != null) {
            System.out.println(s);
        }
        bin.close();
    }

    public static void nineNine() throws IOException{
        FileWriter out = new FileWriter("temp/99乘法表.txt");
        BufferedWriter bout = new BufferedWriter(out);
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                bout.write(j + "×" + i + "=" + i*j + "\t");
            }
            bout.write("\n");
        }
        bout.close();
    }
}
