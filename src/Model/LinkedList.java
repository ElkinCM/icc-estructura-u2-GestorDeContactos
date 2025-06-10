package Model;

public class LinkedList <T> {
    private int size = 0;
    private Node<T> head;
    //private Node<T> Tail;
    
    public void appendToTail(T value){
        if (head == null){
            head = new Node<>(value);
            size++;
            return;
        } 

        Node<T> current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<>(value));
        size++;
     }

     public void print(){
        if (head == null) {
            System.out.println("END");
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println(current.getValue() + " -> END");
     }

     public void deleteByValue(T value){
        if (head == null){
            return;
        }

        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
            
        }
     }

     public void findByValue(T value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                System.out.println("Found: " + value);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Value not found: " + value);
    
     }
    
    
    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    
     
    
}
