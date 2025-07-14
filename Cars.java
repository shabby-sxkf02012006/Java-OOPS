package ebfmotors;

import java.util.Scanner;

public class Cars {
    //Variables 
    
    String Models[] = {"1.Mushtang" , "2.Toyota" , "3.Nissan", "4.Alpha" , "5.Bugati "};
    Scanner sc=new Scanner(System.in);
    //Variables Closed ;

    void Mushtang(){
        String Choice;
        String avl_model="\n\n**********\nMushtang GT 2000R";
        String specs="*********\nEngine : 3000T\nYear: 2014 , 2018\nManuactured in:Japan\nPrice:1.5M PKR\nIntrested to grab this Deal\n*****************";
        String Done ="Congratulations You have successfully own the car";
        String cancel="Payment Has been Declined";
        System.out.println(avl_model);
        System.out.println(specs);
        System.out.println("Y for (Yes)\nN for(No)\nE for (Exit)");
        System.out.print("Enter Your choice : ");
        Choice=sc.next();
        

        switch (Choice) {
            case "n" , "N":
                System.out.println(cancel);
                break;

             case "y" , "Y":
                System.out.println(Done);
                break;
            case "e" , "E":
            System.err.println("Exiting to home screen ....");
                System.exit(1);
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }

    }
    void Toyota(){
        String Choice;
        String avl_model="\n\n**********\nToyota GT-3";
        String specs="*********\nEngine : R20C\nYear: 2014 , 2018\nManuactured in:Japan\nPrice: 2M - 2.8M PKR\nIntrested to grab this Deal\n*****************";
        String Done ="Congratulations You have successfully own the car";
        String cancel="Payment Has been Declined";
        System.out.println(avl_model);
        System.out.println(specs);
        System.out.println("Y for (Yes)\nN for(No)");
        System.out.print("Enter Your choice : ");
        Choice=sc.next();

        switch (Choice) {
            case "n":
                System.out.println(cancel);
                break;
            case "y":
                System.out.println(Done);
                break;
             case "e" , "E":
            System.err.println("Exiting to home screen ....");
                System.exit(1);
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
        sc.close();
    }
    void Nissan(){
        String Choice;
        String avl_model="\n\n**********\nKIA -Nissan E-3";
        String specs="*********\nEngine : R20CR32\nYear: 2014 , 2018\nManuactured in:Japan\nPrice: 4M - 8M PKR\nIntrested to grab this Deal\n*****************";
        String Done ="Congratulations You have successfully own the car";
        String cancel="Payment Has been Declined";
        System.out.println(avl_model);
        System.out.println(specs);
        System.out.println("Y for (Yes)\nN for(No)");
        System.out.print("Enter Your choice : ");
        Choice=sc.next();

        switch (Choice) {
            case "n":
                System.out.println(cancel);
                break;
            case "y":
                System.out.println(Done);
                break;
             case "e" , "E":
                System.out.println("Exiting to home screen ....");
                System.exit(1);
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
}
}

