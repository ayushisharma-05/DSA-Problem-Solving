class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Sort012LL {
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
    void Sortll (Node head){
        Node temp = head;
        int c0=0;
        int c1=0;
        int c2=0;

        while(temp!= null){
            if(temp.data == 0) c0++;
            if(temp.data == 1) c1++;
            if(temp.data == 2) c2++;
            temp = temp.next;
        }
        temp = head;
        while(temp !=null){
            for(int i = 0 ; i < c0 ; i++){
                temp.data= 0;
                temp = temp.next;
            }
            for(int i = 0 ; i < c1 ; i++){
                temp.data= 1;
                temp = temp.next;
            }
            for(int i = 0 ; i < c2 ; i++){
                temp.data= 2;
                temp = temp.next;
            }
        }

    }
    public static void main(String[] args) {
        Sort012LL list = new Sort012LL();
        list.insert(0);
        list.insert(2);
        list.insert(1);
        list.insert(0);
        list.insert(2);
        list.insert(1);
        list.insert(0);
        list.insert(2);
        list.insert(1);
        list.insert(0);

        list.display();
        list.Sortll(list.head);
        list.display();
    }
    
}
