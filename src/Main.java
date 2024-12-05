import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //making test profiles saved.
        Profile.getProfileArray()[0] = new Profile("Luigi", "fakeman123");
        Profile.getProfileArray()[1] = new Admin("MarioG", "QwErTy123");
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        Profile currentLogin = null;

        while (currentLogin == null) {
            System.out.println("""
                    Login Menu
                    Enter Username:""");

            username = scanner.nextLine();
            if (username.isBlank()) {
                System.out.println("Username cannot be empty or only have spaces");
                continue;
            }

            System.out.println("Enter Password:");
            password = scanner.nextLine();
            if (password.isBlank()) {
                System.out.println("password cannot be empty or only have spaces");
                continue;
            }

            Profile attemptedLogin = new Profile(username, password);
            boolean profileExists = Profile.checkUsername(username);
            Profile profile = Profile.getProfile(username);
            //check if profile exists
            if (!profileExists) {
                System.out.println("""
                        Creating new profile...
                        """);
                currentLogin = new Profile(username, password);
                currentLogin.setLoggedIn(true);
                //adds profile to the last index of the array
                //realistically would add to the last empty index
                Profile.addProfile(currentLogin);

            }else if (profileExists && profile.checkPassword(password)) {
                currentLogin = Profile.getProfile(attemptedLogin.getUsername());
                currentLogin.setLoggedIn(true);
           }else
               System.out.println("""
                        The username and password combination is incorrect.
                        Please use correct details or use a new unique username.
                        """);


        }
        currentLogin.welcomeMessage();

    }
}
