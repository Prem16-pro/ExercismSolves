public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped > 4 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold > 19 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return (double) productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double bs = 1000 * salaryMultiplier(daysSkipped);
        double ps = bonusForProductsSold(productsSold);
        return (bs + ps) > 2000 ? 2000 : (bs + ps) ;
    } 
}
