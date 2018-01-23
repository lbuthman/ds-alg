package linkedList;

public class SingleLinkedList {

    private Node start;

    public SingleLinkedList() {
        this.start = null;
    }

    public void displayList() {
        if (start == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("The List is: ");
        Node refNode = start;
        while (refNode != null) {
            System.out.print(refNode.info + " ");
            refNode = refNode.link;
        }
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
            insertEmpty(newNode);
            return;
        }
        Node refNode = start;
        while (refNode.link != null) {
            refNode = refNode.link;
        }
        refNode.link = newNode;
    }

    public void insertPositionAfter(Node newNode, int position) {
        Node refNode = start;
        if (refNode == null) {
            insertEmpty(newNode);
            return;
        }

        for (int i=1; i<position && refNode.link != null; i++) {
            refNode = refNode.link;
        }
        newNode.link = refNode.link;
        refNode.link = newNode;
    }

    public void insertPositionBefore(Node newNode, int position) {
        Node prev = null;
        Node refNode = start;
        if (refNode == null) {
            insertEmpty(newNode);
            return;
        }

        if (position == 0 || position == 1) {
            newNode.link = start;
            start = newNode;
            return;
        }

        for (int i=1; i<position && refNode.link != null; i++) {
            prev = refNode;
            refNode = refNode.link;

        }
        newNode.link = refNode;
        prev.link = newNode;
    }

    private void insertEmpty(Node newNode) {
        start = newNode;
    }

    public void deleteFirstNode() {
        if (countNodes() == 0) {
            return;
        }
        start = start.link;
    }

    public void deleteLastNode() {
        if (countNodes() == 0) {
            return;
        }

        if (countNodes() == 1) {
            deleteFirstNode();
            return;
        }

        Node refNode = start;
        while (refNode.link.link != null) {
            refNode = refNode.link;
        }
        refNode.link = null;
    }

    public void deleteAtPosition(int position) {
        if (countNodes() == 0) {
            return;
        }

        if (countNodes() == 1 || position == 1) {
            deleteFirstNode();
            return;
        }

        Node refNode = start;
        for (int i=1; i<position && refNode.link.link != null; i++) {
            refNode = refNode.link;
        }
        refNode.link = refNode.link.link;
    }

    public void reverseList() {
        if (start == null) {
            return;
        }

        Node prev = null;
        Node current = start;
        Node next = null;
        while (current.link != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        current.link = prev;
        start = next;
    }

    public void bubbleSort() {
        Node current, next, end;

        for (end=null; end!=start.link; end=current) {
            for (current=start; current.link!=end; current=current.link) {
                next = current.link;
                if (current.info > next.info) {
                    int temp = current.info;
                    current.info = next.info;
                    next.info = temp;
                }
            }
        }
    }
}
