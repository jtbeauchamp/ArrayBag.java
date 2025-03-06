//
//  Name: Beauchamp, Joshua
//  Project: 1
//  Course: cs-2400-02-F23
//
//  Desription:
//        The project focuses on the implementation of the bag data structure through the use of an array.
//        The array bag is a generic class that allows the bag to implement any data type for a safe coding
//        practice. The array bag implements methods that allow for the manipulation and retreiving of data.
//        This project's main focus is how to use the array bag to store java keywords, then taking user input
//        via command line and comparing the input from the user to data in the bag to see if the input is a
//        java keyword.     

/** An interface that describes the operations of a bag of objects */
public interface BagInterface <T>{
    /** Checks to see if the parameter is in the bag
     * @param anEntry the chosen entry in the bag
     * @return true if anEntry is in the bag, else false */
    public boolean contains(T anEntry);


    /** Returns the number of entries in the bag */
    public int getCurrentSize();


    /** Returns true if anEntry is added to the bag, else false */
    public boolean add(T newEntry);


    /** Returns true if bag is empty, else false */
    public boolean isEmpty();


    /** Randomly removes on entry, if an entry is removed it returns true
     * else false
     */
    public T remove();


    /** Removes a specific entry and returns true if it can remove it,
     * else false
     */
    public boolean remove(T anEntry);


    /** Removes all entries in the bag, making it empty */
    public void clear();


    /** Transfers the bag's contents into an array */
    public T[] toArray();


    /** Returns how many times anEntry is in the bag */
    public int getFrequency(T anEntry);


} //end BagInterface
