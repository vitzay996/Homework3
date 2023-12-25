import menu.Menu;
import menu.MenuAction;
import menu.action.AddContactMenuAction;
import menu.action.ReadAllContactsMenuAction;
import menu.action.RemoveContactMenuAction;
import menu.action.SearchContactMenuAction;
import models.Contact;
import services.ContactsService;
import services.InMemoryContactsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<MenuAction> actions = new ArrayList<>();

        ArrayList<Contact> contactsList = new ArrayList<>();

        ContactsService service = new InMemoryContactsService(contactsList);

        Menu menu = new Menu(scanner, actions);
        menu.addAction(new AddContactMenuAction(scanner, service));
        menu.addAction(new ReadAllContactsMenuAction(scanner, service));
        menu.addAction(new RemoveContactMenuAction(scanner, service));
        menu.addAction(new SearchContactMenuAction(scanner, service));

        menu.run();
    }
}