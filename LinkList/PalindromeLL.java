
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class PalindromeLL {
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
    Boolean Palindrome(Node head){
        if(head == null) return true;
        Node temp = head;
        int arr[] = new int [100];
        int i = 0;
        while(temp!= null){
            arr[i++] = temp.data;
            temp = temp.next;
        }
        for(int j = 0 ; j < i/2 ; j++){
            if(arr[j] != arr[i-j-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeLL list = new PalindromeLL();
        list.insert(0);
        list.insert(2);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(0);

        list.display();
        System.out.println(list.Palindrome(list.head));
    }
    
}
