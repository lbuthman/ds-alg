package ui;

import linkedList.Node;
import linkedList.SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedListMain {

    static Scanner scanner = new Scanner(System.in);
    static SingleLinkedList linkedList = new SingleLinkedList();

    public static void main(String[] args) {

        while (true) {
            printMenu();
            int selection = scanner.nextInt();
            if (selection == 19) {
                System.out.println("Goodbye!");
                return;
            }
            handleInput(selection);
        }
    }

    private static void printMenu() {
        System.out.println("1. Display the list");
        System.out.println("2. Count the number of nodes");
        System.out.println("3. Find if an element is in the list");
        System.out.println("4. Insert into the beginning of the list");
        System.out.println("5. Insert at the end of the list");
        System.out.println("6. Insert after a specific node");
        System.out.println("7. Insert before a specific node");
        System.out.println("8. Delete the first node");
        System.out.println("9. Delete the last node");
        System.out.println("10. Delete a specific node");
        System.out.println("11. Reverse the list");
        System.out.println("12. Bubble sort by exchanging data");
        System.out.println("13. Bubble sort by exchanging links");
        System.out.println("14. Merge sort");
        System.out.println("15. Insert Cycle");
        System.out.println("16. Detect Cycle");
        System.out.println("17. Remove Cycle");
        System.out.println("18. Quit");

    }

    private static void handleInput(int i) {
        Node node;
        int position;
        switch (i) {
            case 1:
                linkedList.displayList();
                break;
            case 2:
                getCountOfNode();
                break;
            case 3:
                findElement();
                break;
            case 4:
                node = makeNewNode();
                linkedList.insertAtBeginning(node);
                success("Inserting a node at the beginning");
                break;
            case 5:
                node = makeNewNode();
                linkedList.insertAtEnd(node);
                success("Inserting a node at the end");
                break;
            case 6:
                node = makeNewNode();
                position = specifyPosition();
                linkedList.insertPositionAfter(node, position);
                success("Inserting a node after position " + position);
                break;
            case 7:
                node = makeNewNode();
                position = specifyPosition();
                linkedList.insertPositionBefore(node, position);
                success("Inserting a node before position " + position);
                break;
            case 8:
                linkedList.deleteFirstNode();
                success("Deleting the first node");
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
    }

    private static int specifyPosition() {
        System.out.print("What position do you want to specify? ");
        return scanner.nextInt();
    }

    private static void success(String operation) {
        System.out.println(operation + " was successful!");
        System.out.println();
    }

    private static Node makeNewNode() {
        System.out.print("Enter the data int for the new node: ");
        int info = scanner.nextInt();
        return new Node(info);
    }

    private static void findElement() {
        System.out.print("What number do you want to find? ");
        int n = scanner.nextInt();
        boolean wasFound = linkedList.isInList(n);
        if (wasFound) {
            System.out.println("Element " + n + " was found!");
        } else {
            System.out.println("Element " + n + " is not in the list.");
        }
        System.out.println();
    }

    private static void getCountOfNode() {
        int count = linkedList.countNodes();
        System.out.println("There are " + count + " nodes in the list.");
        System.out.println();
    }
}
