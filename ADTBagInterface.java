public interface ADTBagInterface {
    public void insert(Object item) throws ArrayException; // inserts an item at the end of the list of this bag.
    public void removeLast(); // removes the last item in the array.
    public void removeRandom(); // removes a random item from the array.
    public Object get(int index)throws ArrayIndexOutOfBoundsException;// gets the index of a specific item in the array.
    public int size(); // returns the size of the array.
    public boolean isEmpty(); // checks to see if the array is empty.
    public void makeEmpty(ADTBag bag); // makes the array empty.
    public int get(Object item);


}
