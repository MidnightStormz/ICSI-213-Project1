import java.util.Random;

public class ADTBag implements ADTBagInterface {

    public Object[] data;
    int end = 0;
    private Random number = new Random();

    /**
     * Method to define the constructor of the ADTBag class.
     */
    public ADTBag(){
        data = new Object[100];

    }


    /**
     * Method to remove the last item in the array.
     */
    public void removeLast() {

        int last = this.size() - 1;

        this.data[last] = null;

        end--;

    }

    /**
     * Method to remove a random item from the array.
     */
    public void removeRandom() {
        // Create a random number between 0 and 100
        // Remove item at generated random number index.
        int randomNumber = number.nextInt(100);
        this.data[randomNumber] = null;
        end--;
    }

    /**
     * Method to return the object at a specified index within the array.
     * @param index
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object get(int index) throws ArrayIndexOutOfBoundsException{
        // Check if index is within bounds.
        // get item at the given index in the array.
        // return the item.
        if(index > 100 || index < 0){
            throw new ArrayIndexOutOfBoundsException("The index must be between 0 and 100");
        }else {

            Object item = this.data[index];

            return item;
        }
    }

    /**
     * Method to return an index of a specified item.
     * @param item
     * @return
     */
    public int get(Object item) {
        // Search array for given item.
        // return index of first occurrence of the item given.
        int index = 0;
        for(int i = 0; i < this.size(); i++){
            if(item == this.data[i]){
                index = i;
            }
        }


        return index;
    }

    /**
     * Method to return the size of the array.
     * @return
     */
    public int size() {
    return end;
    }

    /**
     * Method to check if the array is empty.
     */
    public boolean isEmpty() {
        for(int i = 0; i < this.size();i++){
            if(this.data[i] != null){
                return false;
            }
        }
        return true;
    }


    /**
     * Method to make the array empty.
     * @param bag
     */
    public void makeEmpty(ADTBag bag) {
        for(int i = 0; i < this.size(); i++){
                this.data[i] = null;
            }
        }


    /**
     * Method to insert an item into the array at the next available index.
     * @param item
     * @throws ArrayException
     */
    public void insert(Object item) throws ArrayException {
        //Find the next available index.
        //Assign item to that location in this.data array.

        this.data[end] = item;
        end++;

    }
}
