package ss10_array_list.thuc_hanh.trien_khai_lop_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(4);
        myLinkedList.add(4,9);
        myLinkedList.add(2,10);
        myLinkedList.printList();


    }
}
