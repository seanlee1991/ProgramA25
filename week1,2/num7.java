public class num7 {
    public static void main(String[] args) {
        // Store details
        String storeName = "Your Store Name";
        String storeAddress = "123 Main St, Melbourne, VIC";
        String storeContact = "0123-456-789";

        // Items and prices
        String item1 = "Item 1";
        double price1 = 10.00;
        String item2 = "Item 2";
        double price2 = 20.00;
        String item3 = "Item 3";
        double price3 = 30.00;

        // Calculate total price
        double totalPrice = price1 + price2 + price3;

        // Calculate GST (10% of total price)
        double gst = totalPrice * 0.10;

        // Calculate total price including GST
        double totalPriceWithGST = totalPrice + gst;

        // Get current date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateTime = dtf.format(LocalDateTime.now());

        // Print invoice
        System.out.println("=======================================");
        System.out.println("           " + storeName);
        System.out.println("           " + storeAddress);
        System.out.println("           " + storeContact);
        System.out.println("=======================================");
        System.out.println("              TAX INVOICE");
        System.out.println("Date and Time: " + dateTime);
        System.out.println("---------------------------------------");
        System.out.println("Item                Price");
        System.out.println(item1 + "            $" + price1);
        System.out.println(item2 + "            $" + price2);
        System.out.println(item3 + "            $" + price3);
        System.out.println("---------------------------------------");
        System.out.println("Total Price:        $" + totalPrice);
        System.out.println("GST (10%):          $" + gst);
        System.out.println("Total Price (incl. GST): $" + totalPriceWithGST);
        System.out.println("=======================================");
    }
}