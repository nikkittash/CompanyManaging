import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    private int profit;
    protected ArrayList<Employee> employees;

    public Company() {
        this.profit = 0;
        this.employees = new ArrayList<>();
    }

    protected ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    protected int getIncome() {
        return this.profit;
    }

    protected void setIncome(Integer money) {
        this.profit += money;
    }

    public void hire(Employee employee) {
        this.employees.add(employee);
        employee.setCompany(this);
        System.out.println(employee.getPosition() + " - " + employee.getStaffId() + " accepted successfully!");
    }

    public void hireAll(ArrayList<Employee> listForHire) {
        this.employees.addAll(listForHire);
        for(Employee employee : listForHire) {
            employee.setCompany(this);
        }
        System.out.println(listForHire.size() + " employees accepted successfully!");
    }

    public void fire(Employee employee) {
        if (this.employees.size() > 0) {
            this.employees.remove(employees.size() - 1);
            employee.setCompany(null);
            System.out.println("Employee was successfully dismissed!");
        } else {
            System.out.println("No more employees!");
        }
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        if (getEmployees().size() > count && count > 0) {
            Collections.sort(getEmployees());
            for (int n = 0; n < count; n++) {
                System.out.println(n + " - " + getEmployees().get(n).getMonthSalary());
            }
        } else {
            System.out.println("The number of employees is noy so large!");
        }
        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        if (getEmployees().size() > count && count > 0) {
            Collections.sort(getEmployees());
            for (int n = 0; n < count; n++) {
                System.out.println(n + " - " + getEmployees().get(getEmployees().size() - n - 1).getMonthSalary());
            }
        } else {
            System.out.println("The number of employees is noy so large!");
        }
        return null;
    }
}
