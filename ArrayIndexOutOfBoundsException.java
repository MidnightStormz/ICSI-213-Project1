/**
 * Creates an expression that triggers when the array is out of bounds.
 */

public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException {
    /**
     * Makes an object with a message that describes the exception.
     * @param message A string that specifies the details of this exception.
     */

    public ArrayIndexOutOfBoundsException(String message){
        super(message);
    }
}
