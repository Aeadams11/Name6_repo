public class CourseList {
    private static CourseList instance;
    private ArrayList<Course> courses;

    private CourseList() {
        courses = new ArrayList<>();
    }

    public static CourseList getInstance() {
        if (instance == null) {
            instance = new CourseList();
        }
        return instance;
    }

    public ArrayList<Course> getCourses(String keyword) {
        // Implementation here
    }
}
