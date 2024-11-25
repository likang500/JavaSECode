import java.util.Comparator;

/**
 * ClassName: Student
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/7 14:39
 * @Version 1.0
 */
public class Student2 implements Comparator {
    private int score;
    private String name;

    public Student2(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public Student2() {
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
    public int compare(Object o1, Object o2) {
        Student2 student1 = (Student2) o1;
        Student2 student2 = (Student2) o2;
        return student1.getScore() - student2.getScore();
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
