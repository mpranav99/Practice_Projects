import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LinkedListPalindrome {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public boolean isPalindrome(){
        Node temp = head;
        boolean check = false;
        Stack<Integer> stack  = new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next ;
        }

        while(head!=null){
            int i = stack.pop();
            if(head.data == i){
                check = true;
            }
            else{
                check = false;
                break;
            }
            head = head.next;
        }
        return check;
    }

    public void checkDuplicate(){
        Node temp = head;
        Node x = null;
        Set<Integer> set = new HashSet<>();
        while(temp!=null){
            int val = temp.data;
            if(set.contains(val)){
                x.next = temp.next;
            }else{
                set.add(val);
                x = temp;
            }
            temp = temp.next;


        }
    }

    public void printNodes(){
        while(head!=null){
            System.out.println(head.data);
            head= head.next;
        }
    }

        public static void main(String[] args) {
         LinkedListPalindrome list = new LinkedListPalindrome();
         list.head = new Node(12);
         Node node2 = new Node(12);
         Node node3 = new Node(12);
         Node node4 = new Node(12);
         Node node5 = new Node(3);
         Node node6 = new Node(2);
         Node node7 = new Node(1);
         list.head.next = node2;
         node2.next = node3;
         node3.next = node4;
         node4.next = node5;
         node5.next= node6;
         node6.next = node7;
//         boolean check = list.isPalindrome();
//         System.out.println(check);
            list.checkDuplicate();
            list.printNodes();
        }

}
