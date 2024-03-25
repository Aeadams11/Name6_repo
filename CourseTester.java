import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseTester {

    private Course course;

    @BeforeEach
    void setUp() {

        course = new Course("e53c6dfc-fdeb-458e-a2b3-a7d076dfbb77", "Introduction to Managerial Accounting",
                "User-oriented approach to the study of managerial accounting topics related to business decisions. CL: 2020.",
                "Dr. John Doe", "Tuesdays and Thursdays, 10:00 - 11:30", 3, "SPRING");
        course.addPrerequisite("145a02ba-0a74-4eb3-87fb-8c3ecf91f240");
    }

    @Test
    @DisplayName("Course properties initialized correctly")
    void testCoursePropertiesInitialization() {
        assertEquals("e53c6dfc-fdeb-458e-a2b3-a7d076dfbb77", course.getCourseID());
        assertEquals("Introduction to Managerial Accounting", course.getCourseName());
        assertEquals(3, course.getCreditHours());
        assertEquals("SPRING", course.getSemester());

    }

    @Test
    @DisplayName("Prerequisites added and retrieved correctly")
    void testPrerequisitesHandling() {
        Map<String, List<String>> prereqs = course.getPreReqs();
        assertTrue(prereqs.containsKey("e53c6dfc-fdeb-458e-a2b3-a7d076dfbb77"));
        assertTrue(
                prereqs.get("e53c6dfc-fdeb-458e-a2b3-a7d076dfbb77").contains("145a02ba-0a74-4eb3-87fb-8c3ecf91f240"));
    }

}
