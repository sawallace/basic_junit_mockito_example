package uk.bla.scot.tayside.sampleunittest;

/**
 * This class represents a contact, which is a basic person and a phone number.
 * 
 * @author swallace3
 */
public class Contact {
    private String forename;
    private String surname;
    private String phoneNumber;

    /**
     * Default constructor
     */
    public Contact() {
        System.out.println("Contact default constructor has been called");
        this.forename = "";
        this.surname = "";
        this.phoneNumber = "";
    }

    /**
     * Constructor with arguments
     * 
     * @param forename Contacts forename
     * @param surname Contacts surname
     * @param phoneNumber Contacts telephone number
     */
    public Contact(String forename, String surname, String phoneNumber) {
        System.out.println("Contact args constructor has been called");
        this.forename = forename;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getForename() {
        System.out.println("getForename has been called");
        return forename;
    }

    public void setForename(String forename) {
        System.out.println("setForename has been called");
        this.forename = forename;
    }

    public String getSurname() {
        System.out.println("getSurname has been called");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("setSurname has been called");
        this.surname = surname;
    }

    public String getPhoneNumber() {
        System.out.println("getPhoneNumber has been called");
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        System.out.println("setPhoneNumber has been called");
        this.phoneNumber = phoneNumber;
    }
}