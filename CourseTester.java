import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseTester {

    private Course course;
    private final String uuid = "e53c6dfc-fdeb-458e-a2b3-a7d076dfbb77";
    private final String subject = "ACCT";
    private final String number = "226";
    private final String name = "Introduction to Managerial Accounting";
    private final String description = "User-oriented approach to the study of managerial accounting topics related to business decisions. CL: 2020.";
    private final double creditHours = 3.000;
    private final List<String> semesters = Arrays.asList("SPRING", "SUMMER", "FALL");
    private List<Map<String, Object>> prerequisites;
    private final List<Map<String, Object>> corequisites = Arrays.asList(); // Empty list for corequisites

    @BeforeEach
    void setUp() {
        Map<String, Object> prerequisiteOption = new HashMap<>();
        prerequisiteOption.put("uuid", "145a02ba-0a74-4eb3-87fb-8c3ecf91f240");

        Map<String, Object> prerequisite = new HashMap<>();
        prerequisite.put("choices", 1);
        prerequisite.put("options", Arrays.asList(prerequisiteOption));
        prerequisite.put("grade", "D");

        prerequisites = Arrays.asList(prerequisite);

        course = new Course(uuid, subject, number, name, description, creditHours, semesters, prerequisites,
                corequisites);
    }

    @Test
    @DisplayName("Constructor should correctly initialize all fields")
    void constructorTester() {
        assertAll(
                () -> assertEquals(uuid, course.getUuid()),
                () -> assertEquals(subject, course.getSubject()),
                () -> assertEquals(number, course.getNumber()),
                () -> assertEquals(name, course.getName()),
                () -> assertEquals(description, course.getDescription()),
                () -> assertEquals(creditHours, course.getCreditHours()),
                () -> assertEquals(semesters, course.getSemesters()),
                () -> assertEquals(prerequisites, course.getPrerequisites()),
                () -> assertEquals(corequisites, course.getCorequisites()));
    }

    @Test
    @DisplayName("toString should return correct name format")
    void toStringTestert() {
        String expected = "ACCT226: Introduction to Managerial Accounting";
        assertEquals(expected, course.toString());
    }

}
