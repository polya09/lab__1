package com.company;

import java.time.LocalDate;

public class Worker {
    String surname;
    String position;
    LocalDate date_of_singing_the_contract;
    LocalDate validity;
    int salary;


    public Worker(String surname, String position, LocalDate date_of_singing_the_contract, LocalDate validity, int salary ) {
        this.surname = surname;
        this.position = position;
        this.date_of_singing_the_contract = date_of_singing_the_contract;
        this.validity = validity;
        this.salary=salary;
    }

    public String toString() {
        return "The contract expired in 5 days:"
                + surname + " " + position + " " + date_of_singing_the_contract + " " + validity + " " + salary;
    }
}
