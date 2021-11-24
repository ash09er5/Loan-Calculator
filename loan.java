public class loan {
    private double annualInterestRate;
    private double numberOfYears;
    private double loanAmount;
    private String loanDate;

    loan(){
        annualInterestRate=.025;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = "";
    }
    loan(double a, double b, double c, String d){
        annualInterestRate = a;
        numberOfYears = b;
        loanAmount = c;
        loanDate = d;
    }
    public void setAnnualIntrestrate(double a){
        annualInterestRate = a;
    }
    public void setnumberOfYears(double a){
        numberOfYears = a;
    }
    public void setLoanAmount(double a){
        loanAmount = a;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public String getLoanDate() {
        return loanDate;
    }
    public double getNumberOfYears() {
        return numberOfYears;
    }
    public double getTotalPayment(){
        double p = loanAmount;
       return p*Math.pow(1+annualInterestRate/12,numberOfYears * 12);
         
    }
    public double getMonthlyPayment(){
        double p;
        p=loanAmount;
        double totalPayment;
        totalPayment=p*Math.pow(1+annualInterestRate/12,numberOfYears * 12);
        
        return totalPayment/(numberOfYears*12);
        
    }
}
