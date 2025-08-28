public class RegistrationService {
    public static void registerUser(String password, String confirmpassword) {
        try {
            PasswordValidator.validate(password, confirmpassword);
        } catch (WeakPasswordException | PasswordMismatchException e) {
           throw e;
        }
    }
}
