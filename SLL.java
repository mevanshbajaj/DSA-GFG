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

    public Node insertAtEnd(Node head, int x) { // without tail
        // code here
        Node newnode = new Node(x);
        if(head == null){
            head = newnode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }
    public void insertatpos(Node head, int pos, int x) {
        // code here
        if(pos == 1){
            insertAtFront(head, x);
            return;
        }
        if(pos == size+1) {
            insertAtEnd(head, x);
            return;
        }
        Node newnode = new Node(x);
        Node temp = head;
        for(int i = 1; i < pos-1; i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
}