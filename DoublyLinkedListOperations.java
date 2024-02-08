import java.util.*;
import java.util.LinkedList;

public class DoublyLinkedListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> doublyLinkedList = new LinkedList<>();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at specific position");
            System.out.println("4. Delete from beginning");
            System.out.println("5. Delete from end");
            System.out.println("6. Delete from specific position");
            System.out.println("7. Display the list");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert at beginning:");
                    int elementBegin = scanner.nextInt();
                    doublyLinkedList.addFirst(elementBegin);
                    break;
                case 2:
                    System.out.println("Enter the element to insert at end:");
                    int elementEnd = scanner.nextInt();
                    doublyLinkedList.addLast(elementEnd);
                    break;
                case 3:
                    System.out.println("Enter the position:");
                    int position = scanner.nextInt();
                    System.out.println("Enter the element to insert at position " + position + ":");
                    int elementPosition = scanner.nextInt();
                    doublyLinkedList.add(position, elementPosition);
                    break;
                case 4:
                    if (!doublyLinkedList.isEmpty()) {
                        doublyLinkedList.removeFirst();
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 5:
                    if (!doublyLinkedList.isEmpty()) {
                        doublyLinkedList.removeLast();
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 6:
                    System.out.println("Enter the position to delete:");
                    int deletePosition = scanner.nextInt();
                    if (deletePosition >= 0 && deletePosition < doublyLinkedList.size()) {
                        doublyLinkedList.remove(deletePosition);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 7:
                    System.out.println("Doubly Linked List:");
                    System.out.print("start -> ");
                    for (Integer element : doublyLinkedList) {
                        System.out.print(element + " -> ");
                    }
                    System.out.print("null\n");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
