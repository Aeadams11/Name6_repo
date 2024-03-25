import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTester {
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
    public void testGoodEmailFormat() {
        Student user = new Student("aea5", "Anna", "Adams", "aea5@email.sc.edu", "password123", null, null, null, null, null, true, null); 
        String email = "aea5@email.sc.edu";
        assertTrue(user.setEmail(email));
    }

    @Test
    public void testBadEmailFormat() {
        Student user = new Student("aea5", "Anna", "Adams", null, "password123", null, null, null, null, null, true, null); 
        String email = "aeadams11@gmail.com";
        assertFalse(user.setEmail(email));
    }

    @Test
    public void checkSetMajorTrue() {
        Student user = new Student("aea5", "Anna", "Adams", "aea5@email.sc.edu", "password123", null, null, null, null, null, true, null); 
        String major = "Biology";
        assertTrue(user.setMajor(major)); 
    }
    @Test
    public void testSetMajorFalse() {
        Student user = new Student("aea5", "Anna", "Adams", "aea5@email.sc.edu", "password123", null, null, null, null, null, true, null); 
        String major = "Recess";
        assertFalse(user.setMajor(major)); 
    }

    @Test
    public void testAppAreaSuccess() {

    }

    @Test 
    public void testAppAreaFail() {

    }
}
