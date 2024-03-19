package javafiles;

public class LegalGuardian {
    private String firstName;
    private String lastName;
    private String relationshipToStudent;
    private boolean permission;

    // Constructor
    public LegalGuardian(String firstName, String lastName, String relationshipToStudent, boolean permission) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationshipToStudent = relationshipToStudent;
        this.permission = permission;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRelationshipToStudent() {
        return relationshipToStudent;
    }

    public boolean getHasPermission() {
        return permission;
    }

    public void setRelationshipToStudent(String relationship) {
        this.relationshipToStudent = relationship;
    }

    public void setHasPermission(boolean permission) {
        this.permission = permission;
    }
}
