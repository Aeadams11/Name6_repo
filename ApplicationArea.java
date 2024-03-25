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
        NONE
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
        this.requiredCourses.add(course);
    }

    public void addOptionalCourse(Course course) {
        // Implementation
        this.optionalCourses.add(course);
    }

    public boolean removeCourse(String courseID) {
        // Implementation
        return true; 
    }
    public static void printApps() {
        //ideally loop through enum but i couldnt figure that out
       System.out.println("BIOINFORMATICS\n"+
        "CLOUD_DEVELOPMENT\n"+
        "GAME\n"+
        "DATA_SCIENCE\n"+
        "CYBER_SECURITY\n"+
        "GIS_DEVELOPMENT\n"+
        "LINGUISTICS\n"+
        "NEW_MEDIA\n"+
        "RISK_INSURANCE\n"+
        "SCIENTIFIC_COMPUTING\n"+
        "AEROSPACE_ENG\n"+
        "ROBOTICS\n"+
        "WEB_DEVELOPMENT");
    }
}
