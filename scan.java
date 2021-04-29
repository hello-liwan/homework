import java.util.Scanner;

public  class scan {
    public static void setsocre(Student undergraduate){
        Scanner scanner = new Scanner(System.in);
        System.out.println(undergraduate.getName() + "的录入：");
        System.out.println("请输入计算机成绩：");
        undergraduate.setComputerScore(scanner.nextDouble());
        System.out.println("请输入英语成绩：");
        undergraduate.setEnglishScore(scanner.nextDouble());
        System.out.println("请输入数学成绩：");
        undergraduate.setMathScore(scanner.nextDouble());
    }
}
