import java.util.*;

public class sortlinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            linkedList.add(num);
        }
        Collections.sort(linkedList);
        System.out.println("Sorted Linked List:");
        for (int num : linkedList) {
            System.out.print(num+" ");
        }
        scanner.close();
    }
}
