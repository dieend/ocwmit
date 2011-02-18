package lab1;

class FinancialCalc {

    public static void main(String[] args) {
        double principal = 1000.00; // $1000 initial investment
        double interestRate = 0.035; // 3.5% interest rate
        int numOfYears = 7; // investment length is 7 years

        double finalValue = 0.0;
        finalValue = principal * Math.pow((1 + interestRate), numOfYears);

        System.out.println("Investing $" + principal
                + " at an interest rate of " + (interestRate * 100) + "%"
                + " for " + numOfYears + " years"
                + " will have a final worth of $" + computeFinalValue(principal,interestRate,numOfYears));
        
        interestRate = 0.05;
        finalValue = 1000;
        numOfYears = 4;
        System.out.println("The amount of money you should invest today (at an interest rate of "+interestRate*100
        		+ "%) to have amount of $" + finalValue +" at the end of 4 years is " + 
        		computePrincipal(finalValue,interestRate,numOfYears));
        principal = 500;
        finalValue = 525;
        numOfYears = 3;
        System.out.println("The interest rate you need to turn an initial investment of $" + principal
        		+ " into $" + finalValue + " at the end of " + numOfYears + " years is " 
        		+ computeInterestRate(finalValue, principal, numOfYears));
        
        interestRate = 0.05;
        finalValue = 1000;
        numOfYears = 4;
        
    }
    
    static double computeFinalValue(double principal,
                                    double interestRate,
                                    int numOfYears) {
      return (principal * Math.pow((1 + interestRate), numOfYears));
    }
    
    static double computePrincipal(double finalValue,
                                   double interestRate,
                                   int numOfYears) {
        return (finalValue/Math.pow((1+interestRate), numOfYears));
    }

    static double computeInterestRate(double finalValue,
                                      double principal,
                                      int numOfYears) {
        return (Math.pow(finalValue/principal,1/(double)numOfYears)-1);
    }

    static double computeNumOfYears(double finalValue,
                                    double principal,
                                    double interestRate) {
        /*REPLACE WITH YOUR CODE*/
        return 0.0;
    }

}
