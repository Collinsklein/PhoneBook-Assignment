package map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Collins", "302-561-7789");

        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook.add("Klein" , "123-456-7890");

        PhoneBook phoneBook2 = new PhoneBook();
        phoneBook.add("Col", "302-561-7799");

        PhoneBook phoneBook3 = new PhoneBook();
        phoneBook.add("Rod", "302-561-7788");

        PhoneBook phoneBook4 = new PhoneBook();
        phoneBook.add("coll" ,"7789");

        PhoneBook phoneBook5 = new PhoneBook();
        phoneBook.addAll("Barack","777","888","911-420", "8888", "911");



        PhoneBook.printTotalNumberOfContactPhoneBook();//Testing out on how to get the total number of contact Phonebooks
        System.out.println(phoneBook.getAllContactNames());
    }
}
