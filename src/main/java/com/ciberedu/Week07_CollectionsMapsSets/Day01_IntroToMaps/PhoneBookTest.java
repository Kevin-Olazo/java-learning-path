package com.ciberedu.Week07_CollectionsMapsSets.Day01_IntroToMaps;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Kevin", "98763");
        phoneBook.addContact("Daniel", "1325");
        phoneBook.addContact("Jose", "7845");
        phoneBook.addContact("Maria", "55555");

        System.out.println(phoneBook.findPhoneNumber("sd"));
//        phoneBook.removeContact("Kevin");

        phoneBook.printAllContacts();
    }

}
