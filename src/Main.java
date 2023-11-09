import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        task1();
        nameCheck("Sidorov Vadim");
    }

    public static void task1() {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ivanov Vasiliy", "+7 918 433-56-89");
        phoneBook.put("Sidorov Vadim", "+7 918 578-36-28");
        phoneBook.put("Petrov Maksim", "+7 918 835-14-04");
        phoneBook.put("Denisov Radislav", "+7 918 823-54-15");

        System.out.println(phoneBook.get("Ivanov Vasiliy"));
        System.out.println(phoneBook.get("Sidorov Vadim"));
        System.out.println(phoneBook.get("Petrov Maksim"));

        phoneBook.remove("Denisov Radislav");

        System.out.println(phoneBook.get("Denisov Radislav"));

        Map<Employee, Employee> employeeMap = new HashMap<>();
        employeeMap.put(new Employee("Ivanov", "7 923 546 78 91"));
        employeeMap.put("Petrov", new Employee("Vasiliy"));

        if (employeeMap.containsKey("Ivanov")) {
            System.out.println(employeeMap.get("Ivanov"));
        } else {
            System.out.println("Контакт не найден");
        }
    }
    public static void nameCheck(String key) {
        System.out.println("nameCheck");
        Map<String, String> phoneBook = new HashMap<>();
        if (phoneBook.containsKey(key)) {
            System.out.println(phoneBook.get(key));
        } else {
            System.out.println("Контакт не найден");
        }
    }
}