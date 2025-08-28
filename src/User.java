import java.util.Scanner;

public class User {

    public void register() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scan.nextLine();
        System.out.println("Confirm your password");
        String confirmPassword = scan.nextLine();

        RegistrationService.registerUser(password, confirmPassword);
        System.out.println("User registered!");
    }
}
