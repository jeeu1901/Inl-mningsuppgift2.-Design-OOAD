package OOupg2del2.UMLtoCodes;

public class Subject {
    private String name;
    private Seminar seminar;

    public Subject(String name, Seminar seminar) {
        this.name = name;
        this.seminar = seminar;
        this.seminar.addSubject(this);
    }

    public String getName() {
        return name;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public String viewSubjectInfo(Seminar seminar) {
        for(Subject subject: seminar.getSubject()) {
            return subject.name;
        }
        return null;
    }
}
