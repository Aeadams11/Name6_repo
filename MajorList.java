import java.util.ArrayList;

public class MajorList {
    private static MajorList instance;
    private ArrayList<Major> majors;

    private MajorList() {
        majors = new ArrayList<>();
        // Initialize your list with Major objects here, if needed
    }

    public static MajorList getInstance() {
        if (instance == null) {
            instance = new MajorList();
        }
        return instance;
    }

    // Method to get majors based on a keyword without using stream
    public ArrayList<Major> getMajor(String keyword) {
        ArrayList<Major> filteredMajors = new ArrayList<>();
        for (Major major : majors) {
            // Assuming Major has a getName method or similar to get the major's name
            if (major.getName().toLowerCase().contains(keyword.toLowerCase())) {
                filteredMajors.add(major);
            }
        }
        return filteredMajors;
    }
}
