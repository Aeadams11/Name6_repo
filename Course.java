import java.util.List;
import java.util.Map;

public class Course {
    private String uuid;
    private String subject;
    private String number;
    private String name;
    private String description;
    private double creditHours;
    private List<String> semesters;
    private List<Map<String, Object>> prerequisites;
    private List<Map<String, Object>> corequisites;

    public Course(String uuid, String subject, String number, String name, String description,
            double creditHours, List<String> semesters, List<Map<String, Object>> prerequisites,
            List<Map<String, Object>> corequisites) {
        this.uuid = uuid;
        this.subject = subject;
        this.number = number;
        this.name = name;
        this.description = description;
        this.creditHours = creditHours;
        this.semesters = semesters;
        this.prerequisites = prerequisites;
        this.corequisites = corequisites;
    }

    public String getUuid() {
        return uuid;
    }

    public String getSubject() {
        return subject;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public List<String> getSemesters() {
        return semesters;
    }

    public List<Map<String, Object>> getPrerequisites() {
        return prerequisites;
    }

    public List<Map<String, Object>> getCorequisites() {
        return corequisites;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public void setSemesters(List<String> semesters) {
        this.semesters = semesters;
    }

    public void setPrerequisites(List<Map<String, Object>> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setCorequisites(List<Map<String, Object>> corequisites) {
        this.corequisites = corequisites;
    }

    public String toString() {
        String fullName = subject + number + ": " + name;
        return fullName;
    }
}