package Lesson_3.link;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        list.insertLast(15);
        list.insertLast(25);
        list.insertLast(35);

        list.printList();

        list.deleteFirst();
        list.deleteLast();

        System.out.println();
        list.printList();

        list.insertAfter(10, 0);
        System.out.println();
        list.printList();
    }
}
