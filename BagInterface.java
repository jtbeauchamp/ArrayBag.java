//
//  Name: Beauchamp, Joshua
//  Project: 1
//  Course: cs-2400-02-F23
//
//  Desription:
//          

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