import java.util.Scanner;
class ElectricityBill{
    String consumer_number;
    String consumer_name;
    double previous_month_reading;
    double current_month_reading;
    double amount;
    String type;
    
    ElectricityBill()
    {
    String consumer_number="";
    String consumer_name="";
    double previous_month_reading=0.0;
    double current_month_reading=0.0;
    String type="";
    }
    void getBillDetails(){
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter consumer number:");
       consumer_number=sc.nextLine();
        System.out.print("Enter consumer name:");
       consumer_name=sc.nextLine();
        System.out.print("Enter previous mounth reading:");
       previous_month_reading=sc.nextDouble();
        System.out.print("Enter current mounth reading:");
       current_month_reading=sc.nextDouble();
        System.out.print("Enter type:");
        type=sc.next();
    }
    void cal_amount(){
    double units;
        units=current_month_reading-previous_month_reading;
        if(type.equals("d")){
           if(units<=100)
              amount=units*1;
           else if(units<=200)
              amount=100+(units-100)*2.50;
           else if(units<=500)
               amount=100+250+(units-200)*4;
           else
               amount=100+250+1200+(units-500)*6;
        }
        else{
        if(units<=100)
              amount=units*2;
           else if(units<=200)
              amount=200+(units-100)*4.50;
           else if(units<=500)
               amount=200+450+(units-200)*6;
           else
               amount=200+450+1800+(units-500)*7;
        }
    }
    void showBillDetails(){
       System.out.println("consumer number:"+consumer_number);
        System.out.println("consumer name:"+consumer_name);
        if(type.equals("d"))
                     System.out.println("type=domestic");
        else
                    System.out.println("type=commercial");
 
        System.out.println("previous mounth reading:"+previous_month_reading);
        System.out.println("current mounth reading:"+current_month_reading);
        System.out.println("Electricity Bill:"+amount);
    }       
    
}
public class Exp2{
        public static void main(String args[]){
        ElectricityBill e=new ElectricityBill();
            e.getBillDetails();
            e.cal_amount();
            e.showBillDetails();
        }
}                                        