package com.company;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    static Plate[] plate = new Plate[3];
    static Worker[] worker = new Worker[3];
    public static void main(String[] args) {
        int max_edition = 10000;

        plate[0] = new Plate("TheWeekend", "Electronic", "After Hours", 1000 );
        plate[1] = new Plate("PinkFloyd", "Electronic", "After Hours", 4500000 );
        plate[2] = new Plate("TheBeatles", "Electronic", "After Hours", 4500 );

        for (int i = 0; i < plate.length; i++) {
            if(plate[i].edition > max_edition){
                System.out.println(plate[i]);
            }
        }
        LocalDate today = LocalDate.now();
// worker[0] = new Worker("Ivanov", "HR", 1/3/2020, 1/3/2021, 15000 );

    }
}