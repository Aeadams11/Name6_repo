import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentListTester {
    @BeforeClass
	public void oneTimeSetup() {
		
	}
	
	@AfterClass
	public void oneTimeTearDown() {
		
	}
	
	@BeforeEach
	public void setup() {
		//runs before each test
		//create instance of StudentList
        StudentList list = new StudentList();
	}
	
	@AfterEach
	public void tearDown() {
		//runs after each test
	}

    @Test
    public void testHaveUserSuccess() {
        String userID = "aea5";
        assertTrue(list.haveUser(userID));
    }

    @Test
    public void testHaveUserFailure() {
        String userID = "nope";
        assertFalse(list.haveUser(userID));
    }

    @Test
    public void testGetUserSuccess() {
        // fill in actual info for student
        Student student = new Student(null, null, null, null, null, null, null, null, null, null, false, null)
        Student tester = list.getUser("aea5");
        assertSame(student, tester);
    }
    @Test
    public void testGetUserFail() {
        // fill in actual info for student
        Student student = new Student(null, null, null, null, null, null, null, null, null, null, false, null)
        Student tester = list.getUser("wrong");
        assertNotSame(student, tester);
    }

    // how to test removal? 
    @Test
    public void testRemoveUserSuccess() {
        
    }
    @Test
    public void testRemoveUserFail() {

    }
}
