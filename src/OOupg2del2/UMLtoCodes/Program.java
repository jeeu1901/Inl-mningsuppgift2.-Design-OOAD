package OOupg2del2.UMLtoCodes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private List<Seminar> seminarList;
    private ProgramCoordinator programCoordinator;

    public Program(String name, ProgramCoordinator programCoordinator) {
        this.name = name;
        this.programCoordinator = programCoordinator;
        seminarList = new ArrayList<>();
    }

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        for(Seminar s: seminarList) {
            for(Attendance attendance: s.getAttendanceList()) {
                if(!studentList.contains(attendance.getStudent())) {
                    studentList.add(attendance.getStudent());
                }
            }
        }
        return studentList;
    }

    public List<Seminar> getSeminarList() {
        return seminarList;
    }

    public void addSeminar(Seminar seminar) {
        this.seminarList.add(seminar);
    }


    @Override
    public String toString() {
        return this.name;
    }

    public ProgramCoordinator getProgramCoordinator() {
        return programCoordinator;
    }
}
