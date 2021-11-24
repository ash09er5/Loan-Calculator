public class loan2 {
    public static void main(String[] args) {
        loan l1 = new loan();

        System.out.println("Loan term is 15 years");
        
        //10 percent of 865,000 is 86,500
        // 865,000 - 86,500 = 778,500
        l1.setAnnualIntrestrate(.052);
        l1.setnumberOfYears(15);
        l1.setLoanAmount(778500);
        System.out.println(l1.getTotalPayment());
        System.out.println(l1.getNumberOfYears());
        System.out.println(l1.getMonthlyPayment());

    }
}
