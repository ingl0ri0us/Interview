package Lesson_3.link;

public class DoubleLinkedList {

    private Item first;
    private Item last;

    public DoubleLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int dataToInsert) {
        Item newItem = new Item(dataToInsert);
        if (isEmpty()) {
            last = newItem;
        } else {
            first.previous = newItem;
        }
        newItem.next = first;
        first = newItem;
    }

    public void insertLast(int dataToInsert) {
        Item newItem = new Item(dataToInsert);
        if (isEmpty()) {
            first = newItem;
        } else {
            last.next = newItem;
            newItem.previous = last;
        }
        last = newItem;
    }

    public Item deleteFirst() {
        Item temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Item deleteLast() {
        Item temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int dataToInsert) {
        Item current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) return false;
        }

        Item newItem = new Item(dataToInsert);

        if (current == last) {
            newItem.next = null;
            last = newItem;
        } else {
            newItem.next = current.next;
            current.next.previous = newItem;
        }
        newItem.previous = current;
        current.next = newItem;
        return true;
    }

    public Item deleteByKey(int key) {
        Item current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) return null;
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void printList() {
        Item current = first;
        while (current != null) {
            current.displayItem();
            current = current.next;
        }
    }
}
