import java.util.*;

public class SingleOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nLinked List Operations:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at a specific position");
            System.out.println("4. Delete from beginning");
            System.out.println("5. Delete from end");
            System.out.println("6. Delete from a specific position");
            System.out.println("7. Display the linked list");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    int elementBeginning = scanner.nextInt();
                    linkedList.addFirst(elementBeginning);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int elementEnd = scanner.nextInt();
                    linkedList.addLast(elementEnd);
                    break;
                case 3:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter the position to insert at: ");
                    int position = scanner.nextInt();
                    if (position >= 0 && position <= linkedList.size()) {
                        linkedList.add(position, element);
                    } else {
                        System.out.println("Invalid position!");
                    }
                    break;
                case 4:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeFirst();
                    } else {
                        System.out.println("Linked list is empty!");
                    }
                    break;
                case 5:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeLast();
                    } else {
                        System.out.println("Linked list is empty!");
                    }
                    break;
                case 6:
                    if (!linkedList.isEmpty()) {
                        System.out.print("Enter the position to delete from: ");
                        int deletePosition = scanner.nextInt();
                        if (deletePosition >= 0 && deletePosition < linkedList.size()) {
                            linkedList.remove(deletePosition);
                        } else {
                            System.out.println("Invalid position!");
                        }
                    } else {
                        System.out.println("Linked list is empty!");
                    }
                    break;
                case 7:
                    if (!linkedList.isEmpty()) {
                        System.out.println("Linked List:");
                        System.out.println(linkedList);
                    } else {
                        System.out.println("Linked list is empty!");
                    }
                    break;
                case 8:
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
