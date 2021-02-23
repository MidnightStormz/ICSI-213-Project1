public interface ADTBagInterface {
    public void insert(int i, String next); // inserts an item at the end of the list of this bag.
    public void removeLast(); // removes the last item in the array.
    public void removeRandom(); // removes a random item from the array.
    public Object get(int index);// gets the index of a specific item in the array.
    public int size(); // returns the size of the array.
    public void isEmpty(); // checks to see if the array is empty.
    public void makeEmpty(); // makes the array empty.


}
