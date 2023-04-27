package other.AppName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class DataStructureAndAlgo {

	public static void main(String[] arg) {

		// LinkedList vs ArrayList
		// ==================================
		// addingStringElementLinkedlist(); addingStringElementArraylist();
		ArrayOfLinkedList();

		// HashMap
		// ==================================
		// addingStringElementHashMap();
		// ArrayOfHashMap();

		// HashMap
		// ==================================
		// addingStringElementHashSet();
	}

	public static void addingStringElementLinkedlist() {

		// LinkedList SYNTAX
		// LinkedList<E> objectName = new LinkedList<>();
		// E - the type of elements held in this collection

		// create linkedlist
		LinkedList<String> animals = new LinkedList<>();

		// add() method without the index parameter
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);

		// add() method with the index parameter
		animals.add(1, "Horse");
		System.out.println("Updated LinkedList: " + animals);

		// See Java documentation for more linkedList details
		// https://docs.oracle.com/javase/7/docs/api/
	}

	public static void addingStringElementArraylist() {

		// ArrayList SYNTAX
		// ArrayList<E> objectName = new ArrayList<>();
		// E - the type of elements held in this collection

		// create ArrayList
		ArrayList<String> animals = new ArrayList<>();

		// add() method without the index parameter
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);

		// add() method with the index parameter
		animals.add(1, "Horse");
		System.out.println("Updated LinkedList: " + animals);

		// See Java documentation for more ArrayList details
		// https://docs.oracle.com/javase/7/docs/api/
	}

	public static void ArrayOfLinkedList() {

		LinkedList<String> list1 = new LinkedList<>();
		list1.add("JavaFX");
		list1.add("Hbase");

		LinkedList<Double> list2 = new LinkedList<>();
		list2.add(12.34567);
		list2.add(1.234567);

		LinkedList<Character> list3 = new LinkedList<>();
		list3.add('a');
		list3.add('b');

		// LambDa format
		list3.forEach((c) -> {
			System.out.println("LambDa: " + c);
		});

		// Adding all LinkedList into an Object
		Object[] obj = { list1, list2, list3 };

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toString());
		}

	}

	public static void addingStringElementHashMap() {

		// HashMap SYNTAX
		// HashMap<K,V> objectName = new LinkedList<>();
		// K,V - the type of elements held in this collection

		// create ArrayList
		HashMap<String, String> capitalCities = new HashMap<>();

		// add() method without the index parameter
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println("LinkedList: " + capitalCities);

		// add() method with the index parameter
		capitalCities.put("Philippines", "Manila");
		System.out.println("Updated LinkedList: " + capitalCities);

		// See Java documentation for more ArrayList details
		// https://docs.oracle.com/javase/7/docs/api/
	}

	public static void ArrayOfHashMap() {

		HashMap<String, String> capitalCities = new HashMap<>();

		// add() method without the index parameter
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");

		// Accessing value using key
		System.out.println("The capital of USA is " + capitalCities.get("USA"));

		HashMap<Integer, String> leaderboard = new HashMap<>();

		// add() method without the index parameter
		leaderboard.put(1, "First");
		leaderboard.put(2, "Second");
		leaderboard.put(3, "Third");
		leaderboard.put(4, "Fourth");

		// Accessing value using key
		System.out.println("The #1 position is " + leaderboard.get(1));

		// Adding all LinkedList into an Object
		Object[] obj = { capitalCities, leaderboard };

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toString());
		}
	}

	public static void addingStringElementHashSet() {

		// HashSet SYNTAX
		// HashSet<E> objectName = new LinkedList<>();
		// E - the type of elements held in this collection

		// Creating an empty HashSet
		HashSet<String> set = new HashSet<String>();

		// Use add() method to add elements into the Set
		set.add("Welcome");
		set.add("To");
		set.add("Geeks");
		set.add("4");
		set.add("Geeks"); // this will not be added since its not unique

		// Displaying the HashSet
		System.out.println("HashSet: " + set);

		// Creating an iterator
		Iterator value = set.iterator();

		// Displaying the values after iterating through the set
		System.out.println("The iterator values are: ");
		while (value.hasNext()) {
			System.out.println(value.next());
		}

		// Notice the order of elements may be different
		// than insertion

		// Converting HashSet to Array
		String[] Geeks = set.toArray(new String[set.size()]);

		// Accessing elements by index
		System.out.println("Element at index 3 is: " + Geeks[3]);

		// See Java documentation for more linkedList details
		// https://docs.oracle.com/javase/7/docs/api/
	}

}
