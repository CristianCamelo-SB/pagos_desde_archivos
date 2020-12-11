package pagos.models;

public class PaymentInformation {
    private final String payDate;
    private final int billNumber;
    private final double totalPayment;
    private final String wayToPay;

    public PaymentInformation (String payDate, int billNumber, double totalPayment, String wayToPay){
        this.payDate = payDate;
        this.billNumber = billNumber;
        this.totalPayment = totalPayment;
        this.wayToPay = wayToPay;
    }

    public String getPayDate (){
        return payDate;
    }

    public int getBillNumber (){
        return billNumber;
    }

    public double getTotalPayment (){
        return totalPayment;
    }

    public String getWayToPay (){
        return wayToPay;
    }
}