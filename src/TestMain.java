import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);
    static ManageReceipt manageReceipt=new ManageReceipt();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. add receipt");
            System.out.println("2. display all");
            System.out.println("3. pay the bill");
            System.out.println("0. exit");
            System.out.println("nhập choice");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số khách hàng");
                    int number=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addReceipt();
                    }
                    break;
                case 2:
                    manageReceipt.displayAll();
                    break;
                case 3:
                    amountPaid();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        } while (choice != 0);

    }
    public static void addReceipt(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập tên");
        String name=sc.nextLine();
        System.out.println("nhập số nhà");
        int homeId=Integer.parseInt(sc1.nextLine());
        System.out.println("nhập mã công tơ điện");
        String meterCode=sc.nextLine();
        System.out.println("nhập số điện cũ");
        int oldNumber=Integer.parseInt(sc1.nextLine());
        System.out.println("nhập số điện mới");
        int newNumber=Integer.parseInt(sc.nextLine());
        Customer customer =new Customer(name,homeId,meterCode);
        Receipt receipt=new Receipt(customer,oldNumber,newNumber);
        manageReceipt.addCustomer(meterCode,receipt);
    }
    public  static void amountPaid(){
        System.out.println("nhập số công tơ");
        String meterCode=sc.nextLine();
        manageReceipt.amountToBePaid(meterCode);
    }

}
