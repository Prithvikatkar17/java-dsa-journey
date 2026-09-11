

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
    public static int size ;

    public void addFirst(int data){
        size++ ;
        Node newNode = new Node(data) ;
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;
    }
    public void addLast(int data){
        size++ ;
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
    public void add(int index, int data){
        size++ ;
        if(index == 0){
            addFirst(data) ;
            return ;
        }
        Node newNode = new Node(data) ;
        Node temp = head ;
        for(int i=0; i<index-1; i++){
            temp = temp.next ;
        }
        newNode.next = temp.next ;
        temp.next = newNode ;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE ;
        }else if(size == 1){
            size --;
            int var = head.data ;
            head = tail = null ;
            size = 0 ;
            return  var ;

        }else {
            int val = head.data ;
            size -- ;
            head = head.next ;
            return  val ;
        }
    }
    public  int removeLast(){
        if(size == 0 ){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE ;            
        }else if(size == 1){
            int var1 = tail.data ;
            head = tail = null ;
            return var1 ;
        }
        Node prev = head ;
        for(int i=0; i<size-2; i++){
            prev = prev.next ;
        }   
        int var2 = tail.data ;  
        tail = prev ;
        tail.next = null ;
        return var2 ;
    }
    public static void main(String[] args) {
        linked_list ll = new linked_list() ;
        ll.addLast(10) ;
        ll.addLast(20) ;
        ll.addLast(30) ;
        ll.add(1, 15) ;
        ll.print() ;
        System.out.println(ll.size) ;
        ll.removeFirst() ;
        ll.print();
        ll.removeLast() ;
        ll.print();
    }
}
