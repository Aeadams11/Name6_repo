import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    private Course testCourse;

    @BeforeEach
    void setUp() {
        testCourse = new Course("uuid", "TEST", "101", "Test Course", "Description", 3.0, null, null, null);
    }

    @Test
    @DisplayName("Score converts correctly to letter grade")
    void scoreToLetterGrade() {
        assertEquals('A', new Grade(testCourse, 95).getGrade(), "Score of 95 should result in an A grade");
        assertEquals('B', new Grade(testCourse, 85).getGrade(), "Score of 85 should result in a B grade");
        assertEquals('C', new Grade(testCourse, 75).getGrade(), "Score of 75 should result in a C grade");
        assertEquals('D', new Grade(testCourse, 65).getGrade(), "Score of 65 should result in a D grade");
        assertEquals('F', new Grade(testCourse, 55).getGrade(), "Score of 55 should result in an F grade");
    }

    @Test
    @DisplayName("Score correctly determines GPA value based on grade")
    void scoreToGpaPoints() {
        assertEquals(4.0, new Grade(testCourse, 95).getGradeValue(), 0.01,
                "Score of 95 should result in 4.0 GPA points");
        assertEquals(3.0, new Grade(testCourse, 85).getGradeValue(), 0.01,
                "Score of 85 should result in 3.0 GPA points");
        assertEquals(2.0, new Grade(testCourse, 75).getGradeValue(), 0.01,
                "Score of 75 should result in 2.0 GPA points");
        assertEquals(1.0, new Grade(testCourse, 65).getGradeValue(), 0.01,
                "Score of 65 should result in 1.0 GPA points");
        assertEquals(0.0, new Grade(testCourse, 55).getGradeValue(), 0.01,
                "Score of 55 should result in 0.0 GPA points");
    }
}