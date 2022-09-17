package MVC.model;

public class Student extends Person{
    private String className;
    private double score;

    public Student(String id, String name, String birthDay, String gender, String className, double score) {
        super(id, name, birthDay, gender);
        this.className = className;
        this.score = score;
    }


    public Student() {
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
