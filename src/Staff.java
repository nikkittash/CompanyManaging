import java.util.ArrayList;
import java.util.Collections;

public abstract class Staff implements Employee {
    private int salary = 50000 + (int) (Math.random() * 10000);
    protected int monthSalary;
    private int staffId = 0;
    protected String position;
    protected Company company;

    public Staff(Company company) {
        setCompany(company);
        setStaffId();
        this.monthSalary = salary;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return this.position;
    }

    public int getStaffId() {
        return this.staffId;
    }

    private void setStaffId() {
        this.staffId += 1;
    }

    protected int getSalary() {
        return this.salary;
    }

//    @Override
//    public int compareTo(Staff employee) {
//        if (getMonthSalary() > employee.getMonthSalary()) {
//            return - 1;
//        }
//        if (getMonthSalary() < employee.getMonthSalary()) {
//            return 1;
//        }
//        return 0;
//    }
}
