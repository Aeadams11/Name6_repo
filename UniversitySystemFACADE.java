public class UniversitySystemFACADE {
    private StudentList userList;
    private CourseList courseList; 

    public UniversitySystemFACADE() {
        userList.getInstance();
        courseList.getInstance(); 
      //  this.userList = userList;
    }

    public User login(String USCID, String password) {
        for (User user : userList.getUsers()) { // Assuming getUsers() returns a collection of User objects
            if (user.getUserID().equals(USCID) && user.getPassword().equals(password)) {
                return user; // User found and password matches
            }
        }
        return null; // User not found or password does not match
    }
}
