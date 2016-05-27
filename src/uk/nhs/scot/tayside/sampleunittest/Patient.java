package uk.nhs.scot.tayside.sampleunittest;

import java.util.ArrayList;

/**
 * This class represents a patient.
 * 
 * @author swallace3
 */
public class Patient {

    private String forename;
    private String surname;
    private String chiNumber;
    private final ArrayList<Contact> familyMembers;
    
    /**
     * Default constructor
     */
    public Patient() {
        this.familyMembers = new ArrayList<>();
        this.forename = "";
        this.surname = "";
        this.chiNumber = "";
    }

    /**
     * Constructor with arguments
     * 
     * @param forename Patients forename
     * @param surname Patients surname
     * @param chiNumber Patients chi number (10 digit long)
     * @param familyMembers Details of family members: array list of {@link Contact}
     * 
     */
    public Patient(String forename, String surname, String chiNumber, ArrayList<Contact> familyMembers) {
        this.forename = forename;
        this.surname = surname;
        this.chiNumber = chiNumber;
        if(familyMembers == null)
            this.familyMembers = new ArrayList<>();
        else
            this.familyMembers = familyMembers;
    }
    
    public void addFamilyMember(Contact familyMember) {
        familyMembers.add(familyMember);
    }
    
    public ArrayList<String> getFamilyMembersPhoneNumbers() {
        ArrayList<String> numberDetails = new ArrayList<>();
        for (Contact familyMember : familyMembers) {
            numberDetails.add(familyMember.getForename() + " " + familyMember.getSurname() + ": " + familyMember.getPhoneNumber());
        }
        return numberDetails;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getChiNumber() {
        return chiNumber;
    }

    public void setChiNumber(String chiNumber) throws EmptyValueException {
        if(chiNumber == null || chiNumber.isEmpty())
            throw new EmptyValueException();
        this.chiNumber = chiNumber;
    }
}