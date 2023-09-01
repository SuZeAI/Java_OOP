import java.util.Scanner;
import java.lang.Math;

class Invoice{
    
}
class PaymentController{
    
    public Invoice getInvoice(){
        return new Invoice();
    }
}
class InvoiceView{
    static public void show(Invoice invoice){

    }
}
public class hocphi {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
