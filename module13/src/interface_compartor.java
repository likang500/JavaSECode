/**
 * ClassName: interface_compartor
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/7 14:56
 * @Version 1.0
 */
public class interface_compartor {
    public static void main(String[] args){
        Student2[] students = new Student2[3];
        Student2 student1 = new Student2(90,"lk123");
        Student2 student2 = new Student2(92,"lks3");
        Student2 student3 = new Student2(91,"lk221");
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Student2 student = new Student2();

        for(int i=0;i<students.length-1;i++){
            for (int j=0;j<students.length-1-i;j++){
                if(student.compare(students[j],students[j+1])>0){
                    Student2 temp = students[j];
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
