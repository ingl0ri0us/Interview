package Lesson_3.link;

public class Item {

    public int data;
    public Item next;
    public Item previous;

    public Item(int data) {
        this.data = data;
    }

    public void displayItem() {
        System.out.print(data + " ");
    }
}
