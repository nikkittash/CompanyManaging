public interface Employee extends Comparable<Employee> {
    int getMonthSalary();
    void info();

    void setCompany(Company company);

    String getPosition();

    int getStaffId();

    @Override
    public default int compareTo(Employee employee) {
        if (getMonthSalary() > employee.getMonthSalary()) {
            return - 1;
        }
        if (getMonthSalary() < employee.getMonthSalary()) {
            return 1;
        }
        return 0;
    }
}


