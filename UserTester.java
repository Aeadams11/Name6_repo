import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import User.UserType;

class UserTester {
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

	// testing methods: 
	// assertEquals(val1, val2) : these two things will be equal
	// assertFalse(val)
	// assertTrue(val)
	// assertSame(va1, val2) : uses ==
	// assertNotSame(val1, val2) 
	// assertNull(val)
	// assertNotNull(val)

    @Test
	public void testGoodUserID() {
		User user = new User("aea5", "anna", "adams", "aea5@email.sc.edu", "password123", true, User.UserType.STUDENT);
		String ID = "aea5";
		assertTrue(user.setUserID(ID)); 
	}

	@Test 
	public void testBadUserID() {
		User user = new User("aea5", "anna", "adams", "aea5@email.sc.edu", "password123", true, User.UserType.STUDENT);
		String ID = "";
		assertFalse(user.setUserID(ID)); 
	}

	@Test
	public void testSuccessfulLogin() {
		User user = new User("aea5", "anna", "adams", "aea5@email.sc.edu", "password123", true, User.UserType.STUDENT);
		String username = "aea5";
		String password = "password123";
		assertTrue(user.login(username, password));
	}

	@Test
	public void testBadLogin() {
		User user = new User("aea5", "anna", "adams", "aea5@email.sc.edu", "password123", true, User.UserType.STUDENT);
		String username = "fakeUser2002";
		String password = "iLoveClemson";
		assertFalse(user.login(username, password));
	}

	@Test 
	public void testSuccessulLogout() {
		User user = new User("aea5", "anna", "adams", "aea5@email.sc.edu", "password123", true, User.UserType.STUDENT);
		assertTrue(user.logout());
	}

	@Test
	public void testUnsuccessfulLogout() {
		//how would a logout be unsuccessful?
	}

	@Test
	public void testSuccessfulForgotPassword() {

	}

	@Test
	public void testUnsuccessfulForgotPassword() {
		
	}
}