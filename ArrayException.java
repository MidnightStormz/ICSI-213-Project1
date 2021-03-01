/**
 * Creates an expression that triggers when the array is out of bounds.
 */

public class ArrayException extends Exception {
    /**
     * Makes an object with a message that describes the exception.
     * @param message A string that specifies the details of this exception.
     */

    public ArrayException(String message){
        super(message);
    }
}
