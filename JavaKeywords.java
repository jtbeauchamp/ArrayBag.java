//
//  Name: Beauchamp, Joshua
//  Project: 1
//  Course: cs-2400-02-F23
//
//  Desription:
//  

import java.io.File;
import java.util.Scanner;

public class JavaKeywords {
    public static void main(String[] args) throws Exception {
        BagInterface <String> bag = new ArrayBag<>();
        
        File file = new File("JavaKeywords.txt");
        Scanner scnr = new Scanner(file);
        while(scnr.hasNext()){
            bag.add(scnr.next());
        }

        System.out.println(bag.getCurrentSize());
       
        System.out.println("Java Keywords by Joshua Beauchamp\n\n" +
                    bag.getCurrentSize() + " Java keywords loaded.\n");

        System.out.println("Testing contains method:\nContains \"continue\" = " + bag.contains("continue"));

        System.out.println("\nTesting frequency method:\nOutputting frequency of \"continue\" = " + bag.getFrequency("continue"));
        System.out.println("Adding 3 more \"continue\"");
        bag.add("continue");
        bag.add("continue");
        bag.add("continue");
        System.out.println("Outputting frequency of \"continue\" = " + bag.getFrequency("continue"));
        
        System.out.println("\nTesting remove specific centry method\nContains 'there' = " + bag.contains("there"));
        bag.remove("there");
        System.out.println("Removing entry\nContains 'there' = " + bag.contains("there"));
        
        System.out.println("\nTesting remove method\nCurrent size = " + bag.getCurrentSize());
        bag.remove();
        System.out.println("Removing a bag entry\nCurrent size = " + bag.getCurrentSize());
        
        System.out.println("\nTesting isEmpty:\nBag is empty = " + bag.isEmpty());
        System.out.println("Clearing the bag");
        bag.clear();
        System.out.println("Bag is empty = " + bag.isEmpty());

        scnr.close();
    } //end main
} //end JavaKeyWords