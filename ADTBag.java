public class ADTBag implements ADTBagInterface {

    public Object[] data;


    public void ADTBag(){
        Object[] list = new Object[100];

    }



    public void removeLast() {
        
    }


    public void removeRandom() {

    }


    public Object get(int index) {
        for(int i = 0; i < 100; i++){
            if(i == index)
                return i;
        }
        return null;
    }


    public int size() {
        int count = 0;
        for(int i = 0; i < 100; i++){
            count++;
        }
    return count;
    }



    public void isEmpty() {

    }



    public void makeEmpty() {

    }

    public void insert(int i, String next) {


    }
}
