#! /bin/bash

public class Refactor_Emp_wage_uc7 {
    public static final int is_part_time = 1;
    public static final int is_full_time_emp = 2;
    public static final int EMP_RATE_PER_HOUR  = 20;
    public static final int num_of_working_days = 2;
    public static final int max_hrs_in_month = 100;
    public static int computeEmpwage() {

        int empHrs = 0;
        int total_working_days = 0;
        int totalEmphrs = 0;
        while (totalEmphrs < max_hrs_in_month &&
                total_working_days < num_of_working_days) {
            total_working_days++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case is_full_time_emp:
                    empHrs = 8;
                    break;
                case is_part_time:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmphrs +=empHrs;
            System.out.println(total_working_days+""+"emp hours"+empHrs);
        }
        int totalempwage = totalEmphrs * EMP_RATE_PER_HOUR;
        System.out.println("total emp wage :" + totalempwage);
        return totalempwage;
    }

    public static void main(String[] args) {
        computeEmpwage();
    }
}


