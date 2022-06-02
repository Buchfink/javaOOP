package com.javaoo.students;

import java.util.ArrayList;
import java.util.Arrays;

public class FresherDriver {

    public static void main (String[] args) {
        Fresher[] myFresher = new Fresher[5];
        Integer [] notes1 = {1,2,3};
        Integer [] notes2 = {5,4,3};
        Integer [] notes3 = {5,4,2};
        Integer [] notes4 = {5,4,4};
        Integer [] notes5 = {5,4,5};

        myFresher[0] = new Fresher(123, "Antony", "Smith", 1995, "Biology", notes1);
        myFresher[1] = new Fresher(124, "Elisabeth","North",1999,"Chemistry",notes2 );
        myFresher[2] = new Fresher(125, "George","Cure",2000,"Math",notes3 );
        myFresher[3] = new Fresher(126, "Harry","Galant",2001,"Math",notes4 );
        myFresher[4] = new Fresher(127, "Mary","Lockerty",1998,"Math",notes5 );

        Integer sumTreshold = 11;
        System.out.println("Notes Sum > " + sumTreshold);
        Integer sum=0;
        for(Fresher s: myFresher){
            sum=0;
            for(Integer n:s.getNotes()){
                sum = sum+n;
            }
            if(sum >sumTreshold){
                System.out.println(s);
            }
        }
        System.out.println("Notes less than 3 ");

        for(Fresher s: myFresher) {
            for (Integer n : s.getNotes()) {
                if (n < 3) {
                    System.out.println(s);
                    break;
                }
            }
        }
        ///print sorted by sum
        System.out.println("Print sorted by notes sum");
        Arrays.sort(myFresher);
        for (Fresher s: myFresher){
                System.out.println(s);
        }
        ///print sorted by sum
        System.out.println("Print sorted by notes sum");
        for(int i=0; i<3;i++){
            System.out.println(myFresher[i]);
        }
    }
}
