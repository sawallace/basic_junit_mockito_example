package uk.nhs.scot.tayside.sampleunittest;

/**
 * This is a custom exception. I have created this a a very simple example of a custom exception.
 * 
 * @author swallace3
 */
public class EmptyValueException extends Exception {
    public EmptyValueException() {
        super("The value passed in cannot be null.");
    }
}
