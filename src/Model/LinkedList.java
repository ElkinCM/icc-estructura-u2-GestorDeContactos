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

     public void deleteByValue(T value) {
    if (head == null) {
        return;
    }
    if (value instanceof Contact) {
        Contact buscado = (Contact) value;

        if (((Contact) head.getValue()).getName().equals(buscado.getName())) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            Contact siguiente = (Contact) current.getNext().getValue();
            if (siguiente.getName().equals(buscado.getName())) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    } else {
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
}


     public T findByValue(T value) {
    if (head == null) {
        return null;
    }
    Node<T> current = head;
    while (current != null) {
        if (value instanceof Contact) {
            Contact buscado = (Contact) value;
            Contact actual = (Contact) current.getValue();
            if (buscado.getName().equals(actual.getName())) {
                return current.getValue();
            }
        } else {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
        }
        current = current.getNext();
    }
    return null;
}


    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Node <T> getHead() {
        return head;
    }
    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "LinkedList [size=" + size + ", head=" + head.toString() + "]";
    }
    
    
    
}
