import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    Profile testProfile = new Profile("test", "test123");

    @Test
    void setLoggedInTrue() {
        testProfile.setLoggedIn(true);
        assertTrue(testProfile.isLoggedIn());
    }
    @Test
    void setLoggedInFalse() {
        testProfile.setLoggedIn(false);
        assertFalse(testProfile.isLoggedIn());
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
    void getProfileArrayLength() {
        System.out.println(Profile.getProfileArray());
        Profile.getProfileArray()[3] = new Profile("test", "testiinngng");
        //length is 10 because of the array size when initialised.
        assertEquals(10, Profile.getProfileArray().length);

    }

    @Test
    void checkPasswordForTheProfile() {
        assertTrue(testProfile.checkPassword("test123"));
    }

    @Test
    void checkUsernameExists() {
        Profile.addProfile(testProfile);
        assertTrue(Profile.checkUsername("test"));
    }

    @Test
    void addProfileWorksByTestingForName() {
        Profile.addProfile(testProfile);
        assertEquals(testProfile.getUsername(), Profile.getProfile("test").getUsername());
    }
}