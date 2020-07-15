
package LinkedListImplemetation;

public class LinkedList {

    Node head;

    public void insert(int data) {
        //everytime this method is called it creates a new node.
        Node node = new Node();
        node.data = data;
        node.next = null;

        //check if this is the first node make it head if doesn't exists
        if (head == null) {
            head = node;
        } else {
            //go back to first node
            Node n = head;
            //traverse through the list to the last element
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    //travers between all nodes listing all elements
    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            //shift to the next node
            node = node.next;
        }
    }

    public void insertAtStart(int data) {
//create a new node at the start of the linked list
        Node node = new Node();
        node.data = data;
        //set next element to previouse head
        node.next = head;
        //make the new current node the head of the list
        head = node;
    }

//insert new node at some point within the linked list
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        if (index==0) {
            insertAtStart(data);
        }else{
         //reset pointer to head
        Node n = head;
        
        for (int i = 0; i < index - 1; i++) {
            //if the index value is greater than the list size
           if(n.next==null){
            break;
            }
            n = n.next;
            
        }
        node.next = n.next;
        n.next = node;
        }
       
    }
    //delete node at some point within the linked list
    
    public void deleteAt(int index){
        if (index==0) {
            head= head.next;
        }else{
        Node n = head;
        Node n1 =null;
        for(int i=0; i<index-1; i++){
        n=n.next;
        }
        n1=n.next;
        n1=n.next;
        n.next=n1.next;
        n1=null;

        }
    }
}
