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
    public Node insertAtFront(Node head, int x) {
        // code here
        Node newnode = new Node(x);
            newnode.next = head;
            head = newnode;
        return head;
    }
}