package baitap.ss10_dsa_danhsach.linkedlist;

public class MyLinkedList {
    private Node head;
    private int numNode = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private Node getNode(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public class Node{
        private Node next;
        public Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    public void add(int index, int element){
        Node temp = head;
        Node holder;

        for (int i=0; i < index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
//        Object data = new Object();

        temp.next = new Node(temp.getData());
        temp.next.next = holder;

        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}



