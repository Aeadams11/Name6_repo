public class LegalGuardian extends Student {
    private String firstName;
    private String lastName;
    private String relationshipToStudent;
    private boolean permission;

    public LegalGuardian(String userID, String firstName, String lastName, String email, String password,
                         String relationshipToStudent, boolean permission) {
        super(userID, firstName, lastName, email, password, false); 
        this.relationshipToStudent = relationshipToStudent;
        this.permission = permission;
    }

    // Getters and setters
    public String getRelationshipToStudent() {
        return relationshipToStudent;
    }

    public void setRelationshipToStudent(String relationshipToStudent) {
        this.relationshipToStudent = relationshipToStudent;
    }

    public boolean hasPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "LegalGuardian{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", relationshipToStudent='" + relationshipToStudent + '\'' +
                ", permission=" + permission +
                '}';
    }
}
