//Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что в во входной
//        структуре будут повторяющиеся имена с разными телефонами,
//        их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Book phoneBook = new Book();

        phoneBook.addContact("Иванов Иван", "+375331234567");
        phoneBook.addContact("Иванов Иван", "+375291234567");
        phoneBook.addContact("Петр Петров", "+375256541237");
        phoneBook.addContact("Федор Федоров", "+375254263471");
        phoneBook.addContact("Петр Петров", "+375334263471");
        phoneBook.addContact("Иванов Иван", "+375291234569");

        List<String> sortedContacts = phoneBook.sortContactsByPhones();

        System.out.println("Вывод списка по убыванию количества телефонных номеров");

        for (String contact : sortedContacts) { // Вывод отсортированных записей книги

            System.out.println(contact);

        }

    }
}
