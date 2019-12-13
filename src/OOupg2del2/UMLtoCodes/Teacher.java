package OOupg2del2.UMLtoCodes;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private ProgramCoordinator programCoordinator;
    private List<Seminar> seminarList;
    private String name;

    Teacher(String name) {
        this.name = name;
        seminarList = new ArrayList<>();
    }

    public List<Seminar> getSeminarHistory() {
        return seminarList;
    }

    public Seminar getCurrentSeminar() {
        return seminarList.get(0);
    }

    public ProgramCoordinator getProgramCoordinator() {
        return programCoordinator;
    }

    public void setProgramCoordinator(ProgramCoordinator programCoordinator) {
        this.programCoordinator = programCoordinator;
    }

    public List<Seminar> getSeminarList() {
        return seminarList;
    }

    public void addSeminarList(Seminar seminar) {
        seminarList.add(seminar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
