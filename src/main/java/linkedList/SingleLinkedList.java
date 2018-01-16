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
        System.out.print("The List is: ");
        Node refNode = start;
        while (refNode != null) {
            System.out.print(refNode.info + " ");
            refNode = refNode.link;
        }
        System.out.println();
    }

    public int countNodes() {
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

    public boolean isInList(int n) {
        Node refNode = start;
        while (refNode != null) {
            if (refNode.info == n) {
                return true;
            }
            refNode = refNode.link;
        }

        return false;
    }

    public void insertAtBeginning(Node newNode) {
        newNode.link = start;
        start = newNode;
    }

    public void insertAtEnd(Node newNode) {
        if (start == null) {
            start = newNode;
            return;
        }
        Node refNode = start;
        while (refNode.link != null) {
            refNode = refNode.link;
        }
        refNode.link = newNode;
    }
}
