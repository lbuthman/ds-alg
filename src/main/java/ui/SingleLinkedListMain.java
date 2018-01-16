package ui;

import linkedList.SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedListMain {

    static SingleLinkedList linkedList = new SingleLinkedList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int selection = scanner.nextInt();
            handleInput(selection);
        }
    }

    private static void printMenu() {
        System.out.println("1. Display the list");
        System.out.println("2. Count the number of nodes");
        System.out.println("3. Search for an element");
        System.out.println("4. Insert into the beginning of the list");
        System.out.println("5. Insert at the end of the list");
        System.out.println("6. Insert after a specific node");
        System.out.println("7. Insert before a specific node");
        System.out.println("8. Insert a specific position");
        System.out.println("9. Delete the first node");
        System.out.println("10. Delete the last node");
        System.out.println("11. Delete a specific node");
        System.out.println("12. Reverse the list");
        System.out.println("13. Bubble sort by exchanging data");
        System.out.println("14. Bubble sort by exchanging links");
        System.out.println("15. Merge sort");
        System.out.println("16. Insert Cycle");
        System.out.println("17. Detect Cycle");
        System.out.println("18. Remove Cycle");
        System.out.println("19. Quit");

    }

    private static void handleInput(int i) {
        switch (i) {
            case 1:
                linkedList.displayList();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
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
            case 18:
                break;
            case 19:
                System.out.println("Goodbye!");
                return;
        }
    }
}
