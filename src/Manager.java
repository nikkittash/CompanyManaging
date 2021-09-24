public class Manager extends Staff implements Employee {
    private final int maxMoneyForCompany = 140000;
    private final int minMoneyForCompany = 115000;
    private int difMaxMin;
    private int moneyForCompany;

    public Manager(Company company) {
        super(company);
        this.position = "Manager";
        difMaxMin = maxMoneyForCompany - minMoneyForCompany;
        this.moneyForCompany = (int) ((Math.random() * ++difMaxMin) + minMoneyForCompany);
        this.monthSalary += (int) (0.05 * this.moneyForCompany);
        this.company.setIncome(this.moneyForCompany);
    }

    @Override
    public void info() {
        System.out.println("The Manager of the company receives a fixed salary " +
                "and a bonus of 5% of the profit that he brought to the company.");
    }

    @Override
    public int getMonthSalary() {
        return this.monthSalary;
    }
}
