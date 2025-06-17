import java.util.ArrayList;
import java.util.Scanner;
class PhoneBookEntry {
    String name;
    String phoneNumber;
    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
class PhoneBook {
    ArrayList<PhoneBookEntry> entries = new ArrayList<>();
    public void addEntry(PhoneBookEntry entry) {
        if (findEntry(entry.getName()) == null) {
            entries.add(entry);
        } else {
            System.out.println("Entry with this name already exists.");
        }
    }
    public PhoneBookEntry findEntry(String name) {
        for (PhoneBookEntry entry : entries) {
            if (entry.getName().equalsIgnoreCase(name)) {
                return entry;
            }
        }
        return null;
    }
    public void removeEntry(String name) {
        boolean removed = entries.removeIf(entry -> entry.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Entry removed successfully.");
        } else {
            System.out.println("No entry found with the name: " + name);
        }
    }
    public void printAllEntries() {
        if (entries.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            for (PhoneBookEntry entry : entries) {
                System.out.println("Name: " + entry.getName() + ", Phone: " + entry.getPhoneNumber());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Entry");
            System.out.println("2. Find Entry");
            System.out.println("3. Remove Entry");
            System.out.println("4. List All Entries");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard invalid input
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addEntry(new PhoneBookEntry(name, phoneNumber));
                    break;
                case 2:
                    System.out.print("Enter name to find: ");
                    String searchName = scanner.nextLine();
                    PhoneBookEntry foundEntry = phoneBook.findEntry(searchName);
                    if (foundEntry != null) {
                        System.out.println("Found: Name: " + foundEntry.getName() + ", Phone: " + foundEntry.getPhoneNumber());
                    } else {
                        System.out.println("Entry not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    phoneBook.removeEntry(removeName);
                    break;
                case 4:
                    phoneBook.printAllEntries();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
