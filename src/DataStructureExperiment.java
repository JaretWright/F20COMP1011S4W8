import Models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DataStructureExperiment {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("This is a String");
        arrayList.add(new Student(10001,"Fred","Flintstone"));
        arrayList.add(1918);

        for (Object object: arrayList)
            System.out.println(object.getClass());

        Student st1 = new Student(10001,"Fred","Flintstone");
        Student st2 = new Student(10002,"Barney","Rubble");
        Student st3 = new Student(10003,"Wilma","Flintstone");
        Student st4 = new Student(10004,"Betty","Rubble");

        ArrayList<String> arrayListSt = new ArrayList<>();
        arrayListSt.add(st1.toString());
        arrayListSt.add(st2.toString());
        arrayListSt.add(st3.toString());
        arrayListSt.add(st4.toString());

        System.out.println("A list of String's (that look like students)");
        for (String string:arrayListSt)
            System.out.println(string);

        ArrayList<Student> studentAL = new ArrayList<>();
        studentAL.add(st1);
        studentAL.addAll(Arrays.asList(st2, st3, st4));
//        studentAL.add(st1);
//
//        studentAL.remove(st1);

        System.out.println("\nA list of student objects");
        for (Student student:studentAL)
            System.out.println(student + " hashcode: " + student.hashCode());

        HashSet studentHS = new HashSet();
        studentHS.addAll(studentAL);
        studentHS.add(st1);
        Student st5 = new Student(10001,"Fred","Flintstone");
        studentHS.add(st5);

    }
}
