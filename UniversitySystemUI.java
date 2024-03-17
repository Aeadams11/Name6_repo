import java.util.Scanner;

public class UniversitySystemUI {
    public static final String WELCOME = "Welcome to the Program!";
    private Scanner keyboard;
    private UniversitySystemFACADE facade;

    public UniversitySystemUI() {
        keyboard = new Scanner(System.in);
        facade = new UniversitySystemFACADE();
    }

    public void run() {
        System.out.println(WELCOME);
        while (true) {
            login();
            // Add your menu options and logic here
        }
    }

    public void displayMenu() {
        System.out.println("Please choose from the options below");
        // Display menu options
    }

    public void login() {
        System.out.println("Enter username:");
        String userName = keyboard.nextLine();
        System.out.println("Enter your password:");
        String passWord = keyboard.nextLine();
        User user = facade.login(userName, passWord);
        if (user != null) {
            System.out.println("Login successful. Welcome, " + user.getFirstName() + "!");
            // Add logic for menu options after successful login
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    public static void main(String[] args) {
        UniversitySystemUI uniInterface = new UniversitySystemUI();
        uniInterface.run();
    }
}
