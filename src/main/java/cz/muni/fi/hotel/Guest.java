package cz.muni.fi.hotel;

import java.util.Calendar;

/**
 * Created by Adam on 05.03.14.
 */
public class Guest {

    private int id;
    private String firstName;
    private String surname;
    private Calendar dateOfBirth;
    private String phoneNumber;
    private String address;

    public Guest(int id, String firstName, String surname, Calendar dateOfBirth, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + "; " +
                firstName + " " +
                surname + "; " +
                dateOfBirthToString() + "; " +
                phoneNumber + "; " +
                address;
    }

    private String dateOfBirthToString() {
        int day = dateOfBirth.get(Calendar.DAY_OF_MONTH);
        int month = dateOfBirth.get(Calendar.MONTH);
        int year = dateOfBirth.get(Calendar.YEAR);

        return day + "." + month + "." + year;
    }
}
