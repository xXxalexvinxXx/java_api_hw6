import java.util.*;



public class Book {

    private HashMap<String, TreeSet<String>> phoneBook;



    public Book() {

        phoneBook = new HashMap<>();

    }


//region Добавление контакта в список
    public void addContact(String name, String phoneNumber) {

        TreeSet<String> phones = phoneBook.getOrDefault(name, new TreeSet<>());

        phones.add(phoneNumber);

        phoneBook.put(name, phones);

    }
//endregion

//region Сортированный вывод
    public List<String> sortContactsByPhones() {

        List<Map.Entry<String, TreeSet<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());

        sortedEntries.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());



        List<String> result = new ArrayList<>();

        for (Map.Entry<String, TreeSet<String>> entry : sortedEntries) {

            result.add(entry.getKey() + ": " + entry.getValue());

        }

        return result;

    }
//endregion

}