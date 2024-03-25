import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class DataWriterTest {
    private static final String STUDENTS_FILE = "lib/Tawnee.json";
    private static final String FACULTY_FILE = "lib/Prof.json";
    private static final String COURSES_FILE = "lib/TestCourse.json";

    @BeforeEach
    void setUp() throws Exception {
        Files.deleteIfExists(Paths.get(STUDENTS_FILE));
        Files.deleteIfExists(Paths.get(FACULTY_FILE));
        Files.deleteIfExists(Paths.get(COURSES_FILE));
    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(STUDENTS_FILE));
        Files.deleteIfExists(Paths.get(FACULTY_FILE));
        Files.deleteIfExists(Paths.get(COURSES_FILE));
    }

    @Test
    void testSaveToFile() throws Exception {
        ArrayList<User> users = new ArrayList<>();
        users.add(new Student("id1", "John", "Doe", "john@example.com", "pass123", "Computer Science", "advisor1",
                new ArrayList<>(), new ArrayList<>(), new String[] { "A", "B" }, false, User.UserType.STUDENT));
        users.add(new Admin("id2", "Jane", "Doe", "jane@example.com", "pass123", true, User.UserType.ADMIN));
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("CS101", "Intro to CS", "Description here", "Dr. Smith", "MW 9-10:30", 3, "Spring"));
        DataWriter dataWriter = new DataWriter(users, courses);
        dataWriter.saveToFile();
        JSONParser parser = new JSONParser();
        JSONArray studentsJSON = (JSONArray) parser.parse(new FileReader(STUDENTS_FILE));
        assertEquals(1, studentsJSON.size());
        JSONArray facultyJSON = (JSONArray) parser.parse(new FileReader(FACULTY_FILE));
        assertEquals(1, facultyJSON.size());
        JSONArray coursesJSON = (JSONArray) parser.parse(new FileReader(COURSES_FILE));
        assertEquals(1, coursesJSON.size());
    }
}
