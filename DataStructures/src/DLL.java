public class DLL {
    Node head;
    class Node{
        public int data;
        public Node prev;
        public Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void pushNode(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            new_node.prev = null;
            new_node.next=null;
        }else{
            new_node.next = head;
            head.prev = new_node;
            new_node.prev = null;
            head = new_node;
        }

    }

    public void insertAfterGivenNode(int data, Node prev_node){
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
            new_node.prev = null;
            new_node.next = null;
        }
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;
        if(new_node.next != null){
            new_node.next.prev = new_node;
        }

    }

    public void addNodeAtEnd(int data ){
        Node new_node = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev=temp;
        new_node.next = null;
    }

    public void addNodeBeforeGivenNode(int data, Node node){
        Node new_node = new Node(data);
        if(node.prev == null){
            new_node.next = node;
            node.prev = new_node;
            new_node.prev = null;
            new_node = head;
        }
        new_node.next= node;
        node.prev.next = new_node;
        new_node.prev = node.prev;
        node.prev = new_node;
    }

    public void deleteFromBegining(){
        head.next.prev = null;
        head.next = head;

    }

    public void deleteFromGivenPosition(int pos){
        Node temp = head;
        Node current  = null;
        while(temp!=null){
            if(temp.data == pos){
                current  = temp;
            }
            temp = temp.next;
        }
        if(current == head){
            head.next.prev = null;
            head = head.next;
        }
        if(current.prev != null){
            current.prev.next = current.next;
        }
        if(current.next != null){
            current.next.prev = current.prev;
        }
        current =null;
    }

    public void reverseDll(){
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        Node x = temp;
        while(x != null){
            System.out.println(x.data);
            x = x.prev;
        }
    }

    public static void main(String[] args)
    {
        // Create the doubly linked list:
        // 10<->8<->4<->2<->5
        DLL dll = new DLL();
        dll.pushNode(5);
        dll.pushNode(2);
        dll.pushNode(4);
        dll.pushNode(8);
        dll.pushNode(10);

//        while(dll.head != null){
//            System.out.println(dll.head.data);
//            dll.head = dll.head.next;
//        }
        dll.reverseDll();

    }




}
