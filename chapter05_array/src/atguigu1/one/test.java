package atguigu1.one;

/**
 * ClassName: test
 * Package: atguigu1.one
 * Description:
 *
 * @Author LiKang
 * @Create 2024/7/25 2:13
 * @Version 1.0
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
}
class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        int size=0;
        head = new ListNode(0);//包含虚拟头节点
    }

    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        ListNode current = head;
        for(int i=0;i<=index;i++){
            current = current.next;
        }
        return current.val;
    }
    public void addAtHead(int val) {
        addAtIndex(0,val);
        /*
        ListNode newNode = new ListNode(val);
        if(head.next!=null){
            newNode.next = head.next;
            head.next = newNode;
        }else{
            head.next = newNode;
        }
        size++;*/
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
        /*
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        size++;
         */
    }

    public void addAtIndex(int index, int val) {
        if(index<0||index>size)
            return ;
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        ListNode pre = head;
        int i=0;
        while(i<=index){
            pre = current;
            if(current.next!=null){
                current = current.next;
            }
            i++;
        }
        newNode.next =current;
        pre.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0||index>=size)
            return ;
        ListNode current = head;
        ListNode pre = head;
        for(int i=0;i<=index;i++){
            pre = current;
            if(current.next!=null){
                current = current.next;
            }
        }
        if(current.next==null){
            pre.next=null;
        }else{
            pre.next=current.next;
            current.next=null;
        }
        size--;
    }
    /*
    public static  void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(10);
        myLinkedList.addAtTail(20);
        myLinkedList.addAtIndex(0,1);
        myLinkedList.addAtIndex(1,2);
        myLinkedList.addAtIndex(4,30);
        myLinkedList.deleteAtIndex(4);

        int ans;
        for(int i=0;i< myLinkedList.size;i++){
            ans = myLinkedList.get(i);
            System.out.println(ans);
        }

    }*/
}

