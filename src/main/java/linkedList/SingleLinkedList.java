package linkedList;

public class SingleLinkedList {

    private Node start;

    public SingleLinkedList() {
        this.start = null;
    }

    public void displayList() {
        if (start == null) {
            System.out.println("The list is empty.");
            System.out.println();
            return;
        }
        System.out.println("The List is: ");
        Node refNode = start;
        while (refNode != null) {
            System.out.print(refNode.info + " ");
        }
        System.out.println();
    }

    public void insertAtBeginning(Node newNode) {
        newNode.link = start;
        start = newNode;
    }

    public void insertAtEnd(Node newNode) {
        Node refNode = start;
        while (refNode.link != null) {
            refNode = refNode.link;
        }
        refNode.link = newNode;
    }

    public Node getStart() {
        return start;
    }

    public int size() {
        int count = 0;
        Node refNode = start;

        if (refNode == null) {
            return count;
        }

        while (refNode != null) {
            count++;
            refNode = refNode.link;
        }

        return count;
    }
}
