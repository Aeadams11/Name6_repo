import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApplicationAreaTester {
    
    @BeforeClass
	public void oneTimeSetup() {
		
	}
	
	@AfterClass
	public void oneTimeTearDown() {
		
	}
	
	@BeforeEach
	public void setup() {
		//runs before each test
	}
	
	@AfterEach
	public void tearDown() {
    }
    @Test
    public void testAddRequiredCourse() {
        Major major = new Major("Computer Science", null, null);
        Course course = new Course("2e2ebf3f-c4d3-4dae-956b-d8afa7fca627", "CSCE", null, null, null, 0, null);
        major.addRequiredCourse(course);

        ArrayList<Course> requiredCourses = major.getRequiredCourses();
        assertEquals(1, requiredCourses.size());
        assertEquals(course, requiredCourses.get(0));
    }
    @Test
    public void testAddOptionalCourse() {
        Major major = new Major("Computer Science", null, null);
        Course course = new Course("0ac7ca78-5ead-4438-ba85-3e0259eed7a8", "CSCE", "204", "Program Design and Development", null, 0, null);
        major.addElectiveCourse(course);

        ArrayList<Course> electiveCourses = major.getElectiveCourses();
        assertEquals(1, electiveCourses.size());
        assertEquals(course, electiveCourses.get(0));
    }
}

    
