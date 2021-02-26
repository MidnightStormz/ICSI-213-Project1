
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Helper {

    public static void start() throws FileNotFoundException{
        ADTBag bag = new ADTBag();
        create(bag);
        display(bag);
        bag.isEmpty();
        bag.size();





    }

    /**
     * Displays the data in the array in order.
     *
     * @param bag
     */
    public static void display(ADTBag bag){
        for(int i = 0; i < bag.size(); i++){
            System.out.println();
        }

    }

    /**
     * Creates a list based on a file and based upon the constructor
     *
     * @param bag An object of the ADTBag class
     * @throws FileNotFoundException If file cannot be found.
     */
    public static void create(ADTBag bag) throws FileNotFoundException {
       String file = "C:\\Users\\xoboy\\IdeaProjects\\src\\datalist.txt";

       Scanner input = new Scanner(new File(file));

        while(input.hasNext()){
            bag.insert(input.next());

        }
        input.close();


    }

}
