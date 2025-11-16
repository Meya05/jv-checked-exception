package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are too short.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " has been saved to the database!!!");
    }
}
