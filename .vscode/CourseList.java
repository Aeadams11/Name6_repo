package javafiles;


import java.util.ArrayList;

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

    public void addCourse(Course course) {
        courses.add(course);
    }

    public boolean removeCourse(String courseID) {
        for (Course course : courses) {
            if (course.getCourseID().equals(courseID)) {
                courses.remove(course);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Course> getCourses(String keyword) {
        ArrayList<Course> filteredCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.getCourseName().toLowerCase().contains(keyword.toLowerCase())) {
                filteredCourses.add(course);
            }
        }
        return filteredCourses;
    }

    public ArrayList<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }
}
