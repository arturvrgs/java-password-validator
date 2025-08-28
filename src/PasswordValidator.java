public class PasswordValidator {
    public static void validate(String password, String confirmpassword) throws PasswordMismatchException, WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("The password must have at least 8 characters");
        }

        if(password.length() > 20) {
            throw new WeakPasswordException("Your password must not exceed 20 characters");
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;

        String specialChars = "!@#$%¨&*()";

        for(char digit : password.toCharArray()) {
            if(Character.isUpperCase(digit)) hasUpperCase = true;
            if(Character.isLowerCase(digit)) hasLowerCase = true;
            if(specialChars.indexOf(digit) >= 0) hasSpecialChar = true;
        }

        if(!hasUpperCase) throw new WeakPasswordException("The password must have at least one upper-case char.");
        if(!hasLowerCase) throw new WeakPasswordException("The password must have at least one lower-case char.");
        if(!hasSpecialChar) throw new WeakPasswordException("The password must have at least one special char.");

        if(!password.equals(confirmpassword)) throw new PasswordMismatchException("Passwords do not match.");
    }
}
