#! /bin/bash


public class part_time_Emp_uc_3 {
    public static void main(String[] args) {

        //constant

        int is_part_time = 1;
        int is_full_time_emp = 2;
        int EMP_RATE_PER_HOUR  = 20;

        //variable
        int empHrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == is_full_time_emp)
            empHrs = 8;
        else if (empcheck == is_part_time)

            empHrs = 4;
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("empwage:" + empwage);
    }
}
