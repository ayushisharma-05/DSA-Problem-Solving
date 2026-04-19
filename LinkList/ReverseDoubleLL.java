class Node {
    int data ;
    Node next;
    Node back;

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
class ReverseDoubleLL{
    Node head;
    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next= newNode;
        newNode.back = temp;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null \n");
    }
    void reverse(){
        Node temp = null;
        Node current = head;

    while (current != null) {
        temp = current.back;
        current.back = current.next;
        current.next = temp;
        current = current.back;
    }
    if (temp != null) {
        head = temp.back;
    }
    }
    public static void main(String[] args) {
        ReverseDoubleLL list = new ReverseDoubleLL();
        list.insert(100);
        list.insert(200);
        list.insert(1300);
        list.insert(1040);
        list.insert(1034);
        list.display();
        list.reverse();
        list.display();

    }
}