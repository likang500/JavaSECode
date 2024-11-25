/**
 * ClassName: Student
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/7 14:39
 * @Version 1.0
 */
public class Student implements Comparable{
    private int score;
    private String name;

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public Student() {
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        return this.score-s.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
