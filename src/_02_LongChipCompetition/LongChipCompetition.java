package _02_LongChipCompetition;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
    /*
     * The Beatles are eating lunch and playing a game to see who has the
     * longest chip. (In England, french fries are called "chips".)
     * Find the Beatle with the longest chip. You may not edit the Chip or
     * Beatle classes. Make sure to initialize The Beatles before you start
     * your search.
     */
    private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();
    
    public static void main(String[] args) {
        LongChipCompetition lcc = new LongChipCompetition();
        lcc.initializeBeatles(); 
        //use lcc to call initialize beatles to understand where the method is coming from 
        //cuz initializeBeatles is in the longchipcompetition class 
        ArrayList<Beatle> theBeatles = lcc.getTheBand();

      double longestChip = 0;
       // double variable is used to represent floating-point numbers. aka numbers with large decimals 
       // ex: square root variable is declared with a double type
        String beatleWithLongestChip = "";
       // creating a string for the beatle with the longest chip's name 
        for(Beatle b : theBeatles) {
       // using while loops not for loops
            for(Chip c : b.getChips()) {
                if(c.getLength() > longestChip) {
                    longestChip = c.getLength();
                    beatleWithLongestChip = b.getName();
                    //how this while loop works is explained in the for loop form as I understand it more
                }
            }
        }
/*(FOR LOOP VERSION:
for(int i=0; i<theBeatles.size(); i++) {
            for(int j=0; j< theBeatles.get(i).getChips().size(); j++) {
            *two for loops like a 2d array: the two for loops are used to iterate through both the 
            * ArrayList of Beatle objects (i), and the ArrayList of Chip objects within each Beatle (j). 
            * The first for loop, "for(int i=0; i<theBeatles.size(); i++)", iterates through each Beatle object in the 
            * theBeatles ArrayList.
                if(theBeatles.get(i).getChips().get(j).getLength() > longestChip) {
            * if a certain beatle's chip length is larger than the longest chip, it becomes the longest chip, 
            * and so on until there is the longest chip possible. longestChip is a length/double variable
                    longestChip = theBeatles.get(i).getChips().get(j).getLength();
                    beatleWithLongestChip = theBeatles.get(i).getName();
            * therefore, the beatle witht he longest chip, is theBeatles.get(i)
            * beatleWithLongestChip is a string variable
                }
            }
        }
)
*/
        System.out.println("The beatle with the longest chip is: " + beatleWithLongestChip + " with a chip length of: " + longestChip);
        //have the code but am still confused on how I got there.
    }

     private void initializeBeatles() {
        Beatle george = new Beatle("George");
        Beatle john = new Beatle("John");
        Beatle paul = new Beatle("Paul");
        Beatle ringo = new Beatle("Ringo");
        theBeatles.add(george);
        theBeatles.add(john);
        theBeatles.add(paul);
        theBeatles.add(ringo);
    }

    public ArrayList<Beatle> getTheBand(){
        return theBeatles;
    }
}

class Beatle {
    private String name;
    private ArrayList<Chip> chips = new ArrayList<Chip>();

    public Beatle(String name) {
        this.name = name;
        initializePlateOfChips();
    }

    private void initializePlateOfChips() {
        int numberOfChips = new Random().nextInt(100);
        for (int i = 0; i < numberOfChips; i++) {
            chips.add(new Chip(new Random().nextDouble() * 10));
        }
    }

    public ArrayList<Chip> getChips() {
        return this.chips;
    }

    public String getName() {
        return this.name;
    }
}

class Chip {
    private double length;

    public double getLength() {
        return length;
    }

    Chip(double d) {
        this.length = d;
    }
}
