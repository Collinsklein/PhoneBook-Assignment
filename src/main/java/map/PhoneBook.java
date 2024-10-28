package map;

import java.util.*;

public class PhoneBook {
        private final Map<String, List<String>> phonebook;
        public int listOfContacts;
        private static int counter;


        public Map<String, List<String>> getPhonebook() {
            return phonebook;
        }

        public PhoneBook(Map<String, List<String>> map) {
            listOfContacts++;
            counter = listOfContacts;
            this.phonebook = map;
        }

        public PhoneBook() {
            this(new HashMap<>());
        }

        public void add(String name, String phoneNumber) {
            List<String> nums = new ArrayList<>();
            nums.add(phoneNumber);
            phonebook.put(name,nums);
        }

        public void addAll(String name, String... phoneNumbers) {
            phonebook.put(name, Arrays.asList(phoneNumbers));
        }

        public void remove(String name) {
            phonebook.remove(name);
        }

        public Boolean hasEntry(String name) {
            if(phonebook.containsKey(name)){
                return true;
            }else {
                return false;
            }
        }

        public List<String> lookup(String name) {
            phonebook.get(name);
            return phonebook.get(name);
        }

        public String reverseLookup(String phoneNumber)  {
            for(Map.Entry<String, List<String>>entry : getMap().entrySet()) {

                // phonebook.get(phoneNumber);
                if (entry.getValue().contains(phoneNumber)) {
                    return entry.getKey();

                }
            }
            return "not found";
        }

        public List<String> getAllContactNames() {
            List<String> allContacts = new ArrayList<>();
            allContacts.add(phonebook.keySet().toString());
            return allContacts;
        }

        public Map<String, List<String>> getMap() {
            return phonebook;
        }

        public static void printTotalNumberOfContactPhoneBook(){
            System.out.println("Total number of Contacts PhoneBooks is:" + counter);
        }
    }


