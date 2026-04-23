import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseLL {
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
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null \n");
    }
    void Reverse (Node head){
        Stack <Integer> st = new Stack <>();
        Node temp = head;
        while(temp!= null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp !=null){
            temp.data = st.pop();
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insert(0);
        list.insert(2);
        list.insert(1);

        list.display();
        list.Reverse(list.head);
        list.display();
    }
    
}
