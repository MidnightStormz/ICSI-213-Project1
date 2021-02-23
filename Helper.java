
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Helper{

    public static void start() throws FileNotFoundException{
        ADTBag list = new ADTBag();
        create(list);
        display(list);




    }

    /**
     * Displays the data in the array in order.
     *
     * @param list
     */
    public static void display(ADTBag list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }

    /**
     * Creates a list based on a file and based upon the constructor
     *
     * @param bag An object of the ADTBag class
     * @throws FileNotFoundException If file cannot be found.
     */
    public static void create(ADTBag bag) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\xoboy\\IdeaProjects\\src\\datalist.txt"));

        System.out.println("It is working.");

        int i = 0;
        while(input.hasNext()){
            bag.insert(i,input.next());
            System.out.println();
            i++;

        }
        input.close();


    }

}
