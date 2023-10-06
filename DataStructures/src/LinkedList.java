import java.util.Stack;

public class LinkedList {

    Node head;
    Node left;

    static class Node {
        char data;
        Node next;

        Node(char d) {
            this.data = d;
            next = null;
        }
    }

//    public void push(){
//        Node new_node = new Node(5);
//        new_node.next = head;
//        head = new_node;
//    }
//
//    public void pushAfterGivenNode(Node prev_node, int data){
//        if(prev_node == null){
//            System.out.println("The given previous node cannot be null ");
//        }
//        Node new_node = new Node(data);
//        new_node.next = prev_node.next;
//        prev_node.next = new_node;
//    }
//
//    public void pushNodeAtTheLast(int data){
//        Node new_node = new Node(data);
//        if(head == null){
//            Node head_node = new Node(data);
//            return;
//        }
//        new_node.next=null;
//        Node last = head;
//        while(last.next != null){
//            last = last.next;
//        }
//
//        last.next = new_node;
//    }
//
//    public void delete(){
//        Node temp = head;
//        head = temp.next;
//
//    }
//
//    public void deleteGivenPosition(int key){
//        Node temp = head,prev = null;
//        if(temp != null && temp.data==key){
//            head = temp.next;
//        }
//        while(temp!=null && temp.data!=key){
//            prev = temp;
//            temp= temp.next;
//        }
//        if(temp == null){
//            return;
//        }
//        prev.next = temp.next;
//
//    }
//
//    public void deleteFromEnd(){
//        Node temp = head,prev=null;
//        while(temp.next != null){
//            prev = temp;
//            temp = temp.next;
//        }
//        prev.next = null;
//    }

//    public void isPalindrome(Node val){
//        Node temp = head,end=null;
//        while(temp!=null && temp.next==null){
//            end = temp;
//        }
//        if(head.data == end.data){
//            return true;
//        }
//    }

    boolean isPalindromeUtil(Node right)
    {
        left = head;


        // Stop recursion when right becomes null
        if (right == null)
            return true;
        System.out.println(right.data);
        // If sub-list is not palindrome then no need to
        // check for the current left and right, return
        // false
        boolean isp = isPalindromeUtil(right.next);
        if (isp == false)
            return false;
        System.out.println(isp);
        // Check values at current left and right
        System.out.println( right.data);
        System.out.println(left.data);
        boolean isp1 = (right.data == left.data);
        System.out.println(isp1);
        left = left.next;

        // Move left to next node;
        return isp1;
    }

//    public boolean isPalin(){
//        Node temp = head;
//        Stack<Integer> stack = new Stack<>();
//        while(temp != null){
//
//        }
//
//    }

    boolean isPalindrome(Node head)
    {
        boolean result = isPalindromeUtil(head);
        return result;
    }
    public void push(char new_data)
    {

        // Allocate the node and put in the data
        Node new_node = new Node(new_data);

        // Link the old list of the new one
        new_node.next = head;

        // Move the head to point to new node
        head = new_node;
    }

    public void printNodes(){
            Node n = head;
            while(n!= null){
                System.out.println(n.data);
                n = n.next;
            }
        }

        public static void main(String args[]){
            LinkedList list = new LinkedList();
            char[] str = { 'a', 'b', 'a', 'c', 'a', 'b', 'a' };
            for (int i = 0; i < 7; i++) {
                list.push(str[i]);
            }
            if (list.isPalindrome(list.head)) {
                System.out.println("Is Palindrome");
                System.out.println("");
            }
            else {
                System.out.println("Not Palindrome");
                System.out.println("");
            }
//            list.head = new Node(1);
//            Node node2 = new Node(2);
//            Node node3 = new Node(3);
//            list.head.next = node2;
//            node2.next = node3;
//            list.push();
//            list.pushAfterGivenNode(node2,10);
//            list.pushNodeAtTheLast(12);
//            list.delete();
////            list.delete();
//            list.deleteGivenPosition(10);
//            list.deleteFromEnd();
//            list.deleteFromEnd();
//            list.printNodes();
        }


}
