//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
	
	package Lab1;
	import java.util.*;

	public class ListOperations {

	    public static void main(String[] args) {
	        // 1. Adding elements
	        List<String> arrayList = new ArrayList<>();
	        List<String> linkedList = new LinkedList<>();
	        addElements(arrayList);
	        addElements(linkedList);

	        System.out.println("1. Added elements: " + arrayList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");
	        System.out.println("2. After adding 'Mango' at index 1: " + arrayList);

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);
	        System.out.println("3. After adding multiple elements: " + arrayList);

	        // 4. Accessing elements
	        System.out.println("4. Access element at index 2: " + arrayList.get(2));

	        // 5. Updating elements
	        arrayList.set(2, "Kiwi");
	        linkedList.set(2, "Kiwi");
	        System.out.println("5. After updating element at index 2: " + arrayList);

	        // 6. Removing elements
	        arrayList.remove("Banana");
	        linkedList.remove("Banana");
	        System.out.println("6. After removing 'Banana': " + arrayList);

	        // 7. Searching elements
	        System.out.println("7. Contains 'Apple'? " + arrayList.contains("Apple"));

	        // 8. List size
	        System.out.println("8. Size of list: " + arrayList.size());

	        // 9. Iterating over list
	        System.out.print("9. Iterating using for-each loop: ");
	        for (String fruit : arrayList) {
	            System.out.print(fruit + " ");
	        }
	        System.out.println();

	        // 10. Using Iterator
	        System.out.print("10. Iterating using Iterator: ");
	        Iterator<String> iterator = arrayList.iterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);
	        System.out.println("11. After sorting: " + arrayList);

	        // 12. Sublist
	        List<String> subList = arrayList.subList(1, 3);
	        System.out.println("12. Sublist from index 1 to 2: " + subList);

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();
	        System.out.println("13. After clearing: " + arrayList + ", isEmpty? " + arrayList.isEmpty());
	    }

	    static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	    }
	}


