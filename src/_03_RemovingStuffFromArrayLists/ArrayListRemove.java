package _03_RemovingStuffFromArrayLists;

import java.util.ArrayList;

public class ArrayListRemove {

    class Stuff {
        public String type;
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    }

    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
    public static ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> yard ) {
        
        return yard;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> list) {
    	int size = list.size();
    	for(int i = 0; i<size;i++) {
if(list.get(i).equals('#')) {
	list.remove(list.get(i));
	size--;
	i--;
//EXPLANATION FOR WHY THERE IS INT SIZE = LIST.SIZE();, SIZE--;, and i--;!!!!!!!!!!//
//When the for loop iterates through the list, the size of the list may change if elements are removed. 
//This can cause the for loop to skip over some elements or to throw an exception. Adding an int variable 
//size = list.size(); before the for loop will store the original size of the list, and using this variable 
//in the for loop's conditional statement will ensure that the loop iterates through all the elements of the
//original list. Additionally, using size--; in the for loop will decrease the size variable by 1 each time 
//the loop iterates, so that the loop will end when it has iterated through all the elements of the original 
//list. And when an element is removed from the list, the next element in the list will take its place and 
//the size of the list will reduce by 1. So, if you don't decrease the variable i by 1, the loop will skip 
//the next element. Therefore, i--; is added to decrease the value of i by 1, so that the next element can 
//be checked in the next iteration
}
    	}
        return list;
    }
}
