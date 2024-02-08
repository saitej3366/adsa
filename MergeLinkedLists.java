import java.util.*;

public class MergeLinkedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the first linked list (separated by spaces):");
        String input1 = scanner.nextLine();
        LinkedList<Integer> list1 = new LinkedList<>();
        for (String numStr : input1.split("\\s+")) {
            list1.add(Integer.parseInt(numStr));
        }
        System.out.println("Enter elements for the second linked list (separated by spaces):");
        String input2 = scanner.nextLine();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (String numStr : input2.split("\\s+")) {
            list2.add(Integer.parseInt(numStr));
        }
        LinkedList<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Merged linked list:");
        for (Integer num : mergedList) {
            System.out.print(num + " ");
        }
    }

    public static LinkedList<Integer> mergeLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);
        return mergedList;
    }
}
