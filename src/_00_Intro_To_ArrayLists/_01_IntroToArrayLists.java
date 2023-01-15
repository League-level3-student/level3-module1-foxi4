package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> strings = new ArrayList<String>();

        // 2. Add five Strings to your list
strings.add("1");
strings.add("2");
strings.add("3");
strings.add("4");
strings.add("5");
        // 3. Print all the Strings using a standard for-loop
for(int i=0; i<strings.size(); i++) {
	System.out.println(strings.get(i));
}
System.out.println(" ");
        // 4. Print all the Strings using a for-each loop
for(String i : strings) {
	System.out.println(i);
}
System.out.println(" ");
        // 5. Print only the even numbered elements in the list.
for(int i=0; i<strings.size(); i++) {
	
	if(i%2==0) {
		//i are the positions
		System.out.println(i);
	}
}
System.out.println(" ");
        // 6. Print all the Strings in reverse order.

	String max = strings.get(strings.size()-1);
	String min = strings.get(0);
	String minONE = strings.get(1);
	String minTWO = strings.get(2);
	String minTHREE = strings.get(3);
	/* if(max == strings.get(i)) {
		System.out.println(max);
	}
	if(min == strings.get(i)) {
		System.out.println(min);
	 } */
	System.out.println(max);
	System.out.println(minTHREE);
	System.out.println(minTWO);
	System.out.println(minONE);
	System.out.println(min);
	//lol i did it the wrong way BUT IT WORSK OKAY
System.out.println(" ");
        // 7. Print only the Strings that have the letter 'e' in them.
for(int i=0; i<strings.size(); i++) {
	if(strings.get(i)=="e") {
		System.out.println(i);
	}
	else {
		System.out.println("Arraylist element "+i+": does not have the letter 'e' in them.");
	}
	
	}

    }
}
