package uk.bla.scot.tayside.sampleunittest;

import uk.bla.scot.tayside.sampleunittest.Contact;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test Class for {@link Contact} object.
 * 
 * @author swallace3
 */
public class ContactTest {
    
    // This is the object under test
    private Contact objectUnderTest;
    
    public ContactTest() {
    }

    /**
     * Test constructing {@link Contact} class with the default constructor.
     */
    @Test
    public void testDefaultConstructor() {
        this.objectUnderTest = new Contact();
        assertEquals(this.objectUnderTest.getForename(), "");
        assertEquals(this.objectUnderTest.getSurname(), "");
        assertEquals(this.objectUnderTest.getPhoneNumber(), "");
    }
    
    /**
     * Test constructing {@link Contact} class with the argument override constructor with valid data.
     */
    @Test
    public void testArgsConstructor_validData() {
        String testForename = "Steven";
        String testSurname = "Wallace";
        String testTelNumber = "01382 112233";
        
        this.objectUnderTest = new Contact(testForename,testSurname,testTelNumber);
        
        assertEquals(this.objectUnderTest.getForename(), testForename);
        assertEquals(this.objectUnderTest.getSurname(), testSurname);
        assertEquals(this.objectUnderTest.getPhoneNumber(), testTelNumber);
    }
    
    /**
     * Test constructing {@link Contact} class with the argument override constructor with null data.
     */
    @Test
    public void testArgsConstructor_nullData() {
        String testForename = null;
        String testSurname = null;
        String testTelNumber = null;
        
        this.objectUnderTest = new Contact(testForename,testSurname,testTelNumber);
        assertEquals(this.objectUnderTest.getForename(), null);
        assertEquals(this.objectUnderTest.getSurname(), null);
        assertEquals(this.objectUnderTest.getPhoneNumber(), null);
    }
    
    /**
     * Test the method {@link Contact.setForename()} with valid data.
     */
    @Test
    public void testSetForename_validData() {
        String testForename = "Steven1";
        this.objectUnderTest = new Contact();
        this.objectUnderTest.setForename(testForename);
        assertEquals(this.objectUnderTest.getForename(), testForename);
    }
    
    /**
     * Test the method {@link Contact.setForename()} with null data.
     */
    @Test
    public void testSetForename_nullData() {
        String testForename = null;
        this.objectUnderTest = new Contact("11","22","33");
        this.objectUnderTest.setForename(testForename);
        assertEquals(this.objectUnderTest.getForename(), testForename);
    }
    
    /**
     * Test the method {@link Contact.setSurname()} with valid data.
     */
    @Test
    public void testSetSurname_validData() {
        String testSurname = "Wallace1";
        this.objectUnderTest = new Contact();
        this.objectUnderTest.setSurname(testSurname);
        assertEquals(this.objectUnderTest.getSurname(), testSurname);
    }
    
    /**
     * Test the method {@link Contact.setSurname()} with null data.
     */
    @Test
    public void testSetSurname_nullData() {
        String testSurname = null;
        this.objectUnderTest = new Contact("11","22","33");
        this.objectUnderTest.setSurname(testSurname);
        assertEquals(this.objectUnderTest.getSurname(), testSurname);
    }
    
   /**
     * Test the method {@link Contact.setPhoneNumber()} with valid data.
     */
    @Test
    public void testSetPhoneNumber_validData() {
        String testPhoneNumber = "Wallace1";
        this.objectUnderTest = new Contact();
        this.objectUnderTest.setPhoneNumber(testPhoneNumber);
        assertEquals(this.objectUnderTest.getPhoneNumber(), testPhoneNumber);
    }
    
    /**
     * Test the method {@link Contact.setPhoneNumber()} with null data.
     */
    @Test
    public void testSetPhoneNumber_nullData() {
        String testPhoneNumber = null;
        this.objectUnderTest = new Contact("11","22","33");
        this.objectUnderTest.setPhoneNumber(testPhoneNumber);
        assertEquals(this.objectUnderTest.getPhoneNumber(), testPhoneNumber);
    }
}