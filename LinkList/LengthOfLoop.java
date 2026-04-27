import java.util.HashMap;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LengthOfLoop {
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

    int LengthOfLoopinLL(Node head){
        Node temp = head;
        int timer = 1 ;
        HashMap <Node , Integer > map = new HashMap<>();
        while(temp!= null){
            if (map.containsKey(temp)) {
                return timer - map.get(temp); // loop length
            }

            map.put(temp,1);
            timer ++;
            temp = temp.next;
        }   
        return 0 ;
    }
    public static void main(String[] args) {
    LengthOfLoop list1 = new LengthOfLoop();

        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);

        Node temp = list1.head;
        Node join = list1.head.next; 

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = join;

        System.out.print("List (partial due to loop): ");
        //list1.display();

        int len = list1.LengthOfLoopinLL(list1.head);
        System.out.println("Length of loop: " + len);
    }
}