import java.text.SimpleDateFormat;
import java.util.Date;
public class ContaPoupanca extends Conta {

    private String getsaldo;

    public void imprimeExtrato(){
        System.out.println("### Extrato da Conta ###");

        SimpleDateFormat sdf = new SimpleDateFormat(" dd/mm/aaaa/HH:mm:ss");
        Date date= new Date();

        System.out.println("Saldo: " +this.getsaldo());
        System.out.println("Data: "+sdf.format(date));
    }
}
