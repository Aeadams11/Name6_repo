import java.util.Scanner; 

public class UISimple {
    //private Library library;
    Scanner keyboard = new Scanner(System.in); 

    UISimple(){
        //library = new library;
    }

    public void run(){
        scenario1();
        scenario2();
    }

    public void scenario1(){
        System.out.println("Welcome to the Scheduler3000!");
        System.out.println("Would you like to create an account or log in to an existing account? ");
        System.out.println("1. Create new account");
        System.out.println("2. Log in to existing account");
        int login = keyboard.nextInt(); 
        keyboard.nextLine();
        System.out.println("Enter your username: ");
        String username = keyboard.nextLine();
        System.out.println("Enter your password: ");
        String password = keyboard.nextLine();
        User.login(username, password);
        System.out.println("Welcome, Brax.");
        System.out.println("Please choose an action from the following options:");
        System.out.println("1. Generate your personal 8 semester plan \n 2. View completed courses \n 3. View uncompleted courses \n 4. Choose Application Area"); 

    }
    public void scenario2(){
        System.out.println("Welcome to the Scheduler3000!");
        System.out.println("Would you like to create an account or log in to an existing account? ");
        System.out.println("1. Create new account");
        System.out.println("2. Log in to existing account");
        int login = keyboard.nextInt();
        keyboard.nextLine();
        //in future, this will be used to determine login
        System.out.println("Are you creating a (1)Student Account, (2)Administration Account, or (3)Legal Guardian Account: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        //in the future, this will determine usertype
        User.UserType type = User.UserType.ADMIN; 
        System.out.println("Enter your USC ID: ");
        String username = keyboard.nextLine();
        System.out.println("Create your password: ");
        String password = keyboard.nextLine();
        System.out.println("Enter your first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = keyboard.nextLine();
        System.out.println("Enter your email: ");
        String email = keyboard.nextLine();    
        UserList.createUser(username, firstName, lastName, email, password, type);   
        System.out.println("Account created. Please login using your USC ID and password.");
        System.out.println("Enter your username: ");
        String loginUsername = keyboard.nextLine();
        System.out.println("Enter your password: ");
        String loginPassword = keyboard.nextLine();
        User.login(loginUsername, loginPassword);
    }
    

    public static void main(String[] args) {
        UISimple UniversityInterface = new UISimple();
        UniversityInterface.run();
    }
}
