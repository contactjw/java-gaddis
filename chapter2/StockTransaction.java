package chapter2;
public class StockTransaction
{
   public static void main(String[] args)
   {
      final int NUM_SHARES = 1000;          
      final double PURCHASE_PRICE = 32.87;  
      final double SELLING_PRICE = 33.92;   
      final double BROKER_COMM_RATE = 0.02; 
      
      
      double stockPurchase = (NUM_SHARES * PURCHASE_PRICE);

      double purchaseCommission = stockPurchase * BROKER_COMM_RATE;
      
      double amountPaid = stockPurchase + purchaseCommission;

      double stockSale = NUM_SHARES * SELLING_PRICE;
      
      double sellingCommission = (NUM_SHARES * SELLING_PRICE) *
                           BROKER_COMM_RATE;
      
      double amountRecieved = stockSale - sellingCommission;
      
      double profitOrLoss = amountRecieved - amountPaid;
      
      // Display the results.
      System.out.println("Joe paid: $" + stockPurchase);
      System.out.println("Joe paid his broker a commission of $" +
                         purchaseCommission);
      System.out.println("So, Joe paid a total of: $" +
                         amountPaid + "\n");
                       
      System.out.println("Joe sold the stock for: $" +
                         stockSale);
      System.out.println("Joe paid his broker a commission of: $" +
                         sellingCommission);
      System.out.println("So, Joe recieved a total of: $" +
                         amountRecieved + "\n");
      System.out.println("Joe's profit or loss: $" +
                         profitOrLoss);
   }
}
