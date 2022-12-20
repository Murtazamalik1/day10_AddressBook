package day10;

public class CompanyEmpWage_Uc10 {

    private final String company;
    private final int EmpRatePerHours;
    private final int numberOfWorkingDays;
    private final int maxHourPerMonth;
    private int totalEmpWage;

    public CompanyEmpWage_Uc10(String company, int empRatePerHours, int numberOfWorkingDays, int maxHourPerMonth, int totalEmpWage) {
        this.company = company;
        this.EmpRatePerHours = empRatePerHours;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return " total employee wage for company :" + company + "is :" + totalEmpWage;
    }


    public class EmpWageBuilderArray {

        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany = 0;

        private CompanyEmpWage_Uc10[] companyEmpWageArrays;

        public EmpWageBuilderArray() {
            companyEmpWageArrays = new CompanyEmpWage_Uc10[5];
        }

        private void addCompanyEmpWage(String company, int empRatePerMonth, int numberOfWorkingDays, int maxHrsPerMonth) {
            companyEmpWageArrays[numberOfWorkingDays] = new CompanyEmpWage_Uc10(company, EmpRatePerHours, numberOfWorkingDays, maxHrsPerMonth, empRatePerMonth);

            numberOfWorkingDays++;
        }

        private void ComputeEmpWage() {
            for (int i = 0; i < numberOfWorkingDays; i++) {
                companyEmpWageArrays[i].setTotalEmpWage(this.ComputeEmpWage(companyEmpWageArrays[i]));
                System.out.println(companyEmpWageArrays[i]);
            }
        }

        private int computeEmpWage(CompanyEmpWage_Uc10 companyEmpWage_uc10) {
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

            while (totalEmpHrs <= companyEmpWage_uc10.maxHourPerMonth && totalWorkingDays < companyEmpWage_uc10.numberOfWorkingDays) {

                totalWorkingDays++;

                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;

                }

                totalEmpHrs += empHrs;
                System.out.println("day#:" + totalWorkingDays+ "is:" + "enp hrs" + empHrs);
            }
            return totalEmpHrs * companyEmpWage_uc10.maxHourPerMonth;
        }

        public static void main(String[] args) {
            EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
            empWageBuilderArray.addCompanyEmpWage("AVI", 30,9,6);
            empWageBuilderArray.ComputeEmpWage();
        }
    }
}