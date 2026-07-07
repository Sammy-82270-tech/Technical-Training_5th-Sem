import java.util.Scanner;

public class LinearSearchTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products in the store: ");
        int n = sc.nextInt();

        String [] P_name = new String[n];
        double [] P_price = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Product " +(i+1)+ " Name: " );
            P_name[i] = sc.next();
            System.out.print("Product " +(i+1)+ " Price: " );
            P_price[i] = sc.nextDouble();
            System.out.println();
        }

        System.out.println("Enter the name of the product to search:");
        String P_search = sc.next();

        for (int i = 0; i < n; i++) {
            if (P_name[i].equals(P_search)){
                System.out.println(P_search + " is found at index "+i+" with a price of  $"+P_price[i]+".");
            }
            else{
                System.out.println("Item Not Avilable...");
            }
        }   

        sc.close();
    }
    
} 