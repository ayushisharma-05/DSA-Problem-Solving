class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertionInLL {
    Node head;
    void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head ;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.err.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        InsertionInLL list = new InsertionInLL();
        list.insertAtFirst(100);
        list.insertAtEnd(10);
        list.insertAtFirst(200);
        list.display();
    }
}
