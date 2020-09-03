package com.training.CollectionsFramework.Collections;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		System.out.println("STACK DEMO");System.out.println();

		//		Stack is basically derived from "vectors" and not "ArrayList"
		Stack<String> st = new Stack<String>();
		st.add("Kushaggra");			//Comes from higher level , i.e. parent class - Object Class
		st.push("Luna Lovegood");		//Specific to Stack class
		st.push("stack");
		st.push("ee");
		System.out.println(st);
		
		System.out.println("Element popped = "+st.pop());	//Deletes the element from the stack
		System.out.println(st);
		
		System.out.println("Element on top = "+st.peek());  //Doesn't delete, but displays the topmost element in the stack
		System.out.println(st);
		
		System.out.println("Element \"Kushaggra\" exists = "+st.contains("Kushaggra"));		//returns a boolean value
		
		System.out.println();
		System.out.println("Element \"Kushaggra\" exists at index = "+st.search("Kushaggra")); //returns the index(from the open end of the stack) at which the element exists
		System.out.println(st);
		

	}

}
