import javax.swing.*;

/*
研究生类
 */
public class Graduate extends Student {
    //导师的名字
    private String tutor;

    public Graduate(String id, String name, String sex, int age, String tutor) {
        super(id, name, sex, age);
        this.tutor = tutor;
    }

    /*
    总成绩乘以0.9
     */
    @Override
    public double computerTotalScore() {
        return super.computerTotalScore() * 0.9;
    }

    /*
    平均成绩乘以0.9
     */
    @Override
    public double computerAveScore() {
        return super.computerAveScore() * 0.9;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                super.toString()
                + computerAveScore()
                + computerAveScore()
                +"}";
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
}
