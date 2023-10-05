package SRP;

public class Salary {
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
