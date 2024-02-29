import java.util.ArrayList;

public class Major {
    private String majorName;
    private int requiredCredits;
    private ArrayList<Course> coreCourses;
    private ArrayList<Course> electiveCourses;

    public Major(String majorName, int requiredCredits) {
        this.majorName = majorName;
        this.requiredCredits = requiredCredits;
        this.coreCourses = new ArrayList<Course>();
        this.electiveCourses = new ArrayList<Course>();
    }

    public String getMajorName() {
        return majorName;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public ArrayList<Course> getCoreCourses() {
        return coreCourses;
    }

    public ArrayList<Course> getElectiveCourses() {
        return electiveCourses;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public void setRequiredCredits(int requiredCredits) {
        this.requiredCredits = requiredCredits;
    }

    public void setCoreCourses(ArrayList<Course> coreCourses) {
        this.coreCourses = coreCourses;
    }

    public void setElectiveCourses(ArrayList<Course> electiveCourses) {
        this.electiveCourses = electiveCourses;
    }
}
