package pagos.models;

import java.util.ArrayList;

public class PaymentFile {
    private final Header header;
    private final ArrayList<Record> records;

    public PaymentFile (Header header, ArrayList<Record> records){
        this.header = header;
        this.records = records;
    }

    public Header getHeader (){
        return header;
    }

    public ArrayList<Record> getRecords (){
        return records;
    }
}