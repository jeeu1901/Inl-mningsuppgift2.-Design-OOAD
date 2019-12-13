package OOupg2del2.UMLtoCodes;

public class Attendance {
    private boolean attendanceLevel;
    private Student student;
    private Seminar seminar;

    public Attendance() {}

    public Student getStudent() {
        return student;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public boolean isAttendanceLevel() {
        return attendanceLevel;
    }

    public void registerAttendance(Seminar seminar, Student student) {
        this.student = student;
        this.seminar = seminar;
        this.student.attendSeminar(this);
        this.seminar.addAttendance(this);
        this.attendanceLevel = true;
    }
    public void removeAttendance(Seminar seminar, Student student) {
        this.attendanceLevel = false;
    }
}
