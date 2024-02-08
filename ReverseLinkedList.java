import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
       
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the linked list (Enter -1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            linkedList.add(num);
        }
        System.out.println("Original linked list: " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed linked list: " + linkedList);
    }
    

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
           
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
