package linkedList;

public class SingleLinkedList {

    private Node start;

    public SingleLinkedList() {
        this.start = null;
    }

    public void displayList() {
        Node p;

        if (start == null) {
            System.out.println("The list is empty");
            return;
        }

        System.out.print("The List is: ");
        p = start;

        while (p!=null) {
            System.out.print(p.info + " ");
            p = p.link;
        }

        System.out.println();
    }
}
