package com.javaoo.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StudentDriver {

    public static void main (String[] args) {
        Student[] myStudent = new Student[5];

//    Student smith = new Student(123,"Antony","Smith",1995,"Biology","1");
//    Student north = new Student(124, "Elisabeth","North",1999,"Chemistry","1" );
//    Student cure = new Student(125, "George","Cure",2000,"Math","1" );
//    Student Galant = new Student(126, "Harry","Galant",2001,"Math","2" );
//    Student Lockerty= new Student(127, "Mary","Lockerty",1998,"Math","1" );

        myStudent[0] = new Student(123, "Antony", "Smith", 1995, "Biology", "1");
        myStudent[1] = new Student(124, "Elisabeth","North",1999,"Chemistry","2" );
        myStudent[2] = new Student(125, "George","Cure",2000,"Math","1" );
        myStudent[3] = new Student(126, "Harry","Galant",2001,"Math","2" );
        myStudent[4] = new Student(127, "Mary","Lockerty",1998,"Math","1" );

        String facultyToGet = "Math";
        System.out.println(facultyToGet);
        for(Student s: myStudent){
            if(s.getFaculty() == facultyToGet){
                System.out.println(s);
            }
        }
        Integer erToGet = 1998;
        System.out.println("after " + erToGet);
        for(Student s: myStudent){
            if(s.getYearOfBirth() > erToGet){
                System.out.println(s);
            }
        }
        String groupToGet = "1";
        System.out.println(groupToGet);
        for(Student s: myStudent){
            if(s.getGroup() == groupToGet){
                System.out.println(s);
            }
        }

        ArrayList<String> facultyList = new ArrayList<>();
        for(Student s: myStudent){
            if(!facultyList.contains(s.getFaculty())){
                facultyList.add(s.getFaculty());
            }
        }
        System.out.println(facultyList);
        System.out.println("STUDENTS BY FACULTIES:");
        for(String f: facultyList){
            System.out.println(f + ":");
            for (Student s: myStudent){
                if(s.getFaculty() == f){
                    System.out.println(s);
                }
            }
        }

        ArrayList<String> groupList = new ArrayList<>();
        for(Student s: myStudent){
            if(!groupList.contains(s.getGroup())){
                groupList.add(s.getGroup());
            }
        }
        System.out.println(groupList);
        System.out.println("STUDENTS BY GROUPS:");
        for(String f: groupList){
            System.out.println(f + ":");
            for (Student s: myStudent){
                if(s.getGroup() == f){
                    System.out.println(s);
                }
            }
        }

        ///print sorted by Name
        System.out.println("print sorted by Name");
        Arrays.sort(myStudent);
        for (Student s: myStudent){
                System.out.println(s);
        }

        // in the interval
        System.out.println("in the interval");
        System.out.println("between " + 1997);
        for(Student s: myStudent){
            if(2022 > s.getYearOfBirth()){
                if(s.getYearOfBirth() > 1997){
                    System.out.println(s);
            }
        }
        }
    }
}
