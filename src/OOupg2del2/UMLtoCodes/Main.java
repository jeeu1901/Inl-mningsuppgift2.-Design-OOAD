package OOupg2del2.UMLtoCodes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Jessie");
        Student s2 = new Student("Atef");
        Student s3 = new Student("Elenor");
        Student s4 = new Student("Villepille");
        Student s5 = new Student("Fazli");

        Teacher t1 = new Teacher("Robert");
        Teacher t2 = new Teacher("Mahmud");
        Teacher t3 = new Teacher("Sigrun");


        ProgramCoordinator sara = new ProgramCoordinator("Sara");
        Program java19 = new Program("Java19", sara);
        sara.setProgram(java19);
        sara.addTeacher(t1);
        sara.addTeacher(t2);
        sara.addTeacher(t3);

        Seminar l1 = new Seminar("Lektion 1", t1, java19);
        Seminar l2 = new Seminar("Lektion 2", t1, java19);
        Seminar l3 = new Seminar("Lektion 3", t1, java19);
        Seminar l4 = new Seminar("Lektion 4", t2, java19);
        Seminar l5 = new Seminar("Lektion 5", t2, java19);

        Subject subject = new Subject("OOAD", l1);
        t1.addSeminarList(l1);
        t1.addSeminarList(l2);
        t1.addSeminarList(l3);
        t2.addSeminarList(l4);
        t2.addSeminarList(l5);

        java19.addSeminar(l1);
        java19.addSeminar(l2);
        java19.addSeminar(l3);
        java19.addSeminar(l4);
        java19.addSeminar(l5);

        List<Attendance> seminar1attendance = new ArrayList<>() {{
            new Attendance().registerAttendance(l1, s1);
            new Attendance().registerAttendance(l1, s2);
            new Attendance().registerAttendance(l1, s3);
            new Attendance().registerAttendance(l1, s4);
            new Attendance().registerAttendance(l1, s5);
        }};
        List<Attendance> seminar2attendance = new ArrayList<>(){{
            new Attendance().registerAttendance(l2, s1);
            new Attendance().registerAttendance(l2, s2);
            new Attendance().registerAttendance(l2, s3);
            new Attendance().registerAttendance(l2, s4);
            new Attendance().registerAttendance(l2, s5);
        }};
        List<Attendance> seminar3attendance = new ArrayList<>(){{
            new Attendance().registerAttendance(l3, s1);
            new Attendance().registerAttendance(l3, s2);
            new Attendance().registerAttendance(l3, s3);
            new Attendance().registerAttendance(l3, s4);
            new Attendance().registerAttendance(l3, s5);
        }};
        List<Attendance> seminar4attendance = new ArrayList<>(){{
            new Attendance().registerAttendance(l4, s1);
            new Attendance().registerAttendance(l4, s2);
            new Attendance().registerAttendance(l4, s3);
            new Attendance().registerAttendance(l4, s4);
            new Attendance().registerAttendance(l4, s5);
        }};
        List<Attendance> seminar5attendance = new ArrayList<>(){{
            new Attendance().registerAttendance(l5, s1);
            new Attendance().registerAttendance(l5, s2);
            new Attendance().registerAttendance(l5, s3);
            new Attendance().registerAttendance(l5, s4);
            new Attendance().registerAttendance(l5, s5);
        }};

        for(Attendance a: seminar1attendance) {
            l1.addAttendance(a);
        }
        for(Attendance a: seminar2attendance) {
            l2.addAttendance(a);
        }
        for(Attendance a: seminar3attendance) {
            l3.addAttendance(a);
        }
        for(Attendance a: seminar4attendance) {
            l4.addAttendance(a);
        }
        for(Attendance a: seminar5attendance) {
            l5.addAttendance(a);
        }

        //Vilket program en Coordinator ansvarar för?
        System.out.println(sara.getProgram());
    	//Vilka lärare som finns för ett Program?
        System.out.println(sara.getTeacherList());
        //Hur många studenter som finns i ett Program?
        System.out.println(java19.getStudents().size());
	    //Hur man lägger till en ny student till ett Program
        // Se rad 35-85
	    //Vad närvaron är för Student X?
        int index = 0;
        for(Attendance a: s1.getAttendanceList()) {
            if(a.isAttendanceLevel()) {
                index++;
            }
        }
        System.out.println(index + " av 5");
        //Vilka kurser/seminarier som en lärare undervisat i?
        for(Seminar s: t1.getSeminarHistory()) {
            System.out.print(s.getName() + " ");
        }
        System.out.println();
        //Vilka ämnen som undervisats i ett Seminar?
        for(Subject s: l1.getSubject()) {
            System.out.println(s.getName());
        }
        //Närvaron för Seminar X?
        System.out.println(l1.getTotalAttendance());
        //Hur man skapar en ny Attendance?
        // Se rad 35-85 :)



    }

}
