import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception extends Throwable {
    public static void ArrayIndexOutOfBounds(){
        String[] strings = new String[]{"1", "2", "3"};
        try{
            for (int i = 0; i < strings.length + 1; i++) {
                System.out.printf(strings[i] + " ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n" + "数组越界:" + e.getMessage());
        }
    }

    public static void Arithmetice(){
        try{
            System.out.println(30 / 0);
        }catch (ArithmeticException e){
            System.out.println("分母为0" + e.getMessage());
        }
    }

    public static void Circle() {
        System.out.println("请输入圆的半径");
       double r = 0;
       boolean flag = true;
       do {
           Scanner scanner = new Scanner(System.in);
           try {
               r = scanner.nextDouble();
               flag = false;
           } catch (InputMismatchException e) {
               System.out.println("请输入正确的半径：");
           }
       }while(flag);
       System.out.println(Math.pow(r, 2) * Math.PI);
    }
}
