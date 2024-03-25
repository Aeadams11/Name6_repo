import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminTester {
    @BeforeClass
	public void oneTimeSetup() {
		
	}
	
	@AfterClass
	public void oneTimeTearDown() {
		
	}
	
	@BeforeEach
	public void setup() {
		//runs before each test
		//create instance of user
	}
	
	@AfterEach
	public void tearDown() {
		//runs after each test
	}

    @Test
    public void testSuccessfulAdd() {
        Student student = new Student("aea5", "Anna", "Adams", null, null, null, null, null, null, null, false, null);
        Admin advisor = new Admin(null, null, null, null, null, false, null);
        assertTrue(advisor.addAdvisee("aea5"));
    }

    @Test
    public void testBadAdd() {
        Admin advisor = new Admin(null, null, null, null, null, false, null);
        assertFalse(advisor.addAdvisee("fakeID1234"));
    }

    @Test
    public void testSearchUserSuccess() {
        String userID = "aea5";
        Admin advisor = new Admin(userID, userID, userID, userID, userID, false, null);
        assertNotNull(advisor.searchUser(userID));
    }

    @Test
    public void testSearchUserFail() {
        String userID = "fakeUser123";
        Admin advisor = new Admin(userID, userID, userID, userID, userID, false, null);
        assertNull(advisor.searchUser(userID));
    }
}