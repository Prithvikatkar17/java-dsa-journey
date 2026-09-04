

public class linked_list {
    public class Node {
        int data ;
        Node next ;
        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public Node head ;
    public Node tail ;

    public void addFirst(int data){
        Node newNode = new Node(data) ;
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;
    }
    public void addLast(int data){
        Node newNode = new Node(data) ;
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        tail.next = newNode ;
        tail = newNode ;
    }
    public void print(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "->") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }
    public static void main(String[] args) {
        linked_list ll = new linked_list() ;
        ll.addLast(10) ;
        ll.addLast(20) ;
        ll.addLast(30) ;
        ll.print() ;
    }
}
