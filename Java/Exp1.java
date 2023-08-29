import java.util.Scanner;
class Invoice
{
   String part_number;
   String part_description;
   int quantity;
   double price_item;
   public double total=0;
    
   Invoice()
   {
    String part_number="";
   String part_description="";
   int quantity=0;
   double price_item=0.0;
   }
   public String getPart_number(){
       return part_number;
   }
   public void setPart_number(String part_number){
        this.part_number=part_number;
   }
   public String getPart_description(){
       return part_description;
   }
   public void setPart_description(String part_description){
        this.part_description=part_description;
   }
   public int getQuantity(){
       return quantity;
   }
   public void setQuantity(int quantity){
        if(quantity<0)
            quantity=0;
        else
            this.quantity=quantity;
   }
   public double getPrice_item(){
       return price_item;
   }
   public void setPrice_item(double price_item){
        if(price_item<0)
            price_item=0.0;
        else
            this.price_item=price_item;
   }
   double getInvoiceAmount(){
   total=total+getQuantity()*getPrice_item();
       return total;
   }
}
 public class Exp1{
           public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
            Invoice iv=new Invoice();
            System.out.print("Enter part number:");
            iv.setPart_number(sc.nextLine());
            System.out.print("Enter part description:");
            iv.setPart_description(sc.nextLine());
            System.out.print("Enter no. of items purchased:");
            iv.setQuantity(sc.nextInt());
            System.out.print("Enter price per item:");
            iv.setPrice_item(sc.nextDouble());
            System.out.println("Item Details");
            System.out.println("Part number:"+iv.getPart_number());
            System.out.println("Part description:"+iv.getPart_description());
            System.out.println("Part description:"+iv.getPart_description());
            System.out.println("Quantity:"+iv.getQuantity());
            System.out.println("Total Billing Amount:"+iv.getInvoiceAmount());   
           }
   }
    
