package pagos.models;

import java.util.ArrayList;
/*import java.com.bolivar.pagos.Models.PaymentInformation;
import java.com.bolivar.pagos.Models.ClientInformation;
import java.com.bolivar.pagos.Models.ClientWalletInformation;
import java.com.bolivar.pagos.Models.MonthlyBillInformation;*/

public class Record {
    private final PaymentInformation paymentInformation;
    private final ClientInformation clientInformation;
    private final ArrayList<Integer> clientWalletInformation;
    private final ArrayList<MonthlyBillInformation> monthlyBillsInformation;

    public Record (PaymentInformation paymentInformation, ClientInformation clientInformation, ArrayList<Integer> clientWalletInformation, ArrayList<MonthlyBillInformation> monthlyBillsInformation){
        this.paymentInformation = paymentInformation;
        this.clientInformation = clientInformation;
        this.clientWalletInformation = clientWalletInformation;
        this.monthlyBillsInformation = monthlyBillsInformation;
    }

    public PaymentInformation getPaymentInformation (){
        return paymentInformation;
    }

    public ClientInformation getClientInformation (){
        return clientInformation;
    }

    public ArrayList<Integer> getClientWalletInformation (){
        return clientWalletInformation;
    }

    public ArrayList<MonthlyBillInformation> getMonthlyBillsInformation (){
        return monthlyBillsInformation;
    }
}