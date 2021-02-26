public class ADTBag implements ADTBagInterface {

    private Object[] data;


    public void ADTBag(){
        Object[] list = new Object[100];

    }



    public void removeLast() {

        int last = this.data.size() - 1;

        this.data[last] = null;

    }


    public void removeRandom() {

    }


    public Object get(int index) {

        Object item = this.data[index];

        return item;
    }

    public int get(Object item) {
        int index = 0;
        for(int i = 0; i < this.data.size(); i++){
            if(item == this.data[i]){
                index = i;
            }
        }


        return index;
    }


    public int size() {
        int count = 0;
        //Iterate through the this.data.
        //While an element in the array is not equal to null increment count by one.
        //If an element is equal to null then return count.
        int index = 0;

        while(this.data[index] != null){
            count++;
            index++;
        }

    return count;
    }


    public void isEmpty() {

    }



    public void makeEmpty(ADTBag bag) {

        }



    public void insert(Object item) {
        //Find the next available index.
        //Assign item to that location in this.data array.
        this.data[this.data.size()] = item;

    }
}
