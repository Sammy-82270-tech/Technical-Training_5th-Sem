import java.util.*;

public class Q1_PizzaBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice of Pizza [1.Normal / 2. Deluxe]: ");
        int CHOICE = sc.nextInt();

        // Add-on charges
        double Extra_Cheese = 100.00;
        double Extra_Topping = 100.00;
        double Water_Bottle = 20.00;
        double Ketchup_Packets = 5.00;   
        double Soft_Drinks = 75.00;
        double Carry_Bag = 20.00;

        double Total_Bill = 0;

        // Pizza selection

        // NORMAL PIZZA
        if (CHOICE == 1) {
            System.out.println("---NORMAL PIZZA ADDED--");
            int veg_pizza_price = 300;
            int non_veg_pizza_price = 400;

            System.out.print("Enter your Option [1.Veg / 2. Non-veg]: ");
            int Veg_Non_Veg_Choice = sc.nextInt();

            if (Veg_Non_Veg_Choice == 1) {
                Total_Bill += veg_pizza_price;
            } else if (Veg_Non_Veg_Choice == 2) {
                Total_Bill += non_veg_pizza_price;
            } else {
                System.out.println("PLEASE ENTER THE VALID CHOICE...");
            }

        // DELUXE PIZZA
        } else if (CHOICE == 2) {
            System.out.println("---DELUXE PIZZA ADDED--");
            int veg_pizza_price = 600;
            int non_veg_pizza_price = 800;

            System.out.print("Enter your Option [1.Veg / 2. Non-veg]: ");
            int Veg_Non_Veg_Choice = sc.nextInt();

            if (Veg_Non_Veg_Choice == 1) {
                Total_Bill += veg_pizza_price;
            } else if (Veg_Non_Veg_Choice == 2) {
                Total_Bill += non_veg_pizza_price;
            } else {
                System.out.println("PLEASE ENTER THE VALID CHOICE...");
            }
        } else {
            System.out.println("PLEASE ENTER THE VALID CHOICE...");
        }

        System.out.println();

        // Extra Cheese
        System.out.print("Do you want extra Cheese? [1.Yes / 2.No]: ");
        int cheese_choice = sc.nextInt();
        if (cheese_choice == 1) {
            System.out.println("Extra Cheese added");
            Total_Bill += Extra_Cheese;
        }

        // Extra Toppings
        System.out.print("Do you want extra Toppings? [1.Yes / 2.No]: ");
        int toppings_choice = sc.nextInt();
        if (toppings_choice == 1) {
            System.out.println("Extra Toppings added");
            Total_Bill += Extra_Topping;
        }

        // Water Bottle
        System.out.print("Do you want Water Bottle? [1.Yes / 2.No]: ");
        int water_choice = sc.nextInt();
        int bottle_no = 0;
        if (water_choice == 1) {
            System.out.print("How many bottles?: ");
            bottle_no = sc.nextInt();
            Total_Bill += bottle_no * Water_Bottle;
            System.out.println(bottle_no + " Water bottles added");
        }

        // Ketchup Packets
        System.out.print("Do you want Ketchup Packets? [1.Yes / 2.No]: ");
        int ketchup_choice = sc.nextInt();
        int packet_no = 0;
        if (ketchup_choice == 1) {
            System.out.print("How many packets?: ");
            packet_no = sc.nextInt();
            Total_Bill += packet_no * Ketchup_Packets;
            System.out.println(packet_no + " Ketchup packets added");
        }

        // Soft Drinks
        System.out.print("Do you want Soft Drinks? [1.Yes / 2.No]: ");
        int drink_choice = sc.nextInt();
        int cans_no = 0;
        if (drink_choice == 1) {
            System.out.print("How many cans?: ");
            cans_no = sc.nextInt();
            Total_Bill += cans_no * Soft_Drinks;
            System.out.println(cans_no + " cans added");
        }

        // Take Away
        System.out.print("Is it Take Away? [1.Yes / 2.No]: ");
        int takeaway_choice = sc.nextInt();
        if (takeaway_choice == 1) {
            System.out.println("CarryBag added");
            Total_Bill += Carry_Bag;
        }

        // GST
        double GST = Total_Bill * 0.18;
        double Net_Amount = Total_Bill + GST;

        // Discount
        double discount = 0;
        if (Net_Amount > 5000) discount = Net_Amount * 0.20;
        else if (Net_Amount > 3000) discount = Net_Amount * 0.12;
        else if (Net_Amount > 2000) discount = Net_Amount * 0.10;
        else if (Net_Amount > 1000) discount = Net_Amount * 0.05;

        double Final_Amount = Net_Amount - discount;

        // Bill Number
        int billNo = (int)(Math.random() * 100000);

        // Print Bill
        System.out.println("\n************** Pizza Bill **************");
        System.out.println("Bill Number: " + billNo);
        System.out.println("Date: " + new Date());
        System.out.println("----------------------------------------");

        System.out.println("Pizza Base Price: " + (Total_Bill - (Extra_Cheese + Extra_Topping + bottle_no*Water_Bottle + packet_no*Ketchup_Packets + cans_no*Soft_Drinks + (takeaway_choice==1?Carry_Bag:0))));

        if (cheese_choice == 1) System.out.println("Extra Cheese: " + Extra_Cheese);
        if (toppings_choice == 1) System.out.println("Extra Toppings: " + Extra_Topping);
        if (bottle_no > 0) System.out.println("Water Bottle - " + bottle_no + " Nos: " + (bottle_no*Water_Bottle));
        if (packet_no > 0) System.out.println("Ketchup Packets - " + packet_no + " Nos: " + (packet_no*Ketchup_Packets));
        if (cans_no > 0) System.out.println("SoftDrink Cans - " + cans_no + " Nos: " + (cans_no*Soft_Drinks));
        if (takeaway_choice == 1) System.out.println("Take Away - CarryBag Charges: " + Carry_Bag);


        System.out.println("----------------------------------------");
        System.out.println("Total Amount: " + Total_Bill);
        System.out.println("(+) GST @ 18%: " + GST);
        System.out.println("----------------------------------------");
        System.out.println("Net Amount: " + Net_Amount);
        System.out.println("(-) Discount: " + discount);
        System.out.println("----------------------------------------");
        System.out.println("Net Amount Payable: " + Final_Amount);
        System.out.println("****************************************");
    }
}
