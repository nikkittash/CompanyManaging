import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
///////////// Проверяем создание экземпляров всех видов сотрудников
        Company company = new Company();
        System.out.println("Profit - " + company.getIncome());
        Operator operator = new Operator(company);
        Manager manager = new Manager(company);
        TopManage topManage = new TopManage(company);
///////////// Проверяем методы найма и удаления сотрудников, а также работу других скрытых методов
        System.out.println("Staff count: " + company.getEmployees().size());
        company.hire(operator);
        System.out.println(operator.getMonthSalary());
        company.hire(manager);
        System.out.println(manager.getMonthSalary());
        company.hire(topManage);
        System.out.println(topManage.getMonthSalary());
        System.out.println("Staff count: " + company.getEmployees().size());
        System.out.println("Profit - " + company.getIncome());

        company.fire(operator);
        System.out.println("Staff count: " + company.getEmployees().size());
        company.fire(manager);
        company.fire(topManage);
        System.out.println("Staff count: " + company.getEmployees().size());
///////////// Проверяем метод найма необходимого количества сотрудников списком
        ArrayList<Employee> operatorArrayList = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            operatorArrayList.add(new Operator(company));
        }
        company.hireAll(operatorArrayList);
        System.out.println("Staff count: " + company.getEmployees().size());

        ArrayList<Employee> managerArrayList = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            managerArrayList.add(new Manager(company));
        }
        company.hireAll(managerArrayList);
        System.out.println("Staff count: " + company.getEmployees().size());
        System.out.println("Profit - " + company.getIncome());

        ArrayList<Employee> topManagerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            topManagerArrayList.add(new TopManage(company));
        }
        company.hireAll(topManagerArrayList);
        System.out.println("Staff count: " + company.getEmployees().size());
///////////// Проверяем работу методов вывода списка лучших и худших зарплат
        company.getTopSalaryStaff(15);
        company.getLowestSalaryStaff(30);
///////////// Увольняем 50 % сотрудников
        int countStaffToFire = company.getEmployees().size()/2;
        for (int i = 0; i < countStaffToFire; i++) {
            company.fire(company.getEmployees().get(company.getEmployees().size() - 1));
        }
        System.out.println("Staff count: " + company.getEmployees().size());
///////////// Проверяем работу методов вывода списка лучших и худших зарплат
        company.getTopSalaryStaff(15);
        company.getLowestSalaryStaff(30);
    }
}
