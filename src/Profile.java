public class Profile {
    private String username;
    private String password;

    private boolean loggedIn = false;
    private static Profile[] profiles = new Profile[10];
    public Profile(String username, String password) {
        this.username = username;
        this.password = password;

    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }

    public Profile(String username){
        this(username, null);
    }

    public void welcomeMessage(){
        System.out.println("Successful login, "+ username);
    }

    public String getUsername() {
        return username;
    }

    //for the sake of testing, we use this method to set some profiles
    public static Profile[] getProfileArray() {
        return profiles;
    }
    public static void addProfile(Profile profile){
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i] == null) {
                profiles[i] = profile;
                break;
            }
        }
    }

    public boolean checkPassword(String password){
        if (this.password == null) {
            return false;
        }
        return this.password.equals(password);
    }
    public static boolean checkUsername(String username){
        for (Profile profile : profiles) {
            if (profile != null && profile.username.equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    public static Profile getProfile(String username){
        for (Profile profile : profiles) {
            if (profile != null && profile.username.equalsIgnoreCase(username)) {
                return profile;
            }
        }
        return null;
    }

}

