/**
 * ClassName: interface_compareable
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/7 14:42
 * @Version 1.0
 */
public class interface_compareable {
    public static void main(String[] args){
        Student[] students = new Student[3];
        Student student1 = new Student(90,"lk123");
        Student student2 = new Student(92,"lks3");
        Student student3 = new Student(91,"lk221");
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        for(int i=0;i<students.length-1;i++){
            for (int j=0;j<students.length-1-i;j++){
                if(students[j].compareTo(students[j+1])>0){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] =temp;
                }
            }
        }
        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

    }
}
