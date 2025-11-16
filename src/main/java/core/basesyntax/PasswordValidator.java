package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        String combinedPassword = password + repeatPassword;

        if (combinedPassword.length() < 10) {
            // Zmienione z "Błędne hasło" na "Invalid password"
            throw new PasswordValidationException("Invalid password");
        }
    }
}
