package Com.BookStore;

import java.util.Scanner;

public class BookStoreApp {

	 
	    int Java= 325;
	    int MultiMedia = 220;
	    int Datastucture = 275;
	    int Phython = 300;

	    int ch;
	    int quantity;
	    static int total;
	    String again;

	    Scanner sc = new Scanner(System.in);

	    public void displayMenu() {
	        System.out.println("**************** Welcome To our BookStore ****************");
	        System.out.println("=====================================================");
	        System.out.println("           1.Java                     100/-");
	        System.out.println("           2.Multimedia               120/-");
	        System.out.println("           3.DataStructure            100/-");
	        System.out.println("           4.Phython                   80/-");
	        System.out.println("           5.Exit                          ");
	        System.out.println("======================================================");
	        System.out.println("          Which Book Do u want ??");
	    }// Our Food Menu is ready

	    // let's create a method to oreder a food item
	    // I'am using Swich case for this

	    //we need a method to generate bill
	    public void generateBill()
	    {
	        System.out.println();
	        System.out.println("***************** Thankyou for ordering ******************");
	        System.out.println("****************Your Bill is : " +total+"*****************");
	    }

	    public void order() {
	        while (true) {
	            System.out.print("Enter Your Choice ");
	            ch = sc.nextInt();
	            switch (ch) {
	                case 1:
	                    System.out.println("You have Selected Java Book");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total =  quantity * Java;

	                    break;

	                case 2:
	                    System.out.println("You have Selected  Multimedia");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = quantity * MultiMedia;

	                    break;

	                case 3:
	                    System.out.println("You have Selected DataStructure");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total =  quantity *Datastucture;

	                    break;
	                case 4:
	                    System.out.println("You have Selected Phython");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total =  quantity * Phython;

	                    break;
	                

	                case 5:// exit
	                    System.exit(1);
	                    break;

	                default:
	                    break;
	            }
	       
	            System.out.println();
	            System.out.print("Do you wish to order anything else (Y/N) : ");
	            again = sc.next();
	            if(again.equalsIgnoreCase("Y"))
	            {
	            	order();
	            	}
	            else if(again.equalsIgnoreCase("N"))
	            {
	            	generateBill();
	            	System.exit(1);
	            }
	            else{System.out.println("Invalid Choice");}
	        }
	    }
	}


