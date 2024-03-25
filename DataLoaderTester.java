import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DataLoaderTester {

    @Mock
    private FileReader mockFileReader;
    @Mock
    private JSONParser mockJsonParser;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetStudents() throws Exception {
        JSONArray studentsJSON = new JSONArray();
        JSONObject studentJSON = new JSONObject();
        studentJSON.put("uscID", "58469d67-e0d7-4c75-a86d-a31d08af789b");
        studentJSON.put("firstName", "Brax");
        studentJSON.put("lastName", "West");
        studentJSON.put("username", "bwest");
        studentJSON.put("email", "bwest@email.sc.edu");
        studentJSON.put("major", "CS");
        studentJSON.put("advisorId", "6594b968-f276-4223-9372-e90773efbac6");
        JSONArray coursesTaken = new JSONArray();
        coursesTaken.add("12224407-e656-4fe7-9078-88f1d9dc8325");
        // Add more course IDs...
        studentJSON.put("coursesTaken", coursesTaken);
        JSONArray currentCourses = new JSONArray();
        currentCourses.add("CSCE311");
        // Add more current courses...
        studentJSON.put("currentSemesterCourses", currentCourses);
        JSONArray grades = new JSONArray();
        grades.add("A");
        // Add more grades...
        studentJSON.put("grade", grades);

        studentsJSON.add(studentJSON);

        when(mockJsonParser.parse(any(FileReader.class))).thenReturn(studentsJSON);

        ArrayList<User> students = DataLoader.getStudents("students.json");
        assertEquals(1, students.size());
        Student student = (Student) students.get(0);
        assertEquals("58469d67-e0d7-4c75-a86d-a31d08af789b", student.getUscID());
        assertEquals("Brax", student.getFirstName());
        // Assert other fields and nested structures...
    }

    @Test
    public void testGetFaculty() throws Exception {
        JSONArray facultyJSON = new JSONArray();
        JSONObject facultyMemberJSON = new JSONObject();
        facultyMemberJSON.put("facultyId", "67890");
        facultyMemberJSON.put("firstName", "Alice");
        facultyMemberJSON.put("lastName", "Smith");
        // Add other necessary fields...
        facultyJSON.add(facultyMemberJSON);

        when(mockJsonParser.parse(any(FileReader.class))).thenReturn(facultyJSON);

        ArrayList<User> faculty = DataLoader.getFaculty();
        assertEquals(1, faculty.size());
        Admin admin = (Admin) faculty.get(0);
        assertEquals("67890", admin.getFacultyId());
        assertEquals("Alice", admin.getFirstName());
        // Assert other fields...
    }

    @Test
    public void testGetCourses() throws Exception {
        JSONArray coursesJSON = new JSONArray();
        JSONObject courseJSON = new JSONObject();
        courseJSON.put("uuid", "554472ab-c7cb-4ac6-bf69-0d8b58a99d3d");
        courseJSON.put("subject", "ACCT");
        courseJSON.put("number", "222");
        courseJSON.put("name", "Survey of Accounting");
        courseJSON.put("description", "Survey of accounting topics...");
        courseJSON.put("credit_hours", "3.000");
        JSONArray semesters = new JSONArray();
        semesters.add("SPRING");
        semesters.add("SUMMER");
        semesters.add("FALL");
        courseJSON.put("semesters", semesters);
        JSONArray prerequisites = new JSONArray();
        JSONObject prerequisite = new JSONObject();
        prerequisite.put("choices", 1);
        JSONArray options = new JSONArray();
        options.add("f8e10b3a-146b-4d43-a3d8-647028c98641");
        prerequisite.put("options", options);
        prerequisite.put("grade", "D");
        prerequisites.add(prerequisite);
        courseJSON.put("prerequisites", prerequisites);
        courseJSON.put("corequisites", new JSONArray());

        coursesJSON.add(courseJSON);

        when(mockJsonParser.parse(any(FileReader.class))).thenReturn(coursesJSON);

        ArrayList<Course> courses = DataLoader.getCourses();
        assertEquals(1, courses.size());
        Course course = courses.get(0);
        assertEquals("554472ab-c7cb-4ac6-bf69-0d8b58a99d3d", course.getUuid());
        assertEquals("ACCT", course.getSubject());
    }
}