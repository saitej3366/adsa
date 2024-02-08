import java.util.*;

public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the linked list separated by space:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int[] arr = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : arr) {
            list.add(num);
        }

        System.out.println("Original Linked List: " + list);

        removeDuplicates(list);

        System.out.println("Linked List after removing duplicates: " + list);
    }

    public static void removeDuplicates(LinkedList<Integer> list) {
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (set.contains(current)) {
                iterator.remove();
            } else {
                set.add(current);
            }
        }
    }
}
