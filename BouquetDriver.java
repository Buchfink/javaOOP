package com.javaoo.Flowers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BouquetDriver {

    public static void main(String[] args) {
        BouquetItem[] b1 = new BouquetItem[7];
        b1[0] = new NotFlower(1.0);
        b1[1] = new NotFlower(3.0);
        b1[2] = new Flower(1, 45, "Rose red",10.0);
        b1[3] = new Flower(1, 50, "Rose white",15.0);
        b1[4] = new Flower(2, 40, "Rose pink",13.0);
        b1[5] = new Flower(0, 15, "Dasie white",7.0);
        b1[6] = new Flower(5, 10, "Dasie yellow",6.0);

        System.out.println("Bouquet price = ");
        Double sum=0.0;
        for(BouquetItem n: b1){
            sum = sum + n.getPrice();
        }
        System.out.println(sum);

        Integer maxLength=0;
        List<Flower> fList = new ArrayList<>();
        for(BouquetItem n: b1){
            if(n instanceof Flower) {
                Flower f = (Flower) n;
                fList.add(f);
                if(((Flower) n).getLeng()>maxLength){
                    maxLength = ((Flower) n).getLeng();
                }
            }
        }
        System.out.println("max length = " + maxLength);

        System.out.println("Length in between 10 and 30 (strictly)");
        for (Flower f: fList){
            if(30> f.getLeng()){
                if(f.getLeng()>10){
                    System.out.println(f);
                }
            }
        }
        System.out.println("Sorted by freshness:");
        Collections.sort(fList,(a,b) -> {return a.getFreshness().compareTo(b.getFreshness());});
        for (Flower f: fList){
                    System.out.println(f);
        }
        System.out.println("Sorted by length:");
        Collections.sort(fList,(a,b) -> {return a.getLeng().compareTo(b.getLeng());});
        for (Flower f: fList){
            System.out.println(f);
        }
        //Collections.sort(fList, new SortByLength());
    }
}
