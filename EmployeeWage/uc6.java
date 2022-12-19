#! bin/bash


public class uc_6 {
    public static final int is_part_time = 1;
    public static final int is_full_time_emp = 2;
    public static final int EMP_RATE_PER_HOUR  = 20;
    public static final int num_of_working_days = 2;
    public static final int max_hrs_in_month = 100;


    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int emp_total_wage = 0;
        int total_working_days = 0;
        int totalemphrs = 0;

        while (totalemphrs<max_hrs_in_month &&
                total_working_days<num_of_working_days){
            total_working_days++;
            int empcheck = (int) Math.floor(Math.random()* 10) % 3;
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
            totalemphrs +=empHrs;
            empWage = empHrs * EMP_RATE_PER_HOUR;
            emp_total_wage += empWage;
            System.out.println("emp wage " + empWage);

        }
        System.out.println("emp wage" + emp_total_wage);
    }


}

