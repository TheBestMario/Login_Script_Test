import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    Profile testProfile = new Profile("test", "test123");

    @Test
    void setLoggedIn() {
        testProfile.setLoggedIn(true);
        assertTrue(testProfile.isLoggedIn());
    }

    @Test
    void isLoggedIn() {
        testProfile.setLoggedIn(true);
        assertTrue(testProfile.isLoggedIn());
    }


    @Test
    void getUsername() {
        assertEquals("test", testProfile.getUsername());
    }

    @Test
    void getProfileArray() {

    }

    @Test
    void checkPassword() {
        assertTrue(testProfile.checkPassword("test123"));
    }

    @Test
    void checkUsername() {
        Profile.addProfile(testProfile);
        assertTrue(Profile.checkUsername("test"));
    }

    @Test
    void addProfile() {
        Profile.addProfile(testProfile);
        assertEquals(testProfile, Profile.getProfile("test"));
    }
}