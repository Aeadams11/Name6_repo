import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter {

    private ArrayList<User> users;
    private ArrayList<Course> courses;

    public DataWriter(ArrayList<User> users, ArrayList<Course> courses) {
        this.users = users;
        this.courses = courses;
    }

    public void saveToFile() {
        saveStudentsToFile("students.json");
        saveAdminsToFile("faculty.json");
        saveCoursesToFile("courses.json");
    }

    @SuppressWarnings("unchecked")
    private void saveStudentsToFile(String fileName) {
        JSONArray jsonStudents = new JSONArray();
        for (User user : users) {
            if (user instanceof Student) {
                jsonStudents.add(getStudentJSON((Student) user));
            }
        }

        writeToFile(jsonStudents.toJSONString(), fileName);
    }

    @SuppressWarnings("unchecked")
    private void saveAdminsToFile(String fileName) {
        JSONArray jsonAdmins = new JSONArray();
        for (User user : users) {
            if (user instanceof Admin) {
                jsonAdmins.add(getAdminJSON((Admin) user));
            }
        }

        writeToFile(jsonAdmins.toJSONString(), fileName);
    }

    @SuppressWarnings("unchecked")
    private void saveCoursesToFile(String fileName) {
        JSONArray jsonCourses = new JSONArray();
        for (Course course : courses) {
            jsonCourses.add(getCourseJSON(course));
        }

        writeToFile(jsonCourses.toJSONString(), fileName);
    }

    @SuppressWarnings("unchecked")
    private JSONObject getStudentJSON(Student student) {
        JSONObject studentDetails = new JSONObject();
        studentDetails.put("uscID", student.getUserID());
        studentDetails.put("firstName", student.getFirstName());
        studentDetails.put("lastName", student.getLastName());
        studentDetails.put("username", student.getStudentID());
        studentDetails.put("password", student.getPassword());
        studentDetails.put("email", student.getEmail());
        studentDetails.put("major", student.getmajor());
        studentDetails.put("type", student.getUserType().toString());

        return studentDetails;
    }

    @SuppressWarnings("unchecked")
    private JSONObject getAdminJSON(Admin admin) {
        JSONObject adminDetails = new JSONObject();
        adminDetails.put("facultyId", admin.getUserID());
        adminDetails.put("firstName", admin.getFirstName());
        adminDetails.put("lastName", admin.getLastName());
        adminDetails.put("email", admin.getEmail());
        adminDetails.put("type", admin.getUserType().toString());
        // Additional admin-specific fields here

        return adminDetails;
    }

    @SuppressWarnings("unchecked")
    private JSONObject getCourseJSON(Course course) {
        JSONObject courseDetails = new JSONObject();
        courseDetails.put("uuid", course.getUuid());
        courseDetails.put("subject", course.getSubject());
        courseDetails.put("number", course.getNumber());
        courseDetails.put("name", course.getName());
        courseDetails.put("description", course.getDescription());
        courseDetails.put("credit_hours", course.getCreditHours());
        courseDetails.put("semesters", course.getSemesters());

        return courseDetails;
    }

    private void writeToFile(String jsonText, String fileName) {
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(jsonText);
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException("Error while saving to file: " + fileName, e);
        }
    }
}