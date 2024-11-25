package atguigu1.one;

import java.util.Scanner;

/**
 * ClassName: OneArrayExer
 * Package: atguigu1.one
 * Description:案例：学生考试等级划分
 *
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 	成绩>=最高分-10    等级为’A’
 * 	成绩>=最高分-20    等级为’B’
 * 	成绩>=最高分-30    等级为’C’
 * 	其余              等级为’D’
 *
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 *
 * @Author LiKang
 * @Create 2024/7/22 15:37
 * @Version 1.0
 */
public class OneArrayExer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num = scanner.nextInt();
        int[] scores = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的分数：");
            scores[i] = scanner.nextInt();
        }
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>=maxScore-10){
                System.out.println("第" + (i+1) + "个同学的分数等级为A");
            } else if (scores[i]>=maxScore-20) {
                System.out.println("第" + (i+1) + "个同学的分数等级为B");
            } else if (scores[i]>=maxScore-30) {
                System.out.println("第" + (i+1) + "个同学的分数等级为C");
            }else {
                System.out.println("第" + (i+1) + "个同学的分数等级为D");
            }
        }
    }
}
