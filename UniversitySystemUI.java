import java.util.Scanner; 

public class UniversitySystemUI {
    Scanner keyboard = new Scanner(System.in); 
    public static final String WELCOME_MESSAGE = "***** Welcome to the Scheduler3000 *****";
    public static final String CHOOSE = "Please choose from the following options";
    public static String[] loginOptions = {"Create an account", "Log in to a new account"};
    public static String[] studentOptions = {"Generate personal 8 semester plan", "View completed courses", "View unfulfilled requirements", "Browse application areas"};
    public static String[] adminOptions = {"View advisee list", "Search for a student"};
    public static String[] studentAdvisorOptions = {"View completed courses", "View unfulfilled requirements", "View warnings", "Leave a note", "View/Approve Transfer Credits", "Add to advisee list", "Remove from advisee list", "Return to main menu"}; 
    public static String[] guardianOptions = {"guardian options"}; 
    public static String[] accountTypes = {"Student Account", "Administrative Account", "Legal Guardian Account"};

    UniversitySystemUI(){
        //create instances in sprint 2
    }

    public void run(){
        scenario1();
        scenario2();
    }

    public void scenario1(){
        //in sprint 2 we will do switch cases after displaying, but for now we are hardcoding these scenarios
        System.out.println(WELCOME_MESSAGE);
        displayOptions(loginOptions);
        int loginChoice = keyboard.nextInt(); 
        keyboard.nextLine();
        login(); 
        displayOptions(studentOptions); 
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        Student.displayCoursesTaken();
        displayOptions(studentOptions);
        //courses not taken
        //browse application areas
        //select digital design option, pick classes
        //generate and print to text a file for 8 semester plan
    }
    public void scenario2(){
        System.out.println(WELCOME_MESSAGE);
        displayOptions(loginOptions);
        int loginChoice = keyboard.nextInt(); 
        keyboard.nextLine();
        //in future, this will be used to determine login
        displayOptions(accountTypes);
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        //in the future, this will determine usertype
        createAccount(); 
        login(); 
        displayOptions(adminOptions);
        //search student
        int adminChoice = keyboard.nextInt();
        keyboard.nextLine();
        Student student = searchStudent(); 
        //add her as advisee
        displayOptions(studentAdvisorOptions);
        int x = keyboard.nextInt();
        keyboard.nextLine(); 
        Admin.addAdvisee(student.getStudentID());
        //look through current progress
        displayOptions(studentAdvisorOptions);
        int y = keyboard.nextInt();
        keyboard.nextLine();
        student.displayCoursesTaken();
        //add note
        displayOptions(studentAdvisorOptions);
        int z = keyboard.nextInt();
        keyboard.nextLine();
        
    }

    public void displayOptions(String[] options){
        System.out.println(CHOOSE); 
        for(int i = 0; i < options.length; i++){
            int menuItem = i+1;
            System.out.println(menuItem + ". " + options[i]);
        }
    }

    public void createAccount(){
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

        if(StudentList.createUser(username, firstName, lastName, email, password, type))
            System.out.println("Account created. Please login using your USC ID and password.");
    }

    public void login(){
        System.out.println("Enter your username: ");
        String username = keyboard.nextLine();
        System.out.println("Enter your password: ");
        String password = keyboard.nextLine();
        User.login(username, password);
        //System.out.println("Welcome, " + User.getFirstName());
        System.out.println("Welcome!"); 
    }

    public Student searchStudent(){
        System.out.println("Enter the student ID");
        String id = keyboard.nextLine();
        Student student = Admin.searchUser(id);
        System.out.println("Student: "+student.getFirstName()+ " " + student.getLastName()); 
        return student;
    }
    public static void main(String[] args) {
        UniversitySystemUI UniversityInterface = new UniversitySystemUI();
        UniversityInterface.run();
    }
}
