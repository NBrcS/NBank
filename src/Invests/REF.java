package Invests;

public class REF{

    private static double box;
    private static double firstInvest;
    private static double yieldRate;
    private static double monthlyContribution;
    private static double totalInvest;
    private static double priceFI;
    private static int quotes;

    REF(){
        box = 0.0;
        firstInvest = 0.0;
        yieldRate = 0.0;
        monthlyContribution = 0.0;
        totalInvest = 0.0;
        priceFI = 0.0;
        quotes = 0;
    }

    public static void setFirstInvest(double firstInvest) {
        REF.firstInvest = firstInvest;
    }
    public static void setYieldRate(double yieldRate) {
        REF.yieldRate = yieldRate;
    }
    public static void setMonthlyContribution(double monthlyContribution) {
        REF.monthlyContribution = monthlyContribution;
    }
    public static void setPriceFI(double priceFI) {
        REF.priceFI = priceFI;
    }
    public static void setInitialQuotes(){
        quotes = (int)(firstInvest/ priceFI);
        box = firstInvest- (priceFI * quotes);

        totalInvest += firstInvest;
    }
    public static int getMagicNumber(){
        return ((int)(priceFI / yieldRate) + 1);
    }
    public static int getActualQuotes(){
        return quotes;
    }

    public static void atMonth(){
        int ofMonthQuotes;
        double ofMonthBox, localMonthlyContribution;

        localMonthlyContribution = (quotes * yieldRate) + monthlyContribution;
        ofMonthQuotes = (int)((localMonthlyContribution + box) / priceFI);
        quotes += ofMonthQuotes;

        ofMonthBox = localMonthlyContribution - (priceFI * ofMonthQuotes);
        box += ofMonthBox;

        if(box >= priceFI){
            int ofBoxQuotes;

            ofBoxQuotes = (int)(box / priceFI);
            quotes += ofBoxQuotes;

            box = box - (priceFI * ofBoxQuotes);
        }

        totalInvest += monthlyContribution;
    }

    public static void printInvest(){
        System.out.print("Total invested: " + totalInvest + "\n");
        System.out.print("Total generated: " + quotes * priceFI + "\n");
        System.out.print("Profit: " + ((quotes * priceFI) - totalInvest) + "\n\n");

        System.out.print("Quotes: " + quotes + "\n");
        System.out.print("Actual monthly yield: " + (quotes * yieldRate) + "\n");
    }

}


