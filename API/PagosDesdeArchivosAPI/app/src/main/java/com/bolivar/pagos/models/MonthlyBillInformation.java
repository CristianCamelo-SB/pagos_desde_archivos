package pagos.models;

public class MonthlyBillInformation {
    private final int billNumber;
    private final String monthBilled;
    private final double billedValue;
    private final double paidValue;

    public MonthlyBillInformation (int billNumber, String monthBilled, double billedValue, double paidValue){
        this.billNumber = billNumber;
        this.monthBilled = monthBilled;
        this.billedValue = billedValue;
        this.paidValue = paidValue;
    }

    public int getBillNumber (){
        return billNumber;
    }

    public String getMonthBilled (){
        return monthBilled;
    }

    public double getBilledValue (){
        return billedValue;
    }

    public double getPaidValue (){
        return paidValue;
    }
}