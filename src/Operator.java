public class Operator extends Staff implements Employee {

    public Operator(Company company) {
        super(company);
        this.position = "Operator";
    }

    @Override
    public void info() {
        System.out.println("The Operator of the company receives a fixed salary.");
    }

    @Override
    public int getMonthSalary() {
        return this.monthSalary;
    }
}
