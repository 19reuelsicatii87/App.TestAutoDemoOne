package other.AppName;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DataStructureAndAlgo {

	// Primitive Types
	// ========================================
	int integer;
	boolean bool;
	char character;

	// Reference Types
	// ========================================
	//Array
	int[] integerArray = {1};
	ArrayList<Integer> cars = new ArrayList<Integer>();
	LinkedList<String> motors = new LinkedList<String>();
	List<Integer> names = new Stack<Integer>();
	
	// Stack
	Stack<Integer> stacks = new Stack<Integer>();
	
	
	// Queue
	Queue<Object> numbers = new LinkedList<Object>();


	public void main(String[] args) {

		integerArray.clone();
		cars.add(1);
		stacks.push(1);
		motors.add("one");
		

	}

}
