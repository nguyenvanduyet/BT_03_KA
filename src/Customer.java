public class Customer {
    private String name;
    private int homeId;
    private String meterCode;

    public Customer(String name, int homeId, String meterCode) {
        this.name = name;
        this.homeId = homeId;
        this.meterCode = meterCode;
    }

    public String getMeterCode() {
        return meterCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", homeId=" + homeId +
                ", meterCode='" + meterCode + '\'' +
                '}';
    }
}

