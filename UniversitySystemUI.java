import java.util.Scanner; 

public class UniversitySystemUI {
    public static final String WELCOME = "Welcome to the Program!";
    //alter below for our menu options
    private String[] mainMenuOptionsStudent = {"fjfdjfd","Checkout Item","Rate an Item","Pay a Fine","Logout"};
    private String[] mainMenuOptionsAdmin = {"fjfdjfd","Checkout Item","Rate an Item","Pay a Fine","Logout"};

    private Scanner keyboard; 
    private UniversitySystemFACADE facade;

    UniversitySystemUI(){
        keyboard = new Scanner(System.in);
        facade = new UniversitySystemFACADE();
    }

    public void run() {
        System.out.println(WELCOME);
        //loop through menu options
        while(true) {
            login();
            displayMenu();


            switch(userCommand){
                case(0):
                    break;
                case(1):

            }
        }
        //if they do not have an exisiting account, tell them to reach out to their advisor
    }

    public void displayMenu() {
        System.out.println("Please choose from the options below");

    }
    public void login() {
       
        System.out.println("Enter username"); 
        String userName = keyboard.nextLine();
        // check username
        System.out.println("Enter your password");
        String passWord = keyboard.nextLine();
        //check password
    }


    public static void main(String[] args) {
        UniversitySystemUI uniInterface = new UniversitySystemUI();
        uniInterface.run();
    }
    
}
