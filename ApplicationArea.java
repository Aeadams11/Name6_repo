import java.util.ArrayList;

public class ApplicationArea {
    private String areaName;
    private ArrayList<Course> requiredCourses;
    private ArrayList<Course> optionalCourses;
    
    enum Areas {
        BIOINFORMATICS,
        CLOUD_DEVELOPMENT,
        GAME,
        DATA_SCIENCE,
        CYBER_SECURITY,
        GIS_DEVELOPMENT,
        LINGUISTICS,
        NEW_MEDIA,
        RISK_INSURANCE,
        SCIENTIFIC_COMPUTING,
        AEROSPACE_ENG,
        ROBOTICS,
        WEB_DEVELOPMENT,
        OTHER
    }

    public ArrayList<Course> listCourses() {
        // Implementation
        return null;
    }

    public String getAreaDescription() {
        // Implementation
        return "description"; 
    }

    public void addRequiredCourse(Course course) {
        // Implementation
    }

    public void addOptionalCourse(Course course) {
        // Implementation
    }

    public boolean removeCourse(String courseID) {
        // Implementation
        return true; 
    }
}
