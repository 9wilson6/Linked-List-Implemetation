
package LinkedListImplemetation;

public class LinkedListRunner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.insert(i);
        }
       
        list.insertAtStart(20);
        list.insertAt(10, 12);
        list.deleteAt(2);
        list.show();

    }

}
