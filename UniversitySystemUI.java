import java.util.Scanner; 

public class UniversitySystemUI {
    public static final String WELCOME = "Welcome!";
    private Scanner scanner; 
    private UniversitySystemFACADE facade;

    UniversitySystemUI(){
        scanner = new Scanner(System.in);
        facade = new UniversitySystemFACADE();
    }

    public void run() {
        System.out.println(WELCOME);
        //loop through menu options
    }

    public static void main(String[] args) {
        UniversitySystemUI uniInterface = new UniversitySystemUI();
        uniInterface.run();
    }
    
}
