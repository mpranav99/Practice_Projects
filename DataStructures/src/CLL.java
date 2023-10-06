public class CLL {
    Node last;

    class Node{
        public int data;
        public Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void addToEmpty(int data){

        if(last!=null){
            return ;
        }
        Node temp  = new Node(data);
        last = temp;
        temp.next = last;
    }

    public void addAtBeginning(int data){
        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
    }

    public void addAtLast(int data){
        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        last = temp;
    }

    public void addBetweenNodes(int data, int val){
        Node temp = last;
        while(temp.data != val){
            temp = temp.next;
        }
        Node new_node = new Node(data);
        new_node.next= temp.next;
        temp.next = new_node;
        if(temp == last){
            last = new_node;
        }



    }



}
