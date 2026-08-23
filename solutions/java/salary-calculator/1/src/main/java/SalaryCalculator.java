public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped > 4 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold > 19 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold > 19 ? (double) productsSold * 13 : (double) productsSold * 10;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double bs = daysSkipped > 4 ? 1000 * 0.85 : 1000;
        double ps = productsSold > 19 ? productsSold * 13 : productsSold * 10;
        return (bs + ps) > 2000 ? 2000 : (bs + ps) ;
    } 
}
