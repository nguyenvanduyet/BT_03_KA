import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ManageReceipt {
    Map<String,Receipt>listReceipt= new TreeMap();
    Set<String>keyList=listReceipt.keySet();
    public void addCustomer(String meterCode,Receipt receipt){
        listReceipt.put(meterCode,receipt);
    }
    public void displayAll(){
        for (String key: keyList) {
            System.out.println(listReceipt.get(key));
        }
    }
    public void amountToBePaid(String meterCode){
        for (String key: keyList) {
            if (meterCode.equalsIgnoreCase(listReceipt.get(key).getCustomer().getMeterCode())){
                System.out.println(listReceipt.get(key));
                System.out.println(listReceipt.get(key).payTheBill());
                return;
            }
        }
        System.out.println("exit");

    }
}
