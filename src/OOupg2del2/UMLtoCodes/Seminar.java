package OOupg2del2.UMLtoCodes;

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    private String name;
    private Teacher teacher;
    private Program program;
    private List<Attendance> attendanceList;
    private List<Subject> subjectList;

    public Seminar(String name, Teacher teacher, Program program) throws Exception {
        this.name = name;
        this.teacher = teacher;
        this.program = program;
        this.attendanceList = new ArrayList<>();
        this.subjectList = new ArrayList<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Program getProgram() {
        return program;
    }

    public int getTotalAttendance() {
        int index = 0;
        for(Attendance attendance: attendanceList) {
            if(attendance.isAttendanceLevel()){
                index++;
            }
        }
        return index;
    }

    public void addAttendance(Attendance attendance) {
        this.attendanceList.add(attendance);
    }

    public String getName() {
        return name;
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }
    public List<Subject> getSubject() {
        return subjectList;
    }
}
