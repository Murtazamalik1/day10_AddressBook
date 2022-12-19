package com.Employee.wage;

public class employeewage {

    public static void main(String[] args) {
        int emp_is_full_time = 1;

        double empcheck = Math.floor(Math.random() * 10)% 2;
        if (empcheck == emp_is_full_time)
            System.out.println("employee is present");
        else {
            System.out.println("employee is not present");
        }
    }
}
