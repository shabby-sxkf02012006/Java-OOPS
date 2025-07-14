package ebfmotors;
import java.util.Scanner;

public class Homepage {
     Cars car=new Cars();
        Scanner sc = new Scanner(System.in);
        int details;
        
        void HomePage(){
        //Variable Closed
        System.out.println("********************************");
        System.out.println("\nWelcome to EBF Motors \n");
        System.out.println("********************************");
        //for printing Models From Cars.java
        for(int i=0; i<5; i++){
            System.out.println(car.Models[i]);
        }
        System.out.print("Enter What you want (1-5) : " );
        
    }
}
