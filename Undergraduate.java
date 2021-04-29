/*
表示本科生
 */
public class Undergraduate extends Student{
    private String classID;

    public Undergraduate(String id, String name, String sex, int age, String classID) {
        super(id, name, sex, age);
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                super.toString()
                +"}";
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
}
