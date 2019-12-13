package OOupg2del2.UMLtoCodes;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {
    private String name;
    private Program program;
    private List<Teacher> teacherList;

    public ProgramCoordinator(String name) {
        teacherList = new ArrayList<>();
        this.name = name;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void addTeacher(Teacher t) {
        teacherList.add(t);
    }

    public String getName() {
        return name;
    }

    public Program getProgram() {
        return program;
    }

    public String getTeacherList() {
        String teachers = "";
        for(Teacher t: teacherList) {
            teachers += t.getName() + " ";
        }
        return teachers;
    }

    public Teacher findTeacher(String name) {
        for(Teacher t: teacherList) {
            if(t.getName().equalsIgnoreCase(name)) {
                return t;
            }
            else {
                System.out.println("NO TEACHER FOUND");
            }
        }
        return null;
    }
}