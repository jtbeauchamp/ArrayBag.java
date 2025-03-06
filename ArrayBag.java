//
//  Name: Beauchamp, Joshua
//  Project: 1
//  Course: cs-2400-02-F23
//
//  Desription:
//          

/**A class of a bag whose entries are taken from JavaKeyWords.txt and
 * stored in a fixed-size array. */
public final class ArrayBag <T> implements BagInterface <T> {


    private final T[] bag;
    private int numberOfEntries;
    private static final int MAX_CAPACITY = 100;


    public ArrayBag(){
        bag = (T[])new Object[MAX_CAPACITY];
    }
    /** Checks to see if the parameter is in the bag.
     * @param anEntry the chosen entry in the bag.
     * @return true if anEntry is in the bag, else false. */
    public boolean contains(T anEntry){
        boolean found = false;
        int index = 0;
        while (!found && index < numberOfEntries){
            //establish value of number of Entries
            if(anEntry.equals(bag[index])){
                //change name of object if not "bag"
                found = true;
            }
            index++;
        }
        return found;
    } //end contains    

    /** Gets the amount of entries in the bag currently. */
    public int getCurrentSize(){
        return numberOfEntries;
    } //end getCurrentSize

    /** Adds newEntry to the bag and increases the size of the bag if the bag
     * is not full, else returns false.
     * @param anEntry the given entry to be added to bag.
     * @return true if the entry is added, else false. */
    public boolean add(T newEntry){
        boolean result = true;
        if(isArrayFull()){
            result = false;
        }
        else{
            bag[numberOfEntries] = newEntry;
            /** Because indexes start at 0, numberOfEntries is actually one
             *  value bigger than the "size" of the bag. */
            numberOfEntries++;
        }
        return result;
    } //end add

    /** Removes a random entry in the bag.
     * @return true if an entry is removed, else false. */
    public T remove(){
        T result = null;
        if(numberOfEntries > 0){
            result = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    } //end remove

    /** Removes anEntry if its in the bag.
     * @param anEntry the given entry that is to be removed.
     * @return true if anEntry is removed, else false. */
    public boolean remove(T anEntry){
        int index = getIndexOf(anEntry);
        if(index == -1)
            return false;
        bag[index] = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;
        return true;
    } //end remove

    /** Checks if the bag is empty.
     * @return true if the bag is empty, else false. */
    public boolean isEmpty(){
        return numberOfEntries <= 0;
    } //end isEmpty

    /** Counts the number of times anEntry appeaars in bag.
     * @param anEntry the given entry that is counted.
     * @return the number of times anEntry appears in bag. */
    public int getFrequency(T anEntry){
        int count = 0;
        for(int i = 0; i < numberOfEntries; i++){
            if(anEntry.equals(bag[i])){
                count++;
            }
        }
        return count;
    } //end getFrequency

    /** Removes all entries from the bag. */
    public void clear(){
        while(!isEmpty()){
            remove();
        }
    }

    /** Converts all entries in the bag to an array. */
    public T[] toArray(){
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries];
        for(int i = 0; i < numberOfEntries; i++){
            result[i] = bag[i];
        }
        return result;
    } //end toArray

    /** Returns true if bag is full, else false. */
    private boolean isArrayFull(){
        return numberOfEntries >= MAX_CAPACITY;
    } //end isArrayFull

    /** Locates the index of a given entry in the bag.
     * @param anEntry the given entry that is being searched for.
     * @return the index of anEnty, else returns -1. */
    private int getIndexOf(T anEntry){
        int index = -1;
        boolean found = false;
        int count = 0;
        while(!found && (count < numberOfEntries)){
            if(anEntry.equals(bag[count])){
                found = true;
                index = count;
            }
            count++;
        }
        return index;
    } //end getIndexOf
} //end ArrayBag