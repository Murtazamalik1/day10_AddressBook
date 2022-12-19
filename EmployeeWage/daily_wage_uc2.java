#! /bin/bash


public class daily_wage_uc2 {
    public static void main(String[] args) {

         //constant
        int is_full_time_emp = 1;
        int EMP_RATE_PER_HOUR  = 20;

        //variable
        int empHrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck==is_full_time_emp)
            empHrs=8;
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("empwage:" + empwage);

    }
}
