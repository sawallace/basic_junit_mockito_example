package uk.nhs.scot.tayside.sampleunittest;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Test Class for {@link Patient} object.
 * 
 * @author swallace3
 */
public class PatientTest {
    
    // This is the object under test
    private Patient objectUnderTest;
    
    public PatientTest() {
    }

    /**
     * Test constructing {@link Contact} class with the default constructor.
     */
    @Test
    public void testDefaultConstructor() {
        this.objectUnderTest = new Patient();
        assertEquals(this.objectUnderTest.getForename(), "");
        assertEquals(this.objectUnderTest.getSurname(), "");
        assertEquals(this.objectUnderTest.getChiNumber(), "");
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().size(), 0);
    }
    
    /**
     * Test constructing {@link Contact} class with the arguments constructor with valid data.
     */
    @Test
    public void testArgsConstructor_goodCase() {
        
        // Test Data
        String patientsForename = "Ben";
        String patientsSurname = "Nadel";
        String patientsChi = "8877665544";
        String mockContactsForename1 = "MockSteven";
        String mockContactsSurname1 = "MockWallace";
        String mockContactsPhoneNumber1 = "00000 112233";
        String mockContactsForename2 = "MockSteven";
        String mockContactsSurname2 = "MockWallace";
        String mockContactsPhoneNumber2 = "00000 112233";
        
        // Create and train mock Contact object to return some real data.
        Contact mockContact = mock(Contact.class);
        when(mockContact.getForename()).thenReturn(mockContactsForename1).thenReturn(mockContactsForename2);
        when(mockContact.getSurname()).thenReturn(mockContactsSurname1).thenReturn(mockContactsSurname2);
        when(mockContact.getPhoneNumber()).thenReturn(mockContactsPhoneNumber1).thenReturn(mockContactsPhoneNumber2);
        
        // Create arraylist of mock contacts
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(mockContact);
        contacts.add(mockContact);
        
        this.objectUnderTest = new Patient(patientsForename,patientsSurname,patientsChi,contacts);
        
        // Test outcomes
        assertEquals(this.objectUnderTest.getForename(), patientsForename);
        assertEquals(this.objectUnderTest.getSurname(), patientsSurname);
        assertEquals(this.objectUnderTest.getChiNumber(), patientsChi);
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().size(), 2);
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().get(0), mockContactsForename1+" "+mockContactsSurname1+": "+mockContactsPhoneNumber1);
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().get(0), mockContactsForename2+" "+mockContactsSurname2+": "+mockContactsPhoneNumber2);
    }
    
    /**
     * Test constructing {@link Contact} class with the arguments constructor with empty string data.
     */
    @Test
    public void testArgsConstructor_emptyStrings() {
        
        // Test Data
        String patientsForename = "";
        String patientsSurname = "";
        String patientsChi = "";
        String mockContactsForename1 = "";
        String mockContactsSurname1 = "";
        String mockContactsPhoneNumber1 = "";
        String mockContactsForename2 = "";
        String mockContactsSurname2 = "";
        String mockContactsPhoneNumber2 = "";
        
        // Create and train mock Contact object to return some real data.
        Contact mockContact = mock(Contact.class);
        when(mockContact.getForename()).thenReturn(mockContactsForename1).thenReturn(mockContactsForename2);
        when(mockContact.getSurname()).thenReturn(mockContactsSurname1).thenReturn(mockContactsSurname2);
        when(mockContact.getPhoneNumber()).thenReturn(mockContactsPhoneNumber1).thenReturn(mockContactsPhoneNumber2);
        
        // Create arraylist of mock contacts
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(mockContact);
        contacts.add(mockContact);
        
        this.objectUnderTest = new Patient(patientsForename,patientsSurname,patientsChi,contacts);
        
        // Test outcomes
        assertEquals(this.objectUnderTest.getForename(), patientsForename);
        assertEquals(this.objectUnderTest.getSurname(), patientsSurname);
        assertEquals(this.objectUnderTest.getChiNumber(), patientsChi);
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().size(), 2);
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().get(0), mockContactsForename1+" "+mockContactsSurname1+": "+mockContactsPhoneNumber1);
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().get(0), mockContactsForename2+" "+mockContactsSurname2+": "+mockContactsPhoneNumber2);
    }
    
    /**
     * Test constructing {@link Contact} class with the arguments constructor with null data.
     */
    @Test
    public void testArgsConstructor_nullData() {
        this.objectUnderTest = new Patient(null,null,null,null);
        
        // Test outcomes
        assertEquals(this.objectUnderTest.getForename(), null);
        assertEquals(this.objectUnderTest.getSurname(), null);
        assertEquals(this.objectUnderTest.getChiNumber(), null);
        assertEquals(this.objectUnderTest.getFamilyMembersPhoneNumbers().size(), 0);
    }
    
    /**
     * Test {@link Patient.getFamilyMembersPhoneNumbers()} method with no contacts.
     */
    @Test
    public void testGetFamilyMembersPhoneNumbers_noContacts() {
        this.objectUnderTest = new Patient();
        ArrayList<String> result = this.objectUnderTest.getFamilyMembersPhoneNumbers();
        assertEquals(result.size(), 0);
    }
    
    /**
     * This is an example of a bad "unit" test as when you run this test, you can see 
     * from the console output that the Contact class is actually used here. The unit 
     * test should not depend on anything outside of itself, thus this is considered a very 
     * badly written unit test.
     */
    @Test
    public void exampleOfABadUnitTest() {
        // Constrct our object under test
        this.objectUnderTest = new Patient();
        
        // Add the mockContact as a family member
        this.objectUnderTest.addFamilyMember(new Contact("Steven","Bell","828282"));
        ArrayList<String> result = this.objectUnderTest.getFamilyMembersPhoneNumbers();
        
        // Verify there is only one record on the record set
        assertEquals(result.size(), 1);
    }
    
    /**
     * Test {@link Patient.getFamilyMembersPhoneNumbers()} method with 1 family member.
     */
    @Test
    public void testGetFamilyMembersPhoneNumbers_with1FamilyMember() {
        
        // Test Data
        String testForename = "MockSteven";
        String testSurname = "MockWallace";
        String testPhoneNumber = "00000 112233";
        
        // Create and train mock Contact object to return some real data.
        Contact mockContact = mock(Contact.class);
        when(mockContact.getForename()).thenReturn(testForename);
        when(mockContact.getSurname()).thenReturn(testSurname);
        when(mockContact.getPhoneNumber()).thenReturn(testPhoneNumber);
        
        // Constrct our object under test
        this.objectUnderTest = new Patient();
        
        // Add the mockContact as a family member
        this.objectUnderTest.addFamilyMember(mockContact);
        ArrayList<String> result = this.objectUnderTest.getFamilyMembersPhoneNumbers();
        
        // Verify there is only one record on the record set
        assertEquals(result.size(), 1);
        assertEquals(result.get(0), testForename+" "+testSurname+": "+testPhoneNumber);
    }
    
    /**
     * Test {@link Patient.setChiNumber()} method with valid data.
     * 
     * @throws uk.nhs.scot.tayside.sampleunittest.EmptyValueException
     */
    @Test
    public void testSetChiNumber_goodCase() throws EmptyValueException {
        String testChiNumber = "0102030405";
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setChiNumber(testChiNumber);
        assertEquals(this.objectUnderTest.getChiNumber(), testChiNumber);
    }
    
    /**
     * Test {@link Patient.setChiNumber()} method with empty string passed in.
     * 
     * @throws uk.nhs.scot.tayside.sampleunittest.EmptyValueException
     */
    @Test(expected=EmptyValueException.class)
    public void testSetChiNumber_emptyString() throws EmptyValueException {
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setChiNumber("");
    }
    
    /**
     * Test {@link Patient.setChiNumber()} method with null passed in.
     * 
     * @throws uk.nhs.scot.tayside.sampleunittest.EmptyValueException
     */
    @Test(expected=EmptyValueException.class)
    public void testSetChiNumber_null() throws EmptyValueException {
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setChiNumber(null);
    }
    
    /**
     * Test {@link Patient.setForename()} method with valid data.
     */
    @Test
    public void testSetForename_goodCase() {
        String testForename = "Steven";
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setForename(testForename);
        assertEquals(this.objectUnderTest.getForename(), testForename);
    }
    
    /**
     * Test {@link Patient.setForename()} method with null data.
     */
    @Test
    public void testSetForename_null() {
        String testForename = null;
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setForename(testForename);
        assertEquals(this.objectUnderTest.getForename(), testForename);
    }
    
    /**
     * Test {@link Patient.setForename()} method with empty string.
     */
    @Test
    public void testSetForename_emptyString() {
        String testForename = "";
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setForename(testForename);
        assertEquals(this.objectUnderTest.getForename(), testForename);
    }
    
    /**
     * Test {@link Patient.setSurname()} method with valid data.
     */
    @Test
    public void testSetSurname_goodCase() {
        String testSurname = "Wallace";
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setSurname(testSurname);
        assertEquals(this.objectUnderTest.getSurname(), testSurname);
    }
    
    /**
     * Test {@link Patient.setSurname()} method with null data.
     */
    @Test
    public void testSetSurname_null() {
        String testSurname = null;
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setSurname(testSurname);
        assertEquals(this.objectUnderTest.getSurname(), testSurname);
    }
    
    /**
     * Test {@link Patient.setForename()} method with empty string.
     */
    @Test
    public void testSetSurname_emptyString() {
        String testSurname = "";
        this.objectUnderTest = new Patient();
        this.objectUnderTest.setSurname(testSurname);
        assertEquals(this.objectUnderTest.getSurname(), testSurname);
    }
}