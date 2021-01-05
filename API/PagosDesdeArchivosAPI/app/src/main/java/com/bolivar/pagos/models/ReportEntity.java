package pagos.models;

public class ReportEntity {
    private final int id;
    private final String nit;
    private final String name;
    private final String address;
    private final double payment;

    public ReportEntity (int id, String nit, String name, String address, double payment){
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.payment = payment;
    }

    public int getId (){
        return id;
    }

    public String getNit (){
        return nit;
    }

    public String getName (){
        return name;
    }

    public String getAddress (){
        return address;
    }

    public double getPayment (){
        return payment;
    }
}