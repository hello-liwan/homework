import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        /*
        实验5
        Student student = new Student();
        student.id = "001";
        student.name = "李万";
        student.sex = "男";
        student.age = 20;
        student.ComputerScore = 100;
        student.MathScore = 99;
        student.EnglishScore = 98;
        System.out.println(student.toString());
        */

        /*
        实验6
  Student student = new Student("0001", "张三", "男", 19);
        Student s = new Student("0001", "zhangsan", "男", 19);
        s.setComputerScore(90);
        System.out.println(s.toString());
        */

        /*
        实验7
         */
        Undergraduate undergraduate = new Undergraduate("0001", "张三", "男", 20, "2121");
        Graduate graduate = new Graduate("1001", "李四", "女", 24, "王五");
        System.out.println(undergraduate.toString());
        System.out.println(graduate.toString());
    }
}
