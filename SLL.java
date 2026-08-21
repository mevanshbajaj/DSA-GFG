class SLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int size;
    SLL(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    public Node insertFirst(Node head , int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
        return head;
    }
}