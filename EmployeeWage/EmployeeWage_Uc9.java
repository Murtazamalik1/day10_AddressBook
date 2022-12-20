package day10;

public class EmployeeWage_Uc9 {
    public static final int IS_PART_TIME =1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int EmpRatePerHours;
    private final int numberOfWorkingDays;
    private final int maxHourPerMonth;
    private int totalEmpWage;

    public EmployeeWage_Uc9(String company, int empRatePerHours, int numberOfWorkingDays, int maxHourPerMonth, int totalEmpWage){
        this.company = company;
        this.EmpRatePerHours = empRatePerHours;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;

    }

    public void computeEmpWage(){
        int empHour =0, totalEmpHour = 0, totalWorkingDays = 0; // variables

        while (totalEmpHour <= maxHourPerMonth && totalWorkingDays < numberOfWorkingDays ){

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck){
                case IS_FULL_TIME  :
                    empHour = 8;
                    break;
                case IS_PART_TIME:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;

            }

            totalEmpHour += empHour;

            System.out.println("day#:" + totalWorkingDays+ "is:" + "enp hrs" + empHour);
        }
        totalEmpWage = totalEmpHour * EmpRatePerHours;
    }
    @Override
    public String toString(){
        return  " total employee wage for company :" + company + "is :" + totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage_Uc9 Avi = new EmployeeWage_Uc9("AVI",30,20,4,5);
        EmployeeWage_Uc9 Techno = new EmployeeWage_Uc9("techno",20,3,10,3);

        Avi.computeEmpWage();
        System.out.println(Avi);
        Techno.computeEmpWage();
        System.out.println(Techno);
    }
}
