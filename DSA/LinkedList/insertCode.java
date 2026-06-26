package DSA.LinkedList;

public class insertCode {
    private Node head;
    private Node tail;
    private int size;

    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
    }

    public insertCode(){
        this.size = 0;
    }

    public void insertFirstNode(int data){
        Node node = new Node(data);
        node.next=head;
        head = node;
        if(tail==null){
            tail = node;
        }
        size++;
    }

    public void insertLLastNode(int data){
        Node node = new Node(data);
        if(tail==null){
            insertFirstNode(data);
            return;
        }
        tail.next=node;
        tail = node;
        
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        insertCode list = new insertCode();
        list.insertFirstNode(23);
        list.insertFirstNode(45);
        list.insertFirstNode(34);
        list.insertFirstNode(89);
        list.insertFirstNode(98);
        list.insertLLastNode(100);
        list.display();
    }
    
}
