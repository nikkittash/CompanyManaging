public class TopManage extends Staff implements Employee {

    public TopManage(Company company) {
        super(company);
        this.position = "TopManager";
        if (this.company.getIncome() > 10000000) {
            this.monthSalary = (int) (getSalary() * 2.5);
        }
    }

    @Override
    public void info() {
        System.out.println("The TopManager of the company receives a fixed salary " +
                "and a bonus of 150% of the fixed salary if the profit of the company more then 10 millions.");
    }

    @Override
    public int getMonthSalary() {
        return this.monthSalary;
    }
}
