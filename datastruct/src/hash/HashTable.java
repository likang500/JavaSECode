package hash;

import java.util.Scanner;

/**
 * ClassName: HashTable
 * Package: hash
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/26 9:30
 * @Version 1.0
 */
public class HashTable {
    public static void main(String[] args) {
    HashTab hashTab = new HashTab(7);
    String key = "";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("add: 添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("exit: 退出系统");
            key = scanner.next();
            switch (key){
                case "add":
                    System.out.println("输入id");
                    int id =  scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();
                    Emp emp = new Emp(id,name);
                    hashTab.add(emp);
                case "list":
                    hashTab.list();
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}

//创建hashtab 管理多条链表
class HashTab{
    private EmpLinkedList[] empLinkedListArry;
    public int size;
    public  HashTab(int size){
        this.size = size;
        empLinkedListArry = new EmpLinkedList[size];
        for (int i = 0; i < size; i++) {
            empLinkedListArry[i] = new EmpLinkedList();
        }
    }
    public void add(Emp emp){
        //根据员工id，得到员工应当添加到哪条链表
        int emLinkedList_0  = hashFun(emp.id);
        empLinkedListArry[emLinkedList_0].add(emp);
    }
    public void list(){
        for (int i = 0; i < size; i++) {
            empLinkedListArry[i].list(i);
        }
    }
    //散列函数，取模法
    public int hashFun(int id){
        return id % size;
    }
}

class Emp{
    public int id;
    public  String name;
    public Emp next;
    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmpLinkedList{
    private  Emp head;
    public void add(Emp emp){//增加结点
         if(head == null){
             head = emp;
             return;
         }
         Emp curEmp = head;
         while (true){
             if(curEmp.next == null){
                 break;
             }
             curEmp = curEmp.next;
         }
         curEmp.next = emp;
    }
    public void list(int no){//遍历
        if(head ==null){
            System.out.println("第"+ no +"链表为空");
            return;
        }
        Emp curEmp = head;
        System.out.printf("第"+ no +"链表为");
        while (true){

            System.out.printf(String.format("=>> id=%d name=%s",curEmp.id,curEmp.name));
            if(curEmp.next == null){
                System.out.println();
                break;
            }
            curEmp = curEmp.next;
        }
    }
}
