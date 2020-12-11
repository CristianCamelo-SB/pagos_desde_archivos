package pagos.models;

public class Header {
    private final int recordsNumber;
    private final double totalValue;
    private final String payDate;
    private final String nit;

    public Header (int recordsNumber, double totalValue, String payDate, String nit){
        this.recordsNumber = recordsNumber;
        this.totalValue = totalValue;
        this.payDate = payDate;
        this.nit = nit;
    }

    public int getRecordsNumber (){
        return recordsNumber;
    }

    public double getTotalValue (){
        return totalValue;
    }

    public String getPayDate (){
        return payDate;
    }

    public String getNit (){
        return nit;
    }
}