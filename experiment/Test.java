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
        Undergraduate undergraduate = new Undergraduate("0001", "张三", "男", 20, "2121");
        Graduate graduate = new Graduate("1001", "李四", "女", 24, "王五");
        System.out.println(undergraduate.toString());
        System.out.println(graduate.toString());
        */
         /*
         实验8
        Student undergraduate = new Undergraduate("0001","张三","男",21,"软件1171");
        Scan.setsocre(undergraduate);
        Student graduate = new Graduate("1001","李四","女",24,"王五");
        Scan.setsocre(graduate);
        Student[] student = new Student[]{undergraduate, graduate};
        for (Student temp : student) {
            if(temp instanceof Undergraduate){
                System.out.println("Undergraduatr：" + temp.toString());
            }else {
                System.out.println("Graduate:" + temp.toString());
            }
        }
        */

        /*实验8 编程题
        Shape[] shape = new Shape[9];
        for (int i = 0; i < 9; i++) {
            int j = (int)(Math.random() * 4) ;
            System.out.println(j);
            switch (j){
                case 0:
                    shape[i] = new Circle();
                    break;
                case 1:
                    shape[i] = new Oval();
                    break;
                case 2:
                    shape[i] = new Square();
                    break;
                case 3:
                    shape[i] = new Triangle();
                    break;
            }
        }
        for (Shape shape1 : shape) {
            shape1.Draw();
        }
        */
        /*实验9*/
        Exception.ArrayIndexOutOfBounds();
        Exception.Arithmetice();
        Exception.Circle();
    }
}
