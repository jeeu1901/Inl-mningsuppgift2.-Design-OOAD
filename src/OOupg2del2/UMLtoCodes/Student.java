package OOupg2del2.UMLtoCodes;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Attendance> attendanceList;

    public Student(String name) {
        this.name = name;
        attendanceList = new ArrayList<>();
    }

    public List<Seminar> getSeminarAttended() {
        return null;
    }

    public String getName() {
        return name;
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void attendSeminar(Attendance attendance) {
        attendanceList.add(attendance);
    }

}
