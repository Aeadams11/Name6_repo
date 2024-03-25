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
		Student user = new Student(null, null, null, null, null, null, null, null, null, null, false, null); 
	}
	
	@AfterEach
	public void tearDown() {
		//runs after each test
	}

    @Test
    public void testGoodEmailFormat() {
        String email = "aea5@email.sc.edu";
        assertTrue(user.setEmail(email));
    }

    @Test
    public void testBadEmailFormat() {
        String email = "aeadams11@gmail.com";
        assertFalse(user.setEmail(email));
    }

    @Test
    public void checkSetMajorTrue() {
        String major = "Biology";
        assertTrue(user.setMajor(major)); 
    }
    @Test
    public void testSetMajorFalse() {
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
