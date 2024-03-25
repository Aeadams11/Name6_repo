import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataLoaderTester {

    private final String testStudentsFilePath = "lib/Tawnee.JSON";
    private final String testCoursesFilePath = "lib/TestCourse.json";

    @Test
    public void testGetStudents() {
        ArrayList<User> students = DataLoader.getStudents(testStudentsFilePath);
        assertNotNull(students, "Students list should not be null");
        assertEquals(1, students.size(), "Should load exactly one student from the test data");
        Student student = (Student) students.get(0);
        assertEquals("28469d67-e0d7-4c75-a86d-a31d08af789a", student.getUserID(), "USC ID should match the JSON data");
        assertEquals("Tawne", student.getFirstName(), "First name should match the JSON data");
        assertEquals("Hill", student.getLastName(), "Last name should match the JSON data");
        assertEquals("THill@email.sc.edu", student.getEmail(), "Email should match the JSON data");
        assertEquals("CIS", student.getmajor(), "Major should match the JSON data");
        student.setAdvisorNotes("Excellent progress this semester.");
        assertEquals("Excellent progress this semester.", student.getAdvisorNotes(),
                "Advisor notes should match the given note");
        student.setAge(20);
        assertEquals(20, student.getAge(), "Age should match set value");
        student.setName("Tawne", "Hill");
        assertEquals("TawneHill", student.getName(), "Full name should match the concatenated set values");

    }

    public void testGetCourses() {

        ArrayList<Course> courses = DataLoader.getCourses();
        assertNotNull(courses, "Courses list should not be null");
        assertFalse(courses.isEmpty(), "Courses list should not be empty");
        assertTrue(courses.size() > 0, "Should have at least one course loaded");
        Course course = courses.get(0);
        assertEquals("e53c6dfc-fdeb-458e-a2b3-a7d076dfbb77", course.getCourseID(),
                "Course ID should match the JSON data");
        assertEquals("Introduction to Managerial Accounting", course.getCourseName(),
                "Course name should match the JSON data");
        assertEquals(
                "User-oriented approach to the study of managerial accounting topics related to business decisions.   CL: 2020.",
                course.getDescription(), "Description should match the JSON data");
        assertEquals(3, course.getCreditHours(), "Credit hours should match the JSON data");
        assertNotEquals("", course.getInstructor(), "Instructor should not be empty");
        assertNotEquals("", course.getMeetingTime(), "Meeting time should not be empty");
        assertTrue(Arrays.asList("SPRING", "SUMMER", "FALL").contains(course.getSemester()),
                "Semester should be one of the expected values");
        assertFalse(course.getPreReqs().isEmpty() || course.getCoreReqs().isEmpty(),
                "PreReqs and CoreReqs should not be empty");
        assertTrue(course.getPreReqs().containsKey(course.getCourseID()),
                "Course should have prerequisites listed under its ID");
        assertTrue(course.getCoreReqs().containsKey(course.getCourseID()),
                "Course should have corequisites listed under its ID");
    }

    @Test
    public void testParseRequirements() {
        JSONArray requirementsJSON = new JSONArray();
        JSONObject requirement1 = new JSONObject();
        requirement1.put("choices", 1);
        requirement1.put("grade", "A");

        JSONArray options1 = new JSONArray();
        options1.add("MATH141");
        options1.add("PHYS201");
        requirement1.put("options", options1);

        requirementsJSON.add(requirement1);

        List<Map<String, Object>> requirements = new ArrayList<>();

        DataLoader.parseRequirements(requirementsJSON, requirements);

        assertFalse(requirements.isEmpty(), "Requirements list should not be empty");
        assertEquals(1, requirements.size(), "There should be one requirement parsed");

        Map<String, Object> parsedRequirement = requirements.get(0);
        assertEquals(1, parsedRequirement.get("choices"), "The 'choices' value should match the input");
        assertEquals("A", parsedRequirement.get("grade"), "The 'grade' value should match the input");

        @SuppressWarnings("unchecked")
        List<String> parsedOptions = (List<String>) parsedRequirement.get("options");
        assertEquals(2, parsedOptions.size(), "There should be two options parsed");
        assertTrue(parsedOptions.contains("MATH141") && parsedOptions.contains("PHYS201"),
                "Options should include 'MATH141' and 'PHYS201'");
    }

}
