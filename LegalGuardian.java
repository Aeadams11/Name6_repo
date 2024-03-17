public class LegalGuardian extends Student {
    public LegalGuardian(String userID, String firstName, String lastName, String email, String password,
            boolean permission) {
        super(userID, firstName, lastName, email, password, permission);
    }

    private String firstName;
    private String lastName;
    //private String relationshipToStudent;
    private boolean permission;

    public String getFirstName() {
        return this.firstName; 
    }       

    public String getLastName() {
        return this.lastName;
    }

    // public String getRelationshipToStudent() {
    //     this feels unecessary
    // }

    public boolean getHasPermission() {
        //return true if student has permission
        return true;
    }

    // public void setRelationshipToStudent(String relationship) {
    //     // Implementation
    // }

    //i feel like we dont need this. if they dont have permission then they dont have, shouldnt need to change
    // public void setHasPermission(boolean permission) {
    //     // Implementation
    // }
}
