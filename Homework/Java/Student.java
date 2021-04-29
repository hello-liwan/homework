import javax.print.DocFlavor;

public class Student {
   private String id;
   private String name;
   private String sex;
   private int age;
   private double ComputerScore;
   private double EnglishScore;
   private double MathScore;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, String sex, int age) {
        this(id, name);
        this.sex = sex;
        this.age = age;
    }

    /*
           三门课的总成绩
    */
   public double computerTotalScore(){
       return ComputerScore + EnglishScore + MathScore;
   }

   /*
   三门课的平均成绩
    */
    public double computerAveScore(){
        return (ComputerScore + EnglishScore + MathScore) / 3.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号='" + id + '\'' +
                ", 姓名='" + name + '\'' +
                ", 性别='" + sex + '\'' +
                ", 年龄='" + age + '\'' +
                ", 计算机成绩=" + ComputerScore +
                ", 英语成绩=" + EnglishScore +
                ", 数学成绩=" + MathScore +
                ", 总成绩=" + computerTotalScore() + '\'' +
                ",平均成绩=" + computerAveScore() + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getComputerScore() {
        return ComputerScore;
    }

    public void setComputerScore(double computerScore) {
        ComputerScore = computerScore;
    }

    public double getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(double englishScore) {
        EnglishScore = englishScore;
    }

    public double getMathScore() {
        return MathScore;
    }

    public void setMathScore(double mathScore) {
        MathScore = mathScore;
    }
}
