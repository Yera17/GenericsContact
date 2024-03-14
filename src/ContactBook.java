import java.util.ArrayList;
import java.util.List;

public class ContactBook<T extends Contact> {
    List<T> contacts = new ArrayList<>();
    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        // Выведите на экран весь список контактов книги
        for(T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                return;
            }
        }
        // Если контакт не найден, выведите соответсвующее сообщение
        System.out.println("Не найден контакт с указанным именем.");
    }
}
