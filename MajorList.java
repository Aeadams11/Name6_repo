import java.util.ArrayList;

public class MajorList {
    private static MajorList instance;
    private ArrayList<Major> majors;

    private MajorList() {
        majors = new ArrayList<>();

    }

    public static MajorList getInstance() {
        if (instance == null) {
            instance = new MajorList();
        }
        return instance;
    }

    public ArrayList<Major> getMajor(String keyword) {
        ArrayList<Major> filteredMajors = new ArrayList<>();
        for (Major major : majors) {
            if (major.getName().toLowerCase().contains(keyword.toLowerCase())) {
                filteredMajors.add(major);
            }
        }
        return filteredMajors;
    }
}
