import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		User user = new User(); 
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
		String ID = "aea5";
		assertTrue(user.setUserID(ID)); 
	}

	@Test 
	public void testBadUserID() {
		String ID = "";
		assertFalse(user.setUserID(ID)); 
	}

	@Test
	public void testSuccessfulLogin() {
		String username = "aea5";
		String password = "password123";
		assertTrue(user.login(username, password));
	}

	@Test
	public void testBadLogin() {
		String username = "fakeUser2002";
		String password = "iLoveClemson";
		assertFalse(user.login(username, password));
	}

	@Test 
	public void testSuccessulLogout() {
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