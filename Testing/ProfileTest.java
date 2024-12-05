import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    Profile testProfile = new Profile("test", "test123");

    @org.junit.jupiter.api.Test
    void setLoggedIn() {
        testProfile.setLoggedIn(true);
        assertTrue(testProfile.isLoggedIn());
    }

    @org.junit.jupiter.api.Test
    void isLoggedIn() {
        testProfile.setLoggedIn(true);
        assertTrue(testProfile.isLoggedIn());
    }


    @org.junit.jupiter.api.Test
    void getUsername() {
        assertEquals("test", testProfile.getUsername());
    }

    @org.junit.jupiter.api.Test
    void getProfileArray() {

    }

    @org.junit.jupiter.api.Test
    void checkPassword() {
        assertTrue(testProfile.checkPassword("test123"));
    }

    @org.junit.jupiter.api.Test
    void checkUsername() {
        Profile.addProfile(testProfile);
        assertTrue(Profile.checkUsername("test"));
    }

    @org.junit.jupiter.api.Test
    void addProfile() {
        Profile.addProfile(testProfile);
        assertEquals(testProfile, Profile.getProfile("test"));
    }
}